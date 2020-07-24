import React from "react";
import shortid from "shortid";
import style from "./style.css";

class InputForm extends React.Component {
  //state of input box
  state = {
    text: "",
  };

  updateChange = (event) => {
    //allows for keyboard input
    this.setState({ [event.target.name]: event.target.value });
  };

  updateSubmit = (event) => {
    //prevent page from going to a new page
    event.preventDefault();
    //when use text input box to create new task object to be added to state array
    this.props.onSubmit({
      id: shortid.generate(), //set the id to a random string
      text: this.state.text, //set the text to the state
      complete: 0, //initialize complete to false
    });
    //after the task is submitted we clear the input text box
    this.setState({
      text: "",
    });
  };

  render() {
    return (
      <form onSubmit={this.updateSubmit}>
        <input
          name="text"
          value={this.state.text} //updates the textbox input
          onChange={this.updateChange} //gets keyboard input from function
          placeholder="input a task..." //textbox placeholder
        />
        <button className={style.Button} onClick={this.updateSubmit}>
          add task
        </button>
      </form>
    );
  }
}

export default InputForm;
