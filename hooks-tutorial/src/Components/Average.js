import React, { useCallback, useMemo, useState } from "react";

const getAverage = (numbers) => {
  console.log("평균값 계산 중...");
  if (numbers.length === 0) return 0;
  const sum = numbers.reduce((a, b) => a + b);
  return sum / numbers.length;
};

const Average = () => {
  const [number, setNumber] = useState("");
  const [list, setList] = useState([]);

  const onChange = useCallback((e) => {
    setNumber(e.target.value);
  }, []); // 두번째 매개변수에 비어있는리스트 => 컴포넌트가 처음 렌더링될 때만 함수 실행
  const onInsert = useCallback(
    (e) => {
      const nextList = list.concat(parseInt(number));
      setList(nextList);
      setNumber("");
    },
    [number, list]
  ); // number 혹은 list가 바뀌었을 때만 함수 생성

  const avg = useMemo(() => getAverage(list), [list]);

  return (
    <div>
      <input value={number} onChange={onChange} />
      <button onClick={onInsert}>등록</button>
      <ul>
        {list.map((value, index) => (
          <li key={index}>{value}</li>
        ))}
      </ul>
      <div>
        {" "}
        <b>평균값 :</b> {avg}
      </div>
    </div>
  );
};

export default Average;
