import { applyMiddleware, combineReducers, createStore } from "redux";
import thunk from "redux-thunk";
import logger from "redux-logger";
import userReducer from "./userReducer";

const store = createStore(combineReducers({
    userState: userReducer
}), applyMiddleware(thunk, logger))

export default store;
