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
