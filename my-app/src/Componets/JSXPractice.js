import React from "react"; // rsf입력하고 탭키 => 함수형 컴포넌트 스캘레톤 코드

function JSXPractice() {
  const name = "React Learner";
  const isLoggedIn = false;
  const numbers = [1, 2, 3, 4, 5];

  function handleClick() {
    alert("버튼 클릭!");
  }

  // 사용자 환영 메시지를 반환하는 함수
  function getGreeting(user) {
    if (user) {
      return <h2>Hello, {user}!</h2>;
    }
    return <h2>Hello, Stranger.</h2>;
  }

  return (
    <div>
      <h1>JSX 실습</h1>
      <p>Welcome, {name}!</p>

      {isLoggedIn ? <p>로그인되었습니다.</p> : <p>로그인해주세요.</p>}

      <ul>
        {numbers.map((number) => (
          <li key={number}>{number}</li>
        ))}
      </ul>

      <button onClick={handleClick}>Click Me</button>

      {getGreeting("JSX Learner")}
      {getGreeting()}

      <h1>{<script>alert("Hacked!")</script>}</h1>
    </div>
  );
}

export default JSXPractice;
