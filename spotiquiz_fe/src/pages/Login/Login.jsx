import React, {useState} from "react";
import SpotifyLogo from "../../assets/logos/Spotiquiz_logo.png";
import {useNavigate} from "react-router-dom";
import './Login.css';

const Login = () => {
    const navigate = useNavigate();
    const [loginData, setLoginData] = useState({
        username: "",
        password: ""
    })

    const {username, password} = loginData;

    const onChange = e => {
        setLoginData({...loginData, [e.target.name]: [e.target.value]})
    }
    const onSubmit = e => {
        e.preventDefault();
        console.log(loginData.username, loginData.password)
    }

    return (
        <div className="Page">
            <div className="Navigation">
                <div className="Title">
                    <img src={SpotifyLogo} alt="Spotify Logo"/>
                    <h1>SpotiQuiz</h1>
                </div>
                <h3>Please log in to begin</h3>
                <form onSubmit={e => onSubmit(e)} className="LoginFields">
                    <div className="usernameBox">
                        <p>Username:</p>
                        <input
                            type="username"
                            name="username"
                            value={username}
                            onChange={e => onChange(e)}
                            required
                        />
                    </div>
                    <div className="passwordBox">
                        <p>Password:</p>
                        <input
                            type="password"
                            name="password"
                            value={password}
                            onChange={e => onChange(e)}
                            required
                        />
                    </div>
                    <button className="LoginButton" type="submit">Login</button>
                </form>

            </div>

        </div>
    )
}

export default Login;