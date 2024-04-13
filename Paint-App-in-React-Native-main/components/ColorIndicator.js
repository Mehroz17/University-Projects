import { useEffect, useRef, useState } from "react";
import { SafeAreaView, StyleSheet, TouchableOpacity, View } from "react-native";

const ColorIndicator = ({ color, size = 50, onPress }) => {

    const delta = 3;
    return (
        <TouchableOpacity style={[styles.centerCircle, { height: size, width: size }]}
            onPress={onPress}>
            <View style={[styles.centerCircle, { height: size, width: size, borderRadius: size / 2, backgroundColor: 'black', }]}>
            <View style={[styles.centerCircle, { height: size - delta, width: size - delta, borderRadius: (size - delta) / 2, backgroundColor: 'white' }]}>
                <View style={[styles.centerCircle, { height: size - delta * 3, width: size - delta * 3, borderRadius: (size - delta * 3) / 2, backgroundColor: 'black' }]}>
                    <View style={[styles.centerCircle, { height: size - delta * 4.5, width: size - delta * 4.5, borderRadius: (size - delta * 4.5) / 2, backgroundColor: color }]}>

                    </View>
                </View>
            </View>
        </View>
        </TouchableOpacity>
    );
}

const styles = StyleSheet.create({
    centerCircle: { display: 'flex', justifyContent: 'center', alignItems: 'center' }
});

export default ColorIndicator;