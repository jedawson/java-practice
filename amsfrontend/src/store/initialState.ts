import { AccountState, initialAccountState } from "./accountReducer";
import { initialUserState, UserState } from "./userReducer";

export interface Appstate {
    userState: UserState,
    accountState: AccountState
}

const intialState: Appstate = {
    userState: initialUserState,
    accountState: initialAccountState
}