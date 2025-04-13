// import profilePic from './assets/profile.jpg'// -> src={profilePic}

function cards(){
    return(
        <div className="Card">
           <img src="https://via.placeholder.com/150" alt="some picture"></img>
           <h2>Title Picture</h2>
           <p>this is a normal pic to be inserted section </p>
        </div>
    )
}

export default cards;

const [isOn, setIsOn] = useState(false);
<button onClick={() => setIsOn(!isOn)}>
  {isOn ? "ON" : "OFF"}
</button>
const [count, setCount] = useState(0);
<button onClick={() => setCount(count + 1)}>
  Count: {count}
</button>

useEffect(() => {
    console.log("Component not  mounted");
  }, []);
  
  useEffect(() => {
    const timer = setTimeout(() => alert("Hi!"), 2000);
    return () => clearTimeout(timer);
  }, []);
  
  const [checked, setChecked] = useState(false);
<input type="checkbox" onChange={() => setChecked(!checked)} />
<p>{checked ? "Checked" : "Unchecked"}</p>

const [text, setText] = useState("");
<input onChange={e => setText(e.target.value)} />
<p>{text}</p>

{isLoggedIn ? <p>Welcome back!</p> : <p>Please log in.</p>}

useEffect(() => {
    const timer = setTimeout(() => alert("Hi!"), 2000);
    return () => clearTimeout(timer);
  }, []);
  
  function Greeting() {
    return <h1>Hello, React!</h1>;
  }
  function Welcome(props) {
    return <h2>Welcome, {props.name}!</h2>;
  }
  
  // Usage: <Welcome name="Alice" />
  
  import { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);

  return (
    <>
      <p>Count: {count}</p>
      <button onClick={() => setCount(count + 1)}>Increment</button>
    </>
  );
}

import { useState, useEffect } from 'react';

function Timer() {
  const [seconds, setSeconds] = useState(0);

  useEffect(() => {
    const interval = setInterval(() => {
      setSeconds((prev) => prev + 1);
    }, 1000);
    return () => clearInterval(interval);
  }, []);

  return <p>Seconds: {seconds}</p>;
}
function Status({ isLoggedIn }) {
  return (
    <div>
      {isLoggedIn ? <p>Welcome back!</p> : <p>Please sign in.</p>}
    </div>
  );
}
function TodoList({ tasks }) {
  return (
    <ul>
      {tasks.map((task, index) => (
        <li key={index}>{task}</li>
      ))}
    </ul>
  );
}

// Usage: <TodoList tasks={['Buy milk', 'Read book']} />
import { useState } from 'react';

function ContactForm() {
  const [name, setName] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    alert(`Hello, ${name}`);
  };

  return (
    <form onSubmit={handleSubmit}>
      <input
        value={name}
        onChange={(e) => setName(e.target.value)}
        placeholder="Your name"
      />
      <button type="submit">Submit</button>
    </form>
  );
}

function Parent() {
  const [message, setMessage] = useState('');

  return (
    <>
      <Child onMessageChange={setMessage} />
      <p>Message: {message}</p>
    </>
  );
}

function Child({ onMessageChange }) {
  return (
    <input
      onChange={(e) => onMessageChange(e.target.value)}
      placeholder="Type message"
    />
  );
}

import { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);
  return (
    <div>
      <p>Count: {count}</p>
      <button onClick={() => setCount(count - 1)}>-</button>
      <button onClick={() => setCount(count + 1)}>+</button>
    </div>
  );
}

import { useState } from 'react';

function ToggleText() {
  const [visible, setVisible] = useState(true);
  return (
    <div>
      <button onClick={() => setVisible(!visible)}>
        {visible ? 'Hide' : 'Show'} Text
      </button>
      {visible && <p>This is some text!</p>}
    </div>
  );
}

import { useState } from 'react';

function LivePreview() {
  const [text, setText] = useState('');
  return (
    <div>
      <input value={text} onChange={(e) => setText(e.target.value)} />
      <p>You typed: {text}</p>
    </div>
  );
}

import { useState } from 'react';

function DarkModeToggle() {
  const [dark, setDark] = useState(false);
  return (
    <div style={{ background: dark ? '#333' : '#fff', color: dark ? '#fff' : '#000', padding: 20 }}>
      <button onClick={() => setDark(!dark)}>
        Toggle {dark ? 'Light' : 'Dark'} Mode
      </button>
    </div>
  );
}
import { useEffect, useState } from 'react';

function Timer() {
  const [seconds, setSeconds] = useState(0);

  useEffect(() => {
    const interval = setInterval(() => setSeconds(s => s + 1), 1000);
    return () => clearInterval(interval);
  }, []);

  return <p>Timer: {seconds}s</p>;
}
import { useState } from 'react';

function SimpleForm() {
  const [name, setName] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    alert(`Submitted name: ${name}`);
  };

  return (
    <form onSubmit={handleSubmit}>
      <input value={name} onChange={(e) => setName(e.target.value)} placeholder="Enter your name" />
      <button type="submit">Submit</button>
    </form>
  );
}
import { useState } from 'react';

const quotes = ["Stay curious!", "React is awesome.", "Keep learning!", "Code every day."];

function RandomQuote() {
  const [quote, setQuote] = useState('');

  const getQuote = () => {
    const random = quotes[Math.floor(Math.random() * quotes.length)];
    setQuote(random);
  };

  return (
    <div>
      <button onClick={getQuote}>Get Quote</button>
      <p>{quote}</p>
    </div>
  );
}
import { useState } from 'react';

function TodoList() {
  const [task, setTask] = useState('');
  const [tasks, setTasks] = useState([]);

  const addTask = () => {
    if (task) {
      setTasks([...tasks, task]);
      setTask('');
    }
  };

  return (
    <div>
      <input value={task} onChange={(e) => setTask(e.target.value)} />
      <button onClick={addTask}>Add</button>
      <ul>
        {tasks.map((t, i) => <li key={i}>{t}</li>)}
      </ul>
    </div>
  );
}
import React from 'react';

function Welcome() {
  return <h1>Welcome to React!</h1>;
}

export default Welcome;

import React, { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);

  return (
    <div>
      <p>Count: {count}</p>
      <button onClick={() => setCount(count + 1)}>Increase</button>
    </div>
  );
}

export default Counter;

import React from 'react';

function Greeting({ isLoggedIn }) {
  return (
    <div>
      {isLoggedIn ? <h2>Welcome back!</h2> : <h2>Please log in.</h2>}
    </div>
  );
}

export default Greeting;
import React from 'react';

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
import { useState, useEffect } from 'react';

function useWindowWidth() {
  const [width, setWidth] = useState(window.innerWidth);

  useEffect(() => {
    const handleResize = () => setWidth(window.innerWidth);
    window.addEventListener('resize', handleResize);
    return () => window.removeEventListener('resize', handleResize);
  }, []);

  return width;
}

export default useWindowWidth;

import React from 'react';

function Card({ title, children }) {
  return (
    <div className="card">
      <h2>{title}</h2>
      <div>{children}</div>
    </div>
  );
}

export default Card;

import React, { useState, useEffect } from 'react';

function Users() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    fetch('https://jsonplaceholder.typicode.com/users')
      .then(res => res.json())
      .then(data => setUsers(data));
  }, []);

  return (
    <ul>
      {users.map(user => (
        <li key={user.id}>{user.name}</li>


        <P>adding extra values with completing the session 
          have a good luck !
        </P>
      ))}
    </ul>
  );
}

export default Users;
