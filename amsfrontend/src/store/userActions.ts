export interface UserAction {
    type: userActionTypes;
    payload?: Object;
}

export enum userActionTypes {
    loginSuccess = "LOGIN_SUCCESS",
    logout = "LOGOUT_USER"
}

export const loginSuccess = (username: string, role: string) => {
    return {
        type: userActionTypes.loginSuccess,
        payload: {username, role}
    }
}

export const logoutUser = () => {
    return {
        type: userActionTypes.logout
    }
}