function increase(number, callback) {
  const promise = new Promise((resolve, reject) => {
    // resolve는 성공, reject는 실패
    setTimeout(() => {
      const result = number + 10;
      //50보다 높으면 에러 발생
      if (result > 50) {
        const e = new Error("NumberToBig");
        return reject(e);
      }
      resolve(result); // number 값에 +10 후 성공처리
    }, 1000);
  });

  return promise;
}

async function runTasks() {
  try {
    let result = await increase(0);
    console.log(result);
    result = await increase(result);
    console.log(result);
    result = await increase(result);
    console.log(result);
    result = await increase(result);
    console.log(result);
    result = await increase(result);
    console.log(result);
    result = await increase(result);
    console.log(result);
  } catch (e) {
    console.log(e);
  }
}

runTasks();
