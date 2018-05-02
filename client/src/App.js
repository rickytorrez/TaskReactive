import React, { Component } from 'react';
import './App.css';
import CreateTask from './Components/CreateTask';
import Menu from './Components/Menu';

class App extends Component {
  render() {
    return (
      <div className="App">
        <Menu />
        <CreateTask />
      </div>
    );
  }
}

export default App;
