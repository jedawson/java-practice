import { userActionTypes } from "./userActions";

export interface UserState {
    username: string,
    loggedIn: boolean,
    role: string,
    id: number
}
export const initialUserState: UserState = {
    username: '',
    loggedIn: false,
    role: '',
    id: 0
}
const userReducer = (state: UserState = initialUserState, action: any) => {
    switch(action.type) {
        case userActionTypes.loginSuccess:
            return {username: action.payload.username, loggedIn: true, role: action.payload.role, id: action.payload.id}
        case userActionTypes.loginBankerSuccess:
            return {username: action.payload.username, loggedIn: true, role: action.payload.role}
        case userActionTypes.logout:
            return {username: '', loggedIn: false, role: '', pan: 0}
        default:
            return state;
    }
}

export default userReducer;
