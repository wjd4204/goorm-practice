import React from "react"; // rsf탭
import Welcome from "./Componets/Welcome";
import Clock from "./Componets/Clock";
import Counter from "./Componets/Counter";
import Toggle from "./Componets/Toggle";
import EventPractice2 from "./Componets/EventPractice2";
import SelectPopup from "./Componets/SelectPopup";

function App() {
  return (
    <div>
      <h1>React 기본 예제</h1>
      <EventPractice2 />
      <hr />
      <SelectPopup />
      <hr />
      <Toggle />
      <hr />
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
