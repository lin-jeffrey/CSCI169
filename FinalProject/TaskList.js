import React from "react";
import InputForm from "./TaskForm.js";
import Task from "./Task.js";

class TaskList extends React.Component {
  //array of tasks on the to do list
  state = {
    tasks: [],
  };

  //add new task to array in state
  addTask = (task) => {
    this.setState({
      tasks: [task, ...this.state.tasks],
    });
  };

  //delete a task
  deleteTask = (id) => {
    //we filter the state so that the task with the deleted id is removed
    this.setState({
      tasks: this.state.tasks.filter((task) => task.id !== id),
    });
  };

  //mark a task as complete
  markComplete = (id) => {
    this.setState({
      //goes through all the tasks in the state
      tasks: this.state.tasks.map((task) => {
        //if the id matches mark task complete
        if (task.id === id) {
          return {
            id: task.id,
            text: task.text,
            complete: !task.complete,
          };
        } //if the id doesnt match continue with task list
        else {
          return task;
        }
      }),
    });
  };

  render() {
    return (
      <div className="App">
        <h1 style={{ color: "navy" }}>To-Do List</h1>
        <h4>Enter your tasks below:</h4>
        <InputForm onSubmit={this.addTask} />
        {this.state.tasks.map((task) => (
          //display a task object and allow interactions with it
          <Task
            task={task}
            markComplete={() => this.markComplete(task.id)}
            deleteTask={() => this.deleteTask(task.id)}
          />
        ))}
      </div>
    );
  }
}

export default TaskList;
