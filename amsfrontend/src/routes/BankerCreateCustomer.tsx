import { SyntheticEvent, useState } from "react";
import { useForm } from "react-hook-form";
import { useDispatch, useSelector } from "react-redux";
import Users from "../models/Users";
import accountService from "../services/accountService";
import { AppState } from "../store/initialState";

export interface CreateUserInput {
    name: any;
    dateOfBirth: any;
    pan: any;
    citizenUniqueID: any;
    zipCode: any;
    email: any;
}

type FormValues = {
    name: string;
    dateOfBirth: Date;
    pan: string;
    citizenUniqueID: string;
    zipCode: string;
    email: string;
}

const BankerCreateCustomer = () => {
    const [input, setInput] = useState<CreateUserInput>({name: '', dateOfBirth: '', pan: '', citizenUniqueID: '', zipCode: '', email: ''})
    const {register, handleSubmit } = useForm<FormValues>();
    const dispatch = useDispatch();

    const handleInput = (e: SyntheticEvent) => {
        let target = e.target as HTMLInputElement
        let newInput = { ...input};

        if (target.name === "pan") {
            newInput.pan = (e.target as HTMLInputElement).value;
            setInput(newInput);
        } 
        switch ((e.target as HTMLInputElement).name) {
            case "name":
                newInput.name = target.value;
                setInput(newInput)
                break;
            case "dateOfBirth":
                newInput.dateOfBirth = target.value;
                setInput(newInput)
                break;
            case "pan":
                newInput.pan = target.value;
                setInput(newInput)
                break;
            case "citizenUniqueID":
                newInput.citizenUniqueID = target.value;
                setInput(newInput)
                break;
            case "zipCode":
                newInput.zipCode = target.value;
                setInput(newInput)
                break;
            case "email":
                newInput.email = target.value;
                setInput(newInput)
                break;
            default:
                break;
        }
    }
    const onSubmit = () => {
        dispatch(accountService.createUser(input))
    }
    return (
        <div id="bankerPanLookup">
            <h1>Create Customer</h1>
            <form onSubmit={handleSubmit(onSubmit)}>
                <input 
                    {...register("name")}
                    name="name"
                    type="text"
                    placeholder="Name"
                    value={input.name}
                    onChange={handleInput}
                    />
                <br />
                <input 
                    {...register("dateOfBirth")}
                    name="dateOfBirth"
                    type="date"
                    placeholder="1900-01-01"
                    value={input.dateOfBirth}
                    onChange={handleInput}
                    />
                <br />
                <input 
                    {...register("pan")}
                    name="pan"
                    type="text"
                    placeholder="PAN"
                    value={input.pan}
                    onChange={handleInput}
                    />
                <br />
                <input 
                    {...register("citizenUniqueID")}
                    name="citizenUniqueID"
                    type="text"
                    placeholder="Citizen Unique ID"
                    value={input.citizenUniqueID}
                    onChange={handleInput}
                    />
                <br />
                <input 
                    {...register("zipCode")}
                    name="zipCode"
                    type="text"
                    placeholder="Zip Code"
                    value={input.zipCode}
                    onChange={handleInput}
                    />
                <br />
                <input 
                    {...register("email")}
                    name="email"
                    type="text"
                    placeholder="Email"
                    value={input.email}
                    onChange={handleInput}
                    />
                <br />
                <button type="submit">ADD </button>
            </form>
            
        </div>
        
    )
}

export default BankerCreateCustomer