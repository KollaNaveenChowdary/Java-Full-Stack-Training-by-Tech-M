
let start = 10;  
let end = 40;    

console.log(`Displaying numbers from ${start} to ${end}, stopping at first multiple of 7:`);
for (let i = start; i <= end; i++) {
    if (i % 7 === 0) {
        break; // Stop the loop if a multiple of 7 is found
    }
    console.log(i);
}
