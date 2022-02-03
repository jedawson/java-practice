import { SyntheticEvent, useState } from "react";
import { useForm } from "react-hook-form";
import { useDispatch } from "react-redux";
import userService from "../services/userService";

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
    const dispatch = useDispatch();

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
    const onSubmit = () => {
        dispatch(userService.login(input.username, input.password))
    }
    return (
        <div id="loginForm">
            <h1>If you are a banker, please login. If not, go back.</h1>
            <form onSubmit={handleSubmit(onSubmit)}>
                <input 
                    {...register("username")}
                    name="username"
                    type="text"
                    placeholder="Username"
                    value={input.username}
                    onChange={handleInput}
                    />
                <input 
                    {...register("password")}
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