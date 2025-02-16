let num3 = 5;

switch (num3) {
    case 0:
        console.log("Number is zero.");
        break;
    case 1:
        console.log("Number is one.");
        break;
    case 2:
        console.log("Number is two.");
        break;
    default:
        console.log("Number is greater than 2.");
}

let num4 = 10;
let result = num4 >= 0 ? "Positive" : "Negative";
console.log(`The number is ${result}.`);
