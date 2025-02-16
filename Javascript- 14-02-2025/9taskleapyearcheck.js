let year = 2024; 
let month = "February"; 

// Function to check if a year is a leap year
function isLeapYear(year) {
    return (year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0);
}

// Check conditions and display results
if (isLeapYear(year)) {
    if (month.toLowerCase() === "february") {
        console.log(`The year ${year} is a leap year and the month is February with 29 days.`);
    } else {
        console.log(`The year ${year} is a leap year, but the month is not February.`);
    }
} else {
    console.log(`The given year ${year} is not a leap year.`);
}
