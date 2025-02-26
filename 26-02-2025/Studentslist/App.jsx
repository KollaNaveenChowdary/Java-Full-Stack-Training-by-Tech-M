import React from "react";

// ✅ Student List Data
const students = [
  { id: 1, name: "John", department: "Computer Science" },
  { id: 2, name: "Emma", department: "Electronics" },
  { id: 3, name: "Michael", department: "Mechanical" },
  { id: 4, name: "Sophia", department: "Civil" },
];

// ✅ Component to Display Student List with Department
function StudentList() {
  return (
    <div>
      <h2>Student List</h2>
      <ul>
        {students.map((student) => (
          <li key={student.id}>
            {student.name} - {student.department}
          </li>
        ))}
      </ul>
    </div>
  );
}

// ✅ Main App Component
export default function App() {
  return (
    <div>
      <h1>React Task</h1>
      <StudentList />
    </div>
  );
}
