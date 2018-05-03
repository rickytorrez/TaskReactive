import React, { Component } from 'react';
import axios from 'axios';

class TaskInput extends Component {
    state = {
        title: '',
        description: ''
    };

    titleHandleChange = event => {
        this.setState({ title: event.target.value});
    }

    descriptionHandleChange = event => {
        this.setState({ description: event.target.value });
    }

    handleSubmit = event => {
        // event.preventDefault();                  // Let the components render since app is working
        const task = {
            title: this.state.title,
            description: this.state.description
        }

        // POST ROUTE FOR JAVA API
        axios
            .post('http://localhost:8080/new', task )
            .then(res => {
                console.log("Title should be here " + task.title)
                console.log("Description should be here " + task.description)
                console.log(res);
                console.log(res.data);
            })
    };

    render(){
        return(
            <div>
                <form onSubmit={ this.handleSubmit }>
                    <label>Title: </label>
                    <input type="text" name="title" onChange={ this.titleHandleChange }/>
                    <label>Description: </label>
                    <input type="text" name="description" onChange={ this.descriptionHandleChange }/>
                    <button type="submit">Add!</button>
                </form>
            </div>
        )
    }
}

export default TaskInput;