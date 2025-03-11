import React from "react";

interface ChildProps {
  name: string;
  email: string;
  image: string;
}

const ChildComponent: React.FC<ChildProps> = ({ name, email, image }) => {
  return (
    <div className="col-md-4 mb-3">
      <div className="card shadow-sm p-3">
        <img src={image} alt={name} className="rounded-circle mx-auto d-block" width="100" />
        <h5 className="text-center mt-2">{name}</h5>
        <p className="text-center">{email}</p>
      </div>
    </div>
  );
};

export default ChildComponent;
