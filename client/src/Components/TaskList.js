import React, { Component } from 'react';
import axios from 'axios';

class TaskList extends Component {
    state = {
        tasks: []
    }

    componentDidMount(){
        axios.get('http://localhost:8080/tasks')
            .then(res => {
                console.log(res);
                this.setState({ tasks: res.data });
            })
    }

    render(){
        return(
            <div>
                <ul>
                    { this.state.tasks.map(
                        task => 
                            <li key={ task.id }>
                                { task.title} 
                                { task.description }
                            </li> ) }
                </ul>
            </div>
        )
    }
}

export default TaskList;