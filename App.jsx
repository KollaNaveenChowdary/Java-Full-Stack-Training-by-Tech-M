import React from "react";
import ChildOne from "./components/ChildOne";
import ChildTwo from "./components/ChildTwo";
import ChildThree from "./components/ChildThree";
import ChildFour from "./components/ChildFour";
import ChildFive from "./components/ChildFive";
import "./App.css";

function ParentComponent() {
  return (
    <div className="parent-container">
      <h1>Parent Component</h1>
      <ChildOne />
      <ChildTwo />
      <ChildThree />
      <ChildFour />
      <ChildFive />
    </div>
  );
}

export default function App() {
  return (
    <div className="app-container">
      <ParentComponent />
    </div>
  );
}







// import { v4 } from "uuid";
 
// export default function  ABComponent2() {
//     const id = v4();
//     return (
//         <div>
//             <h1>Your unique id is :</h1>
//             <h2>{id}</h2>
//             <h3>Refresh for new id</h3>
//         </div>
//     );
// }



// 2. Create 1 component(C1) in src folder. Create 2 components (C2, C3) in a folder (src/f1). Create 2 components (C4, C5) in a folder outside src

// Main.jsx file should call C1. Inside C2, all other components are to be nested. C2 and C5 are to be imported statically, and , C3 and C4 are to be imported dynamically with fallback.
// import AB4_React from './components/AB4_React'
// const ABComponent2 = React.lazy(() => import('./AB2_React'));
// const ABComponent3 = React.lazy(() => import('./components/AB3_React'));

// function AB1_React() {
//   return (
//     <div>   
//        <h1>Welcome to ReactApp with Vite and AB1_React!!!</h1>       
//        <Suspense fallback={<h1>Loading...</h1>}>
//        <ABComponent2 />
//        <ABComponent3 />    
//       <AB4_React />
//       </Suspense>
//     </div>
//   );
// }

// export default AB1_React;