// Creating an object in multiple lines
const person = {
    firstName: "John",
    lastName: "Doe",
    age: 50,
    eyeColor: "blue"
  };
  console.log("Person Object:", person);
  
  // Creating an empty object and adding properties
  const person2 = {};
  person2.firstName = "John";
  person2.lastName = "Doe";
  person2.age = 50;
  person2.eyeColor = "blue";
  
  console.log("Person2 Object:", person2);
  
  // Accessing object members
  let age = person.age;
  console.log(person.firstName + " is " + person.age + " years old.");
  
  // Accessing using bracket notation
  let age2 = person["age"];
  console.log(person["firstName"] + " is " + person["age"] + " years old.");
  
  // Accessing using variables
  let x = "firstName";
  let y = "age";
  console.log(person[x] + " is " + person[y] + " years old.");
  
  // Adding a property to the object
  person.nationality = "English";
  console.log("After Adding Nationality:", person);
  
  // Removing a property from the object
  delete person.age;
  console.log("After Removing Age:", person);
  