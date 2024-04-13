import AsyncStorage from "@react-native-async-storage/async-storage";

class Database {

    static async _getUsers() {
        const users = await AsyncStorage.getItem("users");
        return JSON.parse(users) || [];
    }

    static async _setUsers(users) {
        AsyncStorage.setItem("users", JSON.stringify(users));
    }

    static _findUser(users, username) {
        return users.find(user => user.username == username);
    }

    static async addUser(newUser, onComplete) {
        try {
            
            const users = await this._getUsers();
            const user = this._findUser(users, newUser.username);
            if (user){
                onComplete("User already exists!"+user)
                return;
            }

            users.push(newUser); 

            // Store the updated user array in AsyncStorage
            await this._setUsers(users);
            onComplete("ok");
        } catch (error) {
            onComplete("Failed to register!"+error.message);
        }
    }

    static async signinUser(userInfo) {
        await AsyncStorage.setItem("signedInUser", JSON.stringify(userInfo));
    }

    static async getSignedInUser(onComplete) {
        const signedInUser = await AsyncStorage.getItem("signedInUser");
        const user = JSON.parse(signedInUser) || null;
        onComplete(user);
    }

    static async signout(onComplete) {
        await AsyncStorage.removeItem("signedInUser");
        onComplete();
    }

    static async saveUserInfo(userInfo) {
        var users = await this._getUsers();
        users = users.filter(u=> u.username != userInfo.username)
        users.push(userInfo);
        await AsyncStorage.setItem("signedInUser", JSON.stringify(userInfo));
        this._setUsers(users);
    }
}


export default Database;
