import { AccountState, initialAccountState } from "./accountReducer";
import { initialUserState, UserState } from "./userReducer";

export interface AppState {
    userState: UserState,
    accountState: AccountState
}

const intialState: AppState = {
    userState: initialUserState,
    accountState: initialAccountState
}