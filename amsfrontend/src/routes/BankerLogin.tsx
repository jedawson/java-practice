import { SyntheticEvent, useState } from "react";
import { useForm } from "react-hook-form";

export interface Input {
    username: any;
    password: any;
}

type FormValues = {
    username: string;
    password: string;
}

const BankerLogin = () => {
    const [input, setInput] = useState<Input>({username: '', password: ''})
    const {register, handleSubmit } = useForm<FormValues>();

    const handleInput = (e: SyntheticEvent) => {
        let newInput = { ...input};

        if ((e.target as HTMLInputElement).name === "username") {
            newInput.username = (e.target as HTMLInputElement).value;
            setInput(newInput);
        } else if ((e.target as HTMLInputElement).name === "password") {
            newInput.password = (e.target as HTMLInputElement).value;
            setInput(newInput);
        }
    }
    return (
        <div id="loginForm">
            <h1>If you are a banker, please login. If not, go back.</h1>
            <form>
                <input 
                    name="username"
                    type="text"
                    placeholder="Username"
                    value={input.username}
                    onChange={handleInput}
                    />
                <input 
                    name="password"
                    type="password"
                    placeholder="Password"
                    onChange={handleInput}
                    />
                <button type="submit">Login</button>
            </form>
            
        </div>
        
    )
}

export default BankerLogin;