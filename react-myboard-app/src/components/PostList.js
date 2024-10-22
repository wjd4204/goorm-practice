import React, { useEffect, useState } from "react";
import apiServiceInstance from "../services/ApiService";

const PostList = () => {
  const [posts, setPosts] = useState([]);

  // 모든 게시글 불러오는 함수
  const loadPosts = async () => {
    try {
      const response = await apiServiceInstance.fetchPosts(); //전체 게시글 가져오는 API 호출
      console.log(response.data);
      setPosts(response.data);
    } catch (error) {
      console.error("Error fetching posts: ", error);
    }
  };

  // 컴포넌트 마운트될 때 데이터 불러옴
  useEffect(() => {
    loadPosts();
  }, []);

  return (
    <div>
      <h3>게시글 목록</h3>
      {posts.length > 0 ? (
        <ul>
          {posts.map((post) => (
            <li key={post.id}>
              제목: {post.title}
              <br />
              작성자: {post.user_name}
              <br />
              작성일: {post.posted_at}
              <br />
            </li>
          ))}
        </ul>
      ) : (
        <p>게시글이 없습니다.</p>
      )}
    </div>
  );
};

export default PostList;
