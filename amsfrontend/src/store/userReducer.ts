import { userActionTypes } from "./userActions";

export interface UserState {
    username: string | null,
    loggedIn: boolean
}
export const initialUserState: UserState = {
    username: '',
    loggedIn: false
}
const userReducer = (state: UserState = initialUserState, action: any) => {
    switch(action.type) {
        case userActionTypes.loginSuccess:
            return {username: action.payload.username, loggedIn: true}
        case userActionTypes.logout:
            return {username: '', loggedIn: false}
        default:
            return state;
    }
}

export default userReducer;
