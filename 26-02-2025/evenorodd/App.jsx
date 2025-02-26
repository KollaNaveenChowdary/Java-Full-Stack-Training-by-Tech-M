import React, { useState } from "react";

function EvenNumber() {
  return <h1>The number is Even!</h1>;
}

function OddNumber() {
  return <h1>The number is Odd!</h1>;
}

function CheckNumber() {
  const [num, setNum] = useState("");

  const handleChange = (event) => {
    setNum(event.target.value);
  };

  return (
    <div>
      <h2>Enter a Number:</h2>
      <input
        type="number"
        value={num}
        onChange={handleChange}
        placeholder="Type a number..."
      />
      {num !== "" && (num % 2 === 0 ? <EvenNumber /> : <OddNumber />)}
    </div>
  );
}

export default CheckNumber;
