import React, { useState } from 'react';
import { View, Text, TextInput, TouchableOpacity, Alert, StyleSheet, Image } from 'react-native';
import { firebase } from '../config';
import Database from '../utils/Database';

const auth = firebase.auth();


const LoginScreen = ({ navigation }) => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  Database.getSignedInUser(userInfo => {
    if (userInfo) {
      navigation.replace('Main', userInfo)
    }
  });

  const fetchUserInfo = async () => {
    try {
      const user = auth.currentUser;
      if (user) {
        const firestore = firebase.firestore();
        const userDoc = await firestore.collection('users').doc(user.uid).get();
        const userData = userDoc.data();
        if (userData) {
          return userData;
        }
      }
    } catch (error) {
      console.error('Error fetching user information:', error.message);
      return null;
    }
    return null;
  };

  const handleLogin = async () => {
    try {
      await auth.signInWithEmailAndPassword(email, password);
      const userInfo = await fetchUserInfo();
      Database.signinUser(userInfo);
      navigation.navigate('Main', userInfo);
    } catch (error) {
      Alert.alert('Error', error.message);
    }
  };

  return (
    <View style={styles.container}>
      <Image
        style={styles.logo}
        source={require('../assets/genDrawLogo.jpeg')}
      />
      <View style={styles.titleContainer}>
        <Text style={styles.title}>Sign in Today and Start using</Text>
        <Text style={styles.logoText}>GenDrawing</Text>
      </View>
      <TextInput
        style={styles.input}
        placeholder="Email"
        onChangeText={(text) => setEmail(text)}
      />
      <TextInput
        style={styles.input}
        placeholder="Password"
        secureTextEntry
        onChangeText={(text) => setPassword(text)}
      />
      <TouchableOpacity
        style={[styles.button, { backgroundColor: '#3498db', marginTop: 30 }]}
        onPress={handleLogin}
      >
        <Text style={styles.buttonText}>Login</Text>
      </TouchableOpacity>
      <TouchableOpacity
        style={[styles.button, { backgroundColor: '#2ecc71', marginTop: 10 }]}
        onPress={() => navigation.navigate('SignUp')}
      >
        <Text style={styles.buttonText}>Register</Text>
      </TouchableOpacity>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    padding: 20,
    backgroundColor: '#eaf2ff',
  },
  input: {
    height: 40,
    width: '80%',
    borderColor: 'gray',
    borderWidth: 2,
    marginVertical: 10,
    padding: 10,
    borderRadius: 10,
  },
  button: {
    backgroundColor: '#3498db',
    padding: 10,
    borderRadius: 10,
    width: '80%',
    alignItems: 'center',
  },
  buttonText: {
    color: 'white',
    fontSize: 16,
  },
  logo: {
    width: 220,
    height: 220,
    marginVertical: 50,
  },
  titleContainer: {
    alignItems: 'center',
  },
  title: {
    fontSize: 20,
  },
  logoText: {
    fontSize: 50,
    fontWeight: 'bold',
    marginBottom: 30,
  },
});

export default LoginScreen;
