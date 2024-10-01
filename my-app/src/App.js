import "./App.css";
import Subject from "./Componets/Subject";
import NAV from "./Componets/NAV";
import Content from "./Componets/Content";
import JSXPractice from "./Componets/JSXPractice";

function App() {
  return (
    <div className="App">
      <JSXPractice />
      <hr />
      <h1>안녕하세요</h1>
      {/* 컴포넌트 사용 */}
      <Subject> </Subject>
      <hr />
      <NAV />
      <hr />
      <Content />
    </div>
  );
}

export default App;
