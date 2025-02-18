let person = {
    firstName: "John",
    lastName: "Doe",
    age: 30,
    city: "New York"
  };
  
  // Add functions to the person object
  person.name1 = function () {
    return this.firstName + " " + this.lastName;
  };
  
  person.name2 = function () {
    return (this.firstName + " " + this.lastName).toUpperCase();
  };
  
  // Log the functions' definitions
  console.log("name1 function definition: " + person.name1);
  console.log("name2 function definition: " + person.name2);
  
  // Call the functions
  console.log(person.name1());
  console.log(person.name2()); 
  
  delete person.name1;
  
  console.log(person.name1);
  