import Users from "../models/users";
import { accountActionTypes } from "./accountActions";

export interface AccountState {
    customers: Users | null
}

export const initialAccountState: AccountState = {
    customers: null
}

const accountReducer = (state: AccountState = initialAccountState, action: any) => {
    switch (action.type) {
        case accountActionTypes.foundPan:
            return {...state, customers: action.payload}
        default:
            return state;
    }
}

export default accountReducer;