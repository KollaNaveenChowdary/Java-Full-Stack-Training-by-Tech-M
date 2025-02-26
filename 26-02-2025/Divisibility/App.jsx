import React, { useState } from "react";

// Component to Check if a Number is Divisible by 16
export default function CheckDivisibility() {
  const [num, setNum] = useState("");

  const handleChange = (event) => {
    setNum(event.target.value);
  };

  const checkDivisibility = () => {
    if (num % 16 === 0) {
      return <h2>{num} is divisible by 16.</h2>;
    } else {
      return <h2>{num} is not divisible by 16.</h2>;
    }
  };

  return (
    <div>
      <h2>Check Divisibility by 16</h2>
      <input type="number" value={num} onChange={handleChange} placeholder="Enter a number" />
      {num && checkDivisibility()}
    </div>
  );
}