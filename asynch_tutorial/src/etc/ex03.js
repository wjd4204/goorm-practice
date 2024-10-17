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

increase(0)
  .then((number) => {
    // Promise에서 resove된 값은 .then을 통해 받아 올 수 있음
    console.log(number);
    return increase(number);
  })
  .then((number) => {
    console.log(number);
    return increase(number);
  })
  .then((number) => {
    console.log(number);
    return increase(number);
  })
  .then((number) => {
    console.log(number);
    return increase(number);
  })
  .then((number) => {
    console.log(number);
    return increase(number);
  })
  .catch((e) => {
    console.log(e);
  });
