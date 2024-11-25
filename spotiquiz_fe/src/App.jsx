import logo from './logo.svg';
import './App.css';
import {Routes, Route} from 'react-router-dom';
import {Home, Login} from './Pages';

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path={"/"} element={<Home/>}/>
        <Route path={"/login"} element={<Login/>}/>
      </Routes>
    </div>
  );
}

export default App;
