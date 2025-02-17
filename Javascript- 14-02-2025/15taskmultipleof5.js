let start = 10; 
let end = 60;    

console.log(`Displaying numbers from ${start} to ${end}, skipping multiples of 5:`);
for (let i = start; i <= end; i++) {
    if (i % 5 === 0) {
        continue; // Skip multiples of 5
    }
    console.log(i);
}
