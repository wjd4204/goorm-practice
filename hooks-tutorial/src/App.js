import React from "react";
import Counter from "./Components/Counter";
import Info from "./Components/Info";
import Average from "./Components/Average";

const App = () => {
  return (
    <div>
      <Average />
      <hr />
      <Counter />
      <hr />
      <Info />
    </div>
  );
};

export default App;
