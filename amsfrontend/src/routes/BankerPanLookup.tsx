import { SyntheticEvent, useState } from "react";
import { useForm } from "react-hook-form";
import { useDispatch } from "react-redux";
import accountService from "../services/accountService";

export interface Input {
    pan: any;
}

type FormValues = {
    pan: string;
}

const BankerPanLookup = () => {
    const [input, setInput] = useState<Input>({pan: ''})
    const {register, handleSubmit } = useForm<FormValues>();
    const dispatch = useDispatch();

    const handleInput = (e: SyntheticEvent) => {
        let newInput = { ...input};

        if ((e.target as HTMLInputElement).name === "pan") {
            newInput.pan = (e.target as HTMLInputElement).value;
            setInput(newInput);
        } 
    }
    const onSubmit = () => {
        dispatch(accountService.lookupPan(input.pan))
    }
    return (
        <div id="bankerPanLookup">
            <h1>Lookup Customer by PAN</h1>
            <form onSubmit={handleSubmit(onSubmit)}>
                <input 
                    {...register("pan")}
                    name="pan"
                    type="text"
                    placeholder="PAN"
                    value={input.pan}
                    onChange={handleInput}
                    />
                <button type="submit">Search </button>
            </form>
            <p></p>
        </div>
        
    )
}

export default BankerPanLookup