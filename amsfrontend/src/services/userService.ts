import axios from "axios";
import { loginSuccess, UserAction } from "../store/userActions";

class UserService {
    private URI: string;
    constructor() {
        this.URI = 'http://localhost:8080'
    }

    login(usernameInput: string, passwordInput: string) {
        return (dispatch: (action: UserAction) => void) => {
            return axios.post(`${this.URI}/bankers`, {username: usernameInput, password: passwordInput})
                .then(response => {
                    if (response.status === 200) {
                        dispatch(loginSuccess(response.data.username, response.data.role))
                    }
                })
        }
    }

    loginClient(usernameInput: string, passwordInput: string) {
        return (dispatch: (action: UserAction) => void) => {
            return axios.post(`${this.URI}/clients`, {username: usernameInput, password: passwordInput})
                .then(response => {
                    if (response.status === 200) {
                        dispatch(loginSuccess(response.data.username, response.data.role))
                    }
                })
        }
    }
}

export default new UserService();