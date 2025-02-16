// Get the price of 1 kg tomato from Monday to Sunday
let tomatoPrices = [40, 45, 50, 55, 60, 65, 70]; // Prices for each day of the week

// Calculate the total price
let total = 0;
for (let i = 0; i < tomatoPrices.length; i++) {
    total += tomatoPrices[i];
}

// Calculate the average price
let averagePrice = total / tomatoPrices.length;
console.log(`The average price of tomatoes is Rs.${averagePrice.toFixed(2)}`);

// Check if the average price is greater than Rs.50
if (averagePrice > 50) {
    console.log("Tomato has given good profit.");
} else {
    console.log("No profit from tomato.");
}
