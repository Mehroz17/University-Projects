import { StyleSheet } from "react-native";
const styles = StyleSheet.create({
    container: {
        flex: 1,
    },

    horizontal: {
        flexDirection: 'row'
    },

    justifyCenter: {
        justifyContent: 'space-between'
    },

    center: {
        justifyContent: 'center',
        alignItems: 'center'
    },

    flexEnd: {
        justifyContent: 'flex-end'
    },

    absolute: {
        position: "absolute",
        top: 0,
        left: 0,
    }, 

    fullscreen: {
        width: '100%',
        height: '100%'
    },

    red: {
        backgroundColor: 'red'
    },

    card: {
        backgroundColor: 'white',
        borderRadius: 15,
        padding: 10, 
        marginVertical: 10,
        margin: 10
   
    },

    cardShadow:{
        shadowOffset: {width: -2, height: 4},
        shadowOpacity: 0.2,
        shadowRadius: 3,
        elevation: 50,
        shadowColor: '#171717'
    },
    
    topbarSpace: {
        marginTop: 35
    }, 
    canvasDefault: {
        width: '100%',
        height: '100%', 
        backgroundColor: 'transparent', 
        position: 'absolute' 
    },
    menuButton: {
        marginTop: 40,
        padding: 8,
        borderRadius: 5,
        backgroundColor: 'lightblue',
    },
    logo: {
        width: 60,
        height: 60,
        marginTop: 20,
        marginLeft: 20,
    },
    modal:{
        backgroundColor:'#427d9d',
        height:400,
        width:300,
        position:'absolute',
        bottom:"30%",
        left:'15%',
        borderRadius:10,
        alignItems:'center'
        
      },
      prompt:{
        width: 250,
        height: 70, 
        backgroundColor: 'white',
        
        padding:10,
        borderRadius:5,
        marginTop:5
     },
});

export default styles;