import Users from "../models/Users"

export interface AccountAction {
    type: accountActionTypes;
    payload?: Object;
}

export enum accountActionTypes {
    foundPan = "FOUND_PAN"
}

export const foundPan = (user: Users) => {
    return {
        type: accountActionTypes.foundPan,
        payload: user
    }
}