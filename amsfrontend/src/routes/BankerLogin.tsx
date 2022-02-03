import { useState } from "react";

export interface Input {
    username: any;
    password: any;
}

const BankerLogin = () => {
    const [input, setInput] = useState<Input>({username: '', password: ''})
    return (
        <div id="loginForm">
            <h1>If you are a banker, please login. If not, go back.</h1>
            <form>
                <input 
                    name="username"
                    type="text"
                    placeholder="Username"
                    value={input.username}
                    />
                <input 
                    name="password"
                    type="password"
                    placeholder="Password"
                    />
                <button type="submit">Login</button>
            </form>
            
        </div>
        
    )
}

export default BankerLogin;