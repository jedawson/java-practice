import { initialUserState, UserState } from "./userReducer";

export interface Appstate {
    userState: UserState
}

const intialState: Appstate = {
    userState: initialUserState
}