import firebase from 'firebase/compat/app';
import 'firebase/compat/auth';
import 'firebase/compat/firestore';

const firebaseConfig = {
  apiKey: "AIzaSyAHAXYMqbloPFoVmhOX_DgjnxitlwRHNR4",
  authDomain: "userauth-58cc4.firebaseapp.com",
  projectId: "userauth-58cc4",
  storageBucket: "userauth-58cc4.appspot.com",
  messagingSenderId: "857291553149",
  appId: "1:857291553149:web:e35884aba6ec5567e43414",
  measurementId: "G-185LX403TC"
};
  
if(!firebase.apps.length){
    firebase.initializeApp(firebaseConfig);
}

export { firebase };