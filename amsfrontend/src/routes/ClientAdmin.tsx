import { Link } from "react-router-dom";

const ClientAdmin = () => {
    return (
        <div id="clientAdmin">
            <h1>Welcome to the Client Admin Page.</h1>
            <br />
            <Link to={"/clientAccounts"} > View My Accounts</Link>
        </div>
    )
}
export default ClientAdmin;