import React, { useState, useEffect } from "react";
import axios from "axios";
import ChildComponent from "./ChildComponent"; // Corrected path

// import ChildComponent from "./Components/ChildComponent";


interface User {
  id: number;
  name: string;
  email: string;
  image: string;
}

const ParentComponent: React.FC = () => {
  const [users, setUsers] = useState<User[]>([]);
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");

  useEffect(() => {
    axios.get("http://localhost:3000/api.json")
      .then((response) => setUsers(response.data))
      .catch((error) => console.error("Error fetching data:", error));
  }, []);

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    const newUser: User = {
      id: users.length + 1,
      name,
      email,
      image: "https://via.placeholder.com/100",
    };
    setUsers([...users, newUser]);
    setName("");
    setEmail("");
  };

  return (
    <div className="card p-4">
      <h4>Parent Component</h4>
      
      <form onSubmit={handleSubmit} className="mb-4">
        <div className="mb-2">
          <label>Name:</label>
          <input type="text" className="form-control" value={name} onChange={(e) => setName(e.target.value)} required />
        </div>
        <div className="mb-2">
          <label>Email:</label>
          <input type="email" className="form-control" value={email} onChange={(e) => setEmail(e.target.value)} required />
        </div>
        <button type="submit" className="btn btn-primary">Add User</button>
      </form>

      <div className="row">
        {users.map((user) => (
          <ChildComponent key={user.id} name={user.name} email={user.email} image={user.image} />
        ))}
      </div>
    </div>
  );
};

export default ParentComponent;
