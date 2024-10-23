import React, { useState } from "react";
import ApiService from "../services/ApiService";
import { useNavigate } from "react-router-dom";

const Post = ({ post }) => {
  const [showModal, setShowModal] = useState(false);
  const [errorMessage, setErrorMessage] = useState("");
  const [password, setPassword] = useState("");
  const navigate = useNavigate();

  // 게시글 클릭 시 모달 창 표시
  const handleClick = () => {
    setShowModal(true);
  };

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
  };

  // 비밀번호 제출
  const handleSubmit = async () => {
    setErrorMessage(""); //오류메시지 초기화
    try {
      await ApiService.fetchPostDetails(post.id, password);
      // 비밀번호가 맞으면 게시글 상세 페이지로 이동
      navigate(`/post/${post.id}`, { state: { password } });
    } catch (error) {
      console.error("Error fetching post details: ", error);
      if (error.response && error.response.status === 400) {
        setErrorMessage("비밀번호가 잘못되었습니다. 다시시도해주세요.");
      } else {
        setErrorMessage("오류가 발생했습니다. 다시 시도해주세요.");
      }
    }
  };

  return (
    <div>
      <div onClick={handleClick}>
        <span>{post.title}</span>| 작성자: {post.user_name} | 작성일:{" "}
        {new Date(post.posted_at).toLocaleDateString()}
      </div>
      {showModal && (
        // 비밀번호 입력 모달창
        <div className="modal">
          <div className="modal_content">
            <h4>비밀번호를 입력하세요</h4>
            <input
              type="password"
              value={password}
              onChange={handlePasswordChange}
              placeholder="비밀번호"
            />
            {/* 오류 메시지 표시  */}
            {errorMessage && <p className="error-message">{errorMessage}</p>}
            <button onClick={handleSubmit}>확인</button>
            <button onClick={() => setShowModal(false)}>취소</button>
          </div>
        </div>
      )}
    </div>
  );
};

export default Post;
