import { Link } from "react-router-dom";

const BankerAdmin = () => {
    return (
        <div id="bankerAdmin">
            <h1>Welcome to the Banker Admin Page.</h1>
            <Link to={"/bankerPanLookup"}>Search for account by PAN.</Link>
        </div>
    )
}
export default BankerAdmin;