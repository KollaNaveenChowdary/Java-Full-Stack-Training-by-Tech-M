import React from "react";
import ParentComponent from "./Components/ParentComponent";

const App: React.FC = () => {
  return (
    <div className="container mt-4">
      <h2 className="text-center mb-4">React Parent-Child Component Demo</h2>
      <ParentComponent />
    </div>
  );
};

export default App;
