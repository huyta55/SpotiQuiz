import React from "react";
import './Home.css';
import { useNavigate } from 'react-router-dom';

const Home = () => {
    const navigate = useNavigate();
    return (
        <div className="home">
            <div className="intro">
                <h1>SpotiQuiz</h1>
                <h2>
                    Test your knowledge of your favorite songs!
                </h2>
            </div>
        </div>
    )
}
// comment

export default Home;
