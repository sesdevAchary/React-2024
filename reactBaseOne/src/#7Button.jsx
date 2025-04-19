function App() {
  return <h1>Hello, World!</h1>;
}
export default App;
import { useState } from "react";

function App() {
  const [count, setCount] = useState(0);
  return (
    <button onClick={() => setCount(count + 1)}>
      You clicked {count} times
    </button>
  );
}
export default App;
import { useState } from "react";

function App() {
  const [visible, setVisible] = useState(true);
  return (
    <div>
      <button onClick={() => setVisible(!visible)}>Toggle</button>
      {visible && <p>This is visible</p>}
    </div>
  );
}
export default App;
import { useState } from "react";

function App() {
  const [text, setText] = useState("");
  return (
    <div>
      <input onChange={(e) => setText(e.target.value)} />
      <p>You typed: {text}</p>
    </div>
  );
}
export default App;
function App() {
  const handleSubmit = (e) => {
    e.preventDefault();
    alert("Form submitted!");
  };
  return (
    <form onSubmit={handleSubmit}>
      <input placeholder="Type something" />
      <button type="submit">Submit</button>
    </form>
  );
}
export default App;
function App() {
  const fruits = ["🍎 Apple", "🍌 Banana", "🍊 Orange"];
  return (
    <ul>
      {fruits.map((fruit, i) => (
        <li key={i}>{fruit}</li>
      ))}
    </ul>
  );
}
export default App;
function App() {
  const isLoggedIn = true;
  return (
    <h2 style={{ color: isLoggedIn ? "green" : "red" }}>
      {isLoggedIn ? "Welcome back!" : "Please log in"}
    </h2>
  );
}
export default App;
