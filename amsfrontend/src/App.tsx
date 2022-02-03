import './App.css';
import { Link } from 'react-router-dom';

function App() {
  return (
    <div className="App">
      <Link to="/landing"> Landing Page </Link>
      <Link to="/bankerlogin"> Banker Login Page </Link>
    </div>
  );
}

export default App;
