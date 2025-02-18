let calculate = () => {
    let operation = 'add'; // Change this to test 
    let a = 10;
    let b = 5;
    let result;
  
    switch (operation) {
      case 'add':
        result = a + b;
        console.log(`Sum: ${result}`);
        break;
      case 'subtract':
        result = a - b;
        console.log(`Difference: ${result}`);
        break;
      case 'multiply':
        result = a * b;
        console.log(`Product: ${result}`);
        break;
      case 'divide':
        result = a / b;
        let remainder = a % b;
        console.log(`Quotient: ${result}, Remainder: ${remainder}`);
        break;
      default:
        console.log('Invalid operation');
    }
  };
  
  calculate();
  