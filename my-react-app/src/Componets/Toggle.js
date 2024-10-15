import React, { useState } from "react";

// rsf 스니펫 사용
// useState 사용. 버튼 클릭 시 텍스트 토글
function Toggle() {
  const [isOn, setIsOn] = useState(true);

  const toggle = () => setIsOn(!isOn);

  return (
    <div>
      <h2>토글 버튼</h2>
      <button onClick={toggle}> {isOn ? "켜짐" : "꺼짐"} </button>
    </div>
  );
}

export default Toggle;
