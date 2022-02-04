import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import LandingPage from './routes/LandingPage';
import BankerLogin from './routes/BankerLogin';
import { Provider } from 'react-redux';
import store from './store/store';
import BankerAdmin from './routes/BankerAdmin';
import BankerPanLookup from './routes/BankerPanLookup';
import BankerCreateCustomer from './routes/BankerCreateCustomer';
import ClientLogin from './routes/ClientLogin';
import ClientAdmin from './routes/ClientAdmin';

ReactDOM.render(
  <React.StrictMode>
    <Provider store={store}>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<App />} />
          <Route path="landing" element={<LandingPage />} />
          <Route path="bankerLogin" element={<BankerLogin />} />
          <Route path="bankerAdmin" element={<BankerAdmin />} />
          <Route path="bankerPanLookup" element={<BankerPanLookup />} />
          <Route path="bankerCreateCustomer" element={<BankerCreateCustomer />} />
          <Route path="clientLogin" element={<ClientLogin />} />
          <Route path="clientAdmin" element={<ClientAdmin />} />
        </Routes>
      </BrowserRouter>
    </Provider>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
