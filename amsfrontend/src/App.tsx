import React from 'react';
import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Link, Route } from 'react-router-dom';
import LandingPage from './routes/LandingPage';

function App() {
  return (
    <div className="App">
      <Link to="/landing"> Landing Page </Link>
    </div>
  );
}

export default App;
