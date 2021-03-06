import './App.css';
import { Link } from 'react-router-dom';

function App() {
  return (
    <div className="App">
      <Link to="/landing"> Landing Page </Link>
      <br />
      <Link to="/bankerLogin"> Banker Login Page </Link>
      <br />
      <Link to="/bankerAdmin"> Banker Admin Page</Link>
      <br />
      <Link to="clientLogin">Client Login Page</Link>
      <br />
      <Link to="clientAdmin">Client Admin Page</Link>
    </div>
  );
}

export default App;
