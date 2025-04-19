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
