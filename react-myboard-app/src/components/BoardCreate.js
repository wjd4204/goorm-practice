import axios from "axios";
import React, { useEffect, useState } from "react";
import ApiService from "../services/ApiService";
import {useNavigate} from "react-router-dom";

const BoardCreate = () => {
    const [boardName, setBoardName] = useState('');
    const navigate = useNavigate();

    const handleSubmit = async (e) => {
        try {
            const response = await ApiService.createBoard(boardName);
            console.log("게시판이 생성되었습니다 : ", response.data);
            navigate("/boards");
        } catch (error) {
            console.error("Error creating boards : ", error);
        }
    };

    return (
        <div className="container">
            <h3>게시판 생성</h3>
            <form onSubmit={handleSubmit}>
                <label>게시판 이름 : </label>
                <input
                    type="text"
                    value={boardName}
                    onChange={(e) => setBoardName(e.target.value)}
                    required
                />
                <button type="submit" className="small-button">
                    생성
                </button>
            </form>
        </div>
    );
}

export default BoardCreate;