import propTypes from 'prop-Types';

function Student(props){  {/*To accept props,student function needs a parameter,gonna be the jsObject */}
return ( 
    <div>
        <p>Name: {props.name}</p>
        <p>Age: {props.age}</p>
        <p>Name: {props.isStudent ? " Nice ": "Not Nice"}</p>  {/*BOOLEANS need conditions , dont get directly displayed on Js Dom*/}
    </div>

);
};
Student.propTypes;{
    name:propTypes.string ; {/* to confit, that name should only be of string type*/}
    age:propTypes.int;

}
export default Student;

import React, { useState } from 'react';

const formConfig = [
  { name: 'email', type: 'email', label: 'Email', required: true },
  { name: 'password', type: 'password', label: 'Password', required: true },
];

const DynamicForm = () => {
  const [form, setForm] = useState({});
  const [errors, setErrors] = useState({});

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const validate = () => {
    const newErrors = {};
    formConfig.forEach(({ name, required }) => {
      if (required && !form[name]) newErrors[name] = 'This field is required';
    });
    setErrors(newErrors);
    return Object.keys(newErrors).length === 0;
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (validate()) alert('Form Submitted: ' + JSON.stringify(form));
  };

  return (
    <form onSubmit={handleSubmit}>
      {formConfig.map(({ name, type, label }) => (
        <div key={name}>
          <label>{label}</label>
          <input name={name} type={type} onChange={handleChange} />
          {errors[name] && <span style={{ color: 'red' }}>{errors[name]}</span>}
        </div>
      ))}
      <button type="submit">Submit</button>
    </form>
  );
};

export default DynamicForm;

import React, { createContext, useContext, useState, useEffect } from 'react';

const ThemeContext = createContext();

export const useTheme = () => useContext(ThemeContext);

const ThemeProvider = ({ children }) => {
  const [theme, setTheme] = useState(() => localStorage.getItem('theme') || 'light');

  useEffect(() => {
    document.body.className = theme;
    localStorage.setItem('theme', theme);
  }, [theme]);

  const toggleTheme = () => setTheme(prev => (prev === 'light' ? 'dark' : 'light'));

  return (
    <ThemeContext.Provider value={{ theme, toggleTheme }}>
      {children}
    </ThemeContext.Provider>
  );
};

export default ThemeProvider;
import React from 'react';
import { FixedSizeList as List } from 'react-window';

const Row = ({ index, style }) => (
  <div style={style}>Row #{index}</div>
);

const VirtualizedList = () => (
  <List
    height={400}
    itemCount={1000}
    itemSize={35}
    width={'100%'}
  >
    {Row}
  </List>
);

export default VirtualizedList;
import React, { useRef, useEffect } from 'react';
import * as d3 from 'd3';

const data = [30, 86, 168, 281, 303, 365];

const D3BarChart = () => {
  const ref = useRef();

  useEffect(() => {
    const svg = d3.select(ref.current);
    svg.selectAll('*').remove();

    svg.selectAll('rect')
      .data(data)
      .join('rect')
      .attr('width', d => d)
      .attr('height', 25)
      .attr('y', (_, i) => i * 30)
      .attr('fill', 'steelblue');
  }, []);

  return <svg ref={ref} width={400} height={200}></svg>;
};

export default D3BarChart;
import React, { useEffect, useState } from 'react';

const Chat = () => {
  const [messages, setMessages] = useState([]);
  const [msg, setMsg] = useState('');
  const socketRef = useRef(null);

  useEffect(() => {
    socketRef.current = new WebSocket('ws://localhost:4000');
    socketRef.current.onmessage = e => setMessages(prev => [...prev, e.data]);
    return () => socketRef.current.close();
  }, []);

  const sendMessage = () => {
    socketRef.current.send(msg);
    setMsg('');
  };

  return (
    <div>
      <div>{messages.map((m, i) => <p key={i}>{m}</p>)}</div>
      <input value={msg} onChange={e => setMsg(e.target.value)} />
      <button onClick={sendMessage}>Send</button>
    </div>
  );
};

export default Chat;
import React from 'react';
import { DragDropContext, Droppable, Draggable } from 'react-beautiful-dnd';

const initialTasks = ['Task 1', 'Task 2', 'Task 3'];

const Kanban = () => {
  const [tasks, setTasks] = React.useState(initialTasks);

  const onDragEnd = (result) => {
    if (!result.destination) return;
    const newTasks = [...tasks];
    const [moved] = newTasks.splice(result.source.index, 1);
    newTasks.splice(result.destination.index, 0, moved);
    setTasks(newTasks);
  };

  return (
    <DragDropContext onDragEnd={onDragEnd}>
      <Droppable droppableId="board">
        {(provided) => (
          <div {...provided.droppableProps} ref={provided.innerRef}>
            {tasks.map((task, i) => (
              <Draggable key={task} draggableId={task} index={i}>
                {(provided) => (
                  <div ref={provided.innerRef} {...provided.draggableProps} {...provided.dragHandleProps}>
                    {task}
                  </div>
                )}
              </Draggable>
            ))}
            {provided.placeholder}
          </div>
        )}
      </Droppable>
    </DragDropContext>
  );
};

export default Kanban;

import React, { useState } from 'react';

const steps = ['Personal Info', 'Contact Info', 'Finish'];

const MultiStepForm = () => {
  const [step, setStep] = useState(0);

  const next = () => setStep(prev => Math.min(prev + 1, steps.length - 1));
  const prev = () => setStep(prev => Math.max(prev - 1, 0));

  return (
    <div>
      <h2>{steps[step]}</h2>
      <progress value={step + 1} max={steps.length} />
      <div>
        {step > 0 && <button onClick={prev}>Back</button>}
        {step < steps.length - 1 ? <button onClick={next}>Next</button> : <button>Submit</button>}
      </div>
    </div>
  );
};

export default MultiStepForm;

import React, { useEffect, useRef, useState } from 'react';

const InfiniteScroll = () => {
  const [items, setItems] = useState(Array.from({ length: 20 }));
  const loader = useRef(null);

  useEffect(() => {
    const observer = new IntersectionObserver(entries => {
      if (entries[0].isIntersecting) {
        setItems(prev => [...prev, ...Array.from({ length: 20 })]);
      }
    }, { threshold: 1.0 });

    if (loader.current) observer.observe(loader.current);
    return () => observer.disconnect
    function Greeting() {
      return <h1>Hello, React!</h1>;
    }
    
    export default Greeting;
    
    import { useState } from "react";

function Counter() {
  const [count, setCount] = useState(0);

  return (
    <div>
      <p>Count: {count}</p>
      <button onClick={() => setCount(count + 1)}>Increment</button>
    </div>
  );
}

export default Counter;

import { useEffect, useState } from "react";

function Timer() {
  const [seconds, setSeconds] = useState(0);

  useEffect(() => {
    const interval = setInterval(() => {
      setSeconds((prev) => prev + 1);
    }, 1000);

    return () => clearInterval(interval);
  }, []);

  return <h2>Time: {seconds} seconds</h2>;
}

export default Timer;
function UserStatus({ isLoggedIn }) {
  return (
    <div>
      {isLoggedIn ? <p>Welcome back!</p> : <p>Please sign in.</p>}
    </div>
  );
}

export default UserStatus;
function ItemList({ items }) {
  return (
    <ul>
      {items.map((item, index) => (
        <li key={index}>{item}</li>
      ))}
    </ul>
  );
}

export default ItemList;
