import React from "react";

//this is the task object and its functional interactions
export default (object) => (
  <div
    style={{
      display: "flex",
      justifyContent: "center",
      padding: "4px",
      fontsize: "13px",
    }}
  >
    <div
      //if the task is clicked it strikes through the text
      style={{ textDecoration: object.task.complete ? "line-through" : "" }}
      onClick={object.markComplete}
    >
      {object.task.text}
    </div>
    <button onClick={object.deleteTask}>delete</button>
  </div>
);
