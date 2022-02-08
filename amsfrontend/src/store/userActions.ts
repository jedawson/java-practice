export interface UserAction {
    type: userActionTypes;
    payload?: Object;
}

export enum userActionTypes {
    loginSuccess = "LOGIN_SUCCESS",
    loginBankerSuccess = "LOGIN_BANKER_SUCCESS",
    logout = "LOGOUT_USER"
}

export const loginSuccess = (username: string, role: string, pan: number) => {
    return {
        type: userActionTypes.loginSuccess,
        payload: {username, role, pan}
    }
}

export const loginBankerSuccess = (username: string, role: string) => {
    return {
        type: userActionTypes.loginBankerSuccess,
        payload: {username, role}
    }
}

export const logoutUser = () => {
    return {
        type: userActionTypes.logout
    }
}