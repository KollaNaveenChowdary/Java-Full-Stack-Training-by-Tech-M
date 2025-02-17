let firstNumber = 7;  
let secondNumber = 20; 

let thirdNumber = secondNumber + 40;

console.log(`Multiples of ${firstNumber} from ${secondNumber} to ${thirdNumber}:`);
let i = secondNumber;
while (i <= thirdNumber) {
    if (i % firstNumber === 0) {
        console.log(i);
    }
    i++;
}
