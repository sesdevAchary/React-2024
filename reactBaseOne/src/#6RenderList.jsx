function renderingList(){

 /* first Example ------>
     const fruits = {apple,banan,Orange,coconut}
     const listItems = fruits.map(fruit => <li>{fruits}</li>); {//to arrange it in order }
     return( <ol>listItems</ol>);
*/

const fruits =[ { id:1, name:"apple" ,cal:21},
                 { id:2, name:"orange" ,cal:85},
                  { id:3, name:"banana" ,cal:218} ]

/* for sorting purpose---->
  fruits.sort((a,b)=> a.name.localCompare(b.name)); // for lexicographically sorting the array //
  fruits.sort((a,b)=> b.name.localCompare(a.name)); // for lexicographically  reverse sorting the array //
  fruits.sort((a,b)=> a.calories-b.calories); // to sort in numeric order //
  fruits.sort((a,b)=> b.calories-a.calories); // to reverse sort in numeric order //

*/

const listItems= fruits.map(fruit => <li key={fruit.id}>{fruit.name}:&nbsp;
                                                       <b>{fruit.cal}</b></li>); { /*each key item should have always an unique id */}

  return(<ol>{listItems}</ol>);
  
  // ohterwise we can create an array in the app.jsx and can make a prop call here //

 }
export default  renderingList;



const Counter = () => {
  const [count, setCount] = useState(0);

  return (
    <div>
      <h2>Counter: {count}</h2>
      <button onClick={() => setCount(count + 1)}>Increment</button>
    </div>
  );
};
const InputBox = () => {
  const [text, setText] = useState("");

  return (
    <div>
      <input 
        type="text" 
        value={text} 
        onChange={(e) => setText(e.target.value)}
        placeholder="Type something..."
      />
      <p>You typed: {text}</p>
    </div>
  );
};


const Toggle = () => {
  const [isOn, setIsOn] = useState(false);

  return (
    <div>
      <button onClick={() => setIsOn(!isOn)}>
        {isOn ? "ON" : "OFF"}
      </button>
    </div>
  );
};

const App = () => {
  return (
    <div className="flex flex-col items-center justify-center min-h-screen bg-gray-100">
      <h1 className="text-2xl font-bold mb-4">Simple React Components</h1>
      <Counter />
      <InputBox />
      <Toggle />
    </div>
  );
};

export default App;


.App {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
.App>h2 {
  text-align: center;
  font-size: 2rem;
}

.App>button {
  width: 20rem;
  font-size: larger;
  padding: 2vmax auto;
  height: 2.6rem;
  color: white;
  background-color: rgb(34, 34, 33);
  border-radius: 10px;
}
// App.js
import React from 'react';

class App extends React.Component { 
  handleMouseUp = () => {
    console.log('Mouse button released.');
    // Additional code...
  };

  render() {
    return (
      <div onMouseUp={this.handleMouseUp}>
        <p>Click and hold, then release the mouse button.</p>
      </div>
    );
  }
}

export default App; 


function Garage() {
  const cars = ['Ford', 'BMW', 'Audi'];
  return (
    <>
      <h1>Who lives in my garage?</h1>
      <ul>
        {cars.map((car) => <Car brand={car} />)}
      </ul>
    </>
  );
}



function Garage() {
  const cars = [
    {id: 1, brand: 'Ford'},
    {id: 2, brand: 'BMW'},
    {id: 3, brand: 'Audi'}
  ];
  return (
    <>
      <h1>Who lives in my garage?</h1>
      <ul>
        {cars.map((car) => <Car key={car.id} brand={car.brand} />)}
      </ul>
    </>
  );
}
class Car extends React.Component {
  render() {
    return <h2>Hi, I am a Car!</h2>;
  }
}
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Car />);


<BrowserRouter>
<Routes>
  <Route path="/" element={<Layout />}>
    <Route index element={<Home />} />
    <Route path="blogs" element={<Blogs />} />
    <Route path="contact" element={<Contact />} />
    <Route path="*" element={<NoPage />} />
  </Route>
</Routes>
</BrowserRouter>

<nav>
<ul>
  <li>
    <Link to="/">Home</Link>
  </li>
  <li>
    <Link to="/blogs">Blogs</Link>
  </li>
  <li>
    <Link to="/contact">Contact</Link>
  </li>
</ul>
</nav>


const Home = () => {
  return <h1>Home</h1>;
};

export default Home;

const Blogs = () => {
  return <h1>Blog Articles</h1>;
};

export default Blogs

const NoPage = () => {
  return <h1>404</h1>;
};

export default NoPage;

const App = () => {
  const [count, setCount] = useState(0);
  const [todos, setTodos] = useState(["todo 1", "todo 2"]);
  const increment = () => {
    setCount((c) => c + 1);
  };
  const Todos = ({ todos }) => {
    console.log("child render");
    return (
      <>
        <h2>My Todos</h2>
        {todos.map((todo, index) => {
          return <p key={index}>{todo}</p>;
        })}
      </>
    );
  };
  
  export default Todos;
  
const App = () => {
  const [count, setCount] = useState(0);
  const [todos, setTodos] = useState(["todo 1", "todo 2"]);

  const increment = () => {
    setCount((c) => c + 1);
  };