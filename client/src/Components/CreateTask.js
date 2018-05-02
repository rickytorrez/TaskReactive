import React, { Component } from 'react';

class CreateTask extends Component {
    render(){
        return(
            <div>
                <form>
                    <p>Title<input type="text" name="title"/></p>
                    <p>Description<input type="text" name="description"/></p>
                    <p><input type="submit" value="Create" /></p>
                </form>
            </div>
        )
    }
}

export default CreateTask;