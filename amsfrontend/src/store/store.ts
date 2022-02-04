import { applyMiddleware, combineReducers, createStore } from "redux";
import thunk from "redux-thunk";
import logger from "redux-logger";
import userReducer from "./userReducer";
import accountReducer from "./accountReducer";

const store = createStore(combineReducers({
    userState: userReducer,
    accountState: accountReducer
}), applyMiddleware(thunk, logger))

export default store;
