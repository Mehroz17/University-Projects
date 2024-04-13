// App.js
import React, { useEffect, useState } from "react";
import { NavigationContainer } from "@react-navigation/native";
import { createStackNavigator } from "@react-navigation/stack";

import LoginScreen from "./screens/LoginScreen";
import SignUpScreen from "./screens/SignUpScreen";
import MainScreen from "./screens/MainScreen";
import CanvasRender from "./screens/CanvasRender";

import { firebase } from "./config";
import Database from "./utils/Database";

const Stack = createStackNavigator();

const App = () => {
  const temp = false;
  var user = null;
  return (
    <NavigationContainer>
      <Stack.Navigator screenOptions={{ headerShown: false }}>
        <Stack.Screen name="Login" component={LoginScreen} />
        <Stack.Screen name="SignUp" component={SignUpScreen} />
        <Stack.Screen name="Main" component={MainScreen} />
        <Stack.Screen name="Canvas" component={CanvasRender} />
      </Stack.Navigator>
    </NavigationContainer>
  );
};

export default App;
