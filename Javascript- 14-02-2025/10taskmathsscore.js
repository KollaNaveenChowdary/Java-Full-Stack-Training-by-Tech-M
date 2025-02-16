// Get the Maths score of a student
let score = 188; // Change this value to test different scores

// Check the score range and display the appropriate message
if (score === 100) {
    console.log("Phenomenal!");
} else if (score > 100 ) {
    console.log("ENTER CORRECT SCORE !Error!");
} else if (score > 85 && score <= 99) {
    console.log("Excellent!");
} else if (score >= 71 && score <= 85) {
    console.log("Good work!");
} else if (score >= 51 && score <= 70) {
    console.log("Practice well!");
} else {
    console.log("Hard work is needed.");
}
