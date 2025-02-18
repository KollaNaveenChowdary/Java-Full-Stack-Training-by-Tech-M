function sumOfDigits(num) {
    let sum = 0;
    while (num > 0) {
        sum += num % 10;
        num = Math.floor(num / 10);
    }

    if (sum % 2 === 0) {
        console.log('Sum of digits is even : ${sum}');
    } else {
        console.log('Sum of digits is odd : ${sum}');

    }
}

sumOfDigits(1234);


  