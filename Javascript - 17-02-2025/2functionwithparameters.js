function sum1(x, y) { 
    return x + y; 
}
console.log("Named Function:", sum1(6, 9)); 


var sum2 = function (x, y) {
    return x + y;
};
console.log("Function Expression:", sum2(4, 5)); 

// Arrow function with parameters
let sum3 = (a, b) => a + b;
console.log("Arrow Function:", sum3(1, 2)); 
