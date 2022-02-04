import axios from "axios";
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
}

export default new AccountService();