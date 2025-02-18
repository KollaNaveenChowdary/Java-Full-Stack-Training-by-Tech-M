let student = {
    id: 1,
    name: "John Doe",
    department: "Computer Science",
    college: "XYZ University",
    email: "john.doe@example.com",
    address: {
      doorNo: "123",
      street: "Main St.",
      area: "Downtown",
      pincode: "123456"
    },
  
    displayDetails: function() {
      console.log(`ID: ${this.id}, Name: ${this.name}, Department: ${this.department}, College: ${this.college}, Email: ${this.email}`);
    },

    displayBasicDetails: function() {
      console.log(`ID: ${this.id}, Name: ${this.name}, Email: ${this.email}`);
    },

    displayFullDetails: function() {
      console.log(`ID: ${this.id}, Name: ${this.name}, Department: ${this.department}, College: ${this.college}`);
      console.log(`Address: ${this.address.doorNo}, ${this.address.street}, ${this.address.area}, ${this.address.pincode}`);
    }
  };
  
  student.displayDetails();
  student.displayBasicDetails();
  student.displayFullDetails();

  delete student.email;
  delete student.displayBasicDetails;

  console.log(student);
  