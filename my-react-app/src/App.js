import React from "react"; // rsf탭
import Welcome from "./Componets/Welcome";
import Clock from "./Componets/Clock";
import Counter from "./Componets/Counter";

function App() {
  return (
    <div>
      <h1>React 기본 예제</h1>
      <Welcome name="Sara" />
      <Welcome name="홍길동" />
      <hr />
      <Clock />
      <hr />
      <Counter />
    </div>
  );
}

export default App;
