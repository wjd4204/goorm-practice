import React, { useState } from "react";
import ApiService from "../services/ApiService";
import { useNavigate } from "react-router-dom";

const PostCreate = () => {
  const [userName, setUserName] = useState("");
  const [password, setPassword] = useState("");
  const [email, setEmail] = useState("");
  const [title, setTitle] = useState("");
  const [content, setContent] = useState("");
  const navigate = useNavigate();

  const handleSubmit = async (e) => {
    e.preventDefault();
    const postData = {
      user_name: userName,
      password: password,
      email: email,
      title: title,
      content: content,
    };

    try {
      const response = await ApiService.createPost(postData);
      console.log("Post created successfully: ", response.data);
      navigate("/posts"); // 작성 완료 후 게시글 목록 페이지로 이동
    } catch (error) {
      console.error("Error creating post : ", error);
    }
  };

  return (
    <div>
      <h3>게시글 작성</h3>
      <form onSubmit={handleSubmit}>
        <div>
          <label>작성자 이름:</label>{" "}
          <input
            type="text"
            value={userName}
            onChange={(e) => setUserName(e.target.value)}
            required
          />
        </div>
        <div>
          <label>비밀번호:</label>{" "}
          <input
            type="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            required
          />
        </div>
        <div>
          <label>이메일:</label>{" "}
          <input
            type="text"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            required
          />
        </div>
        <div>
          <label>제목:</label>{" "}
          <input
            type="text"
            value={title}
            onChange={(e) => setTitle(e.target.value)}
            required
          />
        </div>
        <div>
          <label>내용:</label>{" "}
          <textarea
            value={content}
            onChange={(e) => setContent(e.target.value)}
            required
          />
        </div>
        <button type="submit">작성하기</button>
      </form>
    </div>
  );
};

export default PostCreate;
