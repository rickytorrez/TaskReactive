import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

import TaskList from './Components/TaskList';
import TaskInput from './Components/TaskInput';

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to React</h1>
        </header>

        <TaskInput />
        <TaskList />
      </div>
    );
  }
}

export default App;
