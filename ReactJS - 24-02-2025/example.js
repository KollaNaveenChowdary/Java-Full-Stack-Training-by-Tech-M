import React from 'react'; 
import ReactDOM from 'react-dom/client'; 

class Mobile extends React.Component {  
  render() { 
    return <h2>{this.props.model} Mobile Component !!</h2>; 
  } 
} 

const root = ReactDOM.createRoot(document.getElementById('root')); 
root.render(<Mobile model="ABCD" />);
