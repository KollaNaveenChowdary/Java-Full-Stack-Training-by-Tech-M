// Creating a nested object
const myObj = {
    name: "John",
    age: 30,
    myCars: {
      car1: "Ford",
      car2: "BMW",
      car3: "Fiat"
    }
  };
  
  // Accessing nested object properties
  console.log("Car3:", myObj.myCars.car3); // Fiat
  console.log("Car2:", myObj.myCars["car2"]); // BMW
  console.log("Car2 using bracket notation:", myObj["myCars"]["car2"]); // BMW
  
  // Accessing using variables
  let p1 = "myCars";
  let p2 = "car2";
  console.log("Car2 using dynamic keys:", myObj[p1][p2]); // BMW
  
  // Creating an object with a method
  const person = {
    firstName: "John",
    lastName: "Doe",
    id: 5566,
    fullName: function() {
      return this.firstName + " " + this.lastName;
    }
  };
  
  // Calling the function inside the object
  console.log("Full Name:", person.fullName()); // John Doe
  
  // Displaying function definition
  console.log("Full Name function definition:", person.fullName); // Function reference
  