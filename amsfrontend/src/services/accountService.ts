import axios from "axios";
import Users from "../models/Users";
import { CreateUserInput } from "../routes/BankerCreateCustomer";
import { AccountAction, foundPan } from "../store/accountActions";

class AccountService {
    private URI: string;
    constructor() {
        this.URI = 'http://localhost:8080'
    }

    lookupPan(panInput: string) {
        return (dispatch: (action: AccountAction) => void) => {
            return axios.get(`${this.URI}/accounts/${panInput}`)
                .then(response => {
                    if (response.status === 200) {
                        dispatch(foundPan(response.data))
                    }
                })
        }
    }
    createUser(input: CreateUserInput) {
        return (dispatch: (action: AccountAction) => void) => {
            return axios.post(`${this.URI}/accounts`, input)
                .then(response => {
                    if (response.status === 200) {
                        console.log(response.data)
                    }
                })
        } 
    }
}

export default new AccountService();