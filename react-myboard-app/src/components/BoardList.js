import axios from "axios";
import React, { useEffect, useState } from "react";

const BoardList = () => {
  const [boards, setBoards] = useState([]);

  const loadBoards = async () => {
    try {
      const response = await axios.get("http://localhost:8080/api/board/all");
      console.log(response.data);
      setBoards(response.data);
    } catch (error) {
      console.error("Error fetching boards: ", error);
    }
  };

  //컴포넌트가 마운트될 때 데이터를 불러오기
  useEffect(() => {
    loadBoards();
  }, []);

  return (
    <div>
      <h3>게시판 목록</h3>
      <ul>
        {boards.map((board) => (
          <li key={board.board_id}>
            ID : {board.board_id} <br />
            게시판 이름 : {board.board_name} <br />
            상태 : {board.status}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default BoardList;
