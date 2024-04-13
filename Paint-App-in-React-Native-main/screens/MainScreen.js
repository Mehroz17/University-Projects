import { FlatList } from "react-native-gesture-handler";
import styles from "../utils/styles";
import { Button, Text, TouchableOpacity, View, Image } from "react-native";
import { useState } from "react";
import Database from "../utils/Database";

import LinearGradient from 'react-native-linear-gradient';

export default function MainScreen({ navigation, route }) {
  const userInfo = route.params;
  console.log(route.params);

  const [drawings, setDrawings] = useState([
    { key: 1, title: "Drawing 1", path: "coming soon1" },
    { key: 2, title: "Drawing 2", path: "coming soon2" },
    { key: 3, title: "Drawing 3", path: "coming soon3" },
    { key: 4, title: "Drawing 4", path: "coming soon4" },
  ]);

  const handleNewPress = () => {
    const id = drawings.length + 1;
    const newDrawings = [
      ...drawings,
      { key: id, title: "Drawing 4", path: "coming soon4" },
    ];
    setDrawings(newDrawings);
  };

  const handleSignout = () => {
    Database.signout(() => {
      navigation.replace("Login");
    });
  };

  return (
    <View style={[styles.container, { backgroundColor: "#427D9D" }]}>
      <View
        style={[
          styles.horizontal,
          styles.justifyCenter,
          {
            paddingHorizontal: 15,
            backgroundColor: "#eaf2ff",
            paddingBottom: 10,
            paddingTop: 30,
            borderBottomLeftRadius: 25,
            borderBottomRightRadius: 25,
          },
        ]}
      >
        <TouchableOpacity
          style={[styles.menuButton, { backgroundColor: "lightgreen" }]}
          onPress={() => {
            handleNewPress();
          }}
        >
          <Text style={{ fontSize: 20 }}>➕</Text>
        </TouchableOpacity>
        <Image
          style={styles.logo}
          source={require("../assets/genDrawLogo.jpeg")}
        />
        <TouchableOpacity
          style={[
            styles.center,
            styles.menuButton,
            { backgroundColor: "lightpink" },
          ]}
          onPress={() => {
            handleSignout();
          }}
        >
          <Text style={[styles.center, { fontSize: 15, fontWeight: "bold" }]}>
            Logout
          </Text>
        </TouchableOpacity>
      </View>
      <FlatList
        keyExtractor={(item) => item.key.toString()}
        data={drawings}
        renderItem={({ item }) => (
          <TouchableOpacity
            style={[
              styles.card,
              { minHeight: 100, flexDirection: "row", alignItems: "center" },
            ]}
            onPress={() => {
              navigation.navigate("Canvas", userInfo);
            }}
          >
            {/* Image on the left */}
            <Image
              style={{
                width: 80,
                height: 80,
                marginRight: 10,
                borderWidth: 2,
                borderColor: "black",
                borderRadius: 10,
              }}
              source={require("../assets/genDrawLogo.jpeg")}
            />
            <View>
              <Text style={{ color: "black", fontSize: 18 }}>{item.title}</Text>
              <Text style={{ color: "gray", fontSize: 14 }}>{item.path}</Text>
            </View>
          </TouchableOpacity>
        )}
      />
    </View>
  );
}
