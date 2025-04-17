

  const Header = () => {
    const myStyle = {
      color: "white",
      backgroundColor: "DodgerBlue",
      padding: "10px",
      fontFamily: "Sans-Serif"
    };
    return (
      <>
        <h1 style={myStyle}>Hello Style!</h1>
        <p>Add a little style!</p>
      </>
    );
  }

  import { useState } from "react";
import ReactDOM from "react-dom/client";
import Todos from "./Todos";

const App = () => {
  const [count, setCount] = useState(0);
  const [todos, setTodos] = useState([]);

  const increment = () => {
    setCount((c) => c + 1);
  };
  const addTodo = () => {
    setTodos((t) => [...t, "New Todo"]);
  };

  return (
    <>
      <Todos todos={todos} addTodo={addTodo} />
      <hr />
      <div>
        Count: {count}
        <button onClick={increment}>+</button>
      </div>
    </>
  );
};

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<App />);



const expensiveCalculation = (num) => {
  console.log("Calculating...");
  for (let i = 0; i < 1000000000; i++) {
    num += 1;
  }
  return num;

 
  
  
const Todos = ({ todos, addTodo }) => {
  console.log("child render");
  return (
    <>
      <h2>My Todos</h2>
      {todos.map((todo, index) => {
        return <p key={index}>{todo}</p>;
      })}
      <button onClick={addTodo}>Add Todo</button>
    </>
  );
};


<>
      <Todos todos={todos} addTodo={addTodo} />
      <hr />
      <div>
        Count: {count}
        <button onClick={increment}>+</button>
      </div>
    </>
  );



  <>
      <Todos todos={todos} addTodo={addTodo} />
      <hr />
      <div>
        Count: {count}
        <button onClick={increment}>+</button>
      </div>
    </>
  );


  function createRoot(
    container: Element | Document | DocumentFragment,
    options?: CreateRootOptions
  ): RootType {
    if (__DEV__) {
      if (!Internals.usingClientEntryPoint && !__UMD__) {
        console.error(
          'You are importing createRoot from "react-dom" which is not supported. ' +
            'You should instead import it from "react-dom/client".'
        )
      }
    }
    return createRootImpl(container, options)
  }

  export function createRoot(
    container: Element | Document | DocumentFragment,
    options?: CreateRootOptions
  ): RootType {
    if (!isValidContainer(container)) {
      throw new Error(
        'createRoot(...): Target container is not a DOM element.'
      )
    }

    const root = createContainer(
      container,
      ConcurrentRoot,
      null,
      isStrictMode,
      concurrentUpdatesByDefaultOverride,
      identifierPrefix,
      onRecoverableError,
      transitionCallbacks
    )

    ReactDOMHydrationRoot.prototype.render =
  ReactDOMRoot.prototype.render = function (
    children: ReactNodeList
  ): void {
    const root = this._internalRoot

    if (root === null) {
      throw new Error('Cannot update an unmounted root.')
    }

    if (__DEV__) {
      // ...
    }

    updateContainer(children, root, null, null)
  }
  
 
  export function updateContainer(
    element: ReactNodeList,
    container: OpaqueRoot,
    parentComponent: ?React$Component<any, any>,
    callback: ?Function
  ): Lane 


  function Car(props) {
    return <li>I am a { props.brand }</li>;
  }
  
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
  const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Garage />);

function Car(props) {
  return <li>I am a { props.brand }</li>;
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

function MyForm() {
  return (
    <form>
      <label>Enter your name:
        <input type="text" />
      </label>
    </form>
  )
}
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<MyForm />);

import { useState } from 'react';
import ReactDOM from 'react-dom/client';

function MyForm() {
  const [name, setName] = useState("");

  return (
    <form>
      <label>Enter your name:
        <input
          type="text" 
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
      </label>
    </form>
  )
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<MyForm />);

export default function App() {
  return (
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
  );
  const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<App />);



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

  function MissedGoal() {
    return <h1>MISSED!</h1>;
  }
  
  function MadeGoal() {
    return <h1>Goal!</h1>;
  }


  function Goal(props) {
    const isGoal = props.isGoal;
    if (isGoal) {
      return <MadeGoal/>;
    }
    return <MissedGoal/>;
  }
  
  const root = ReactDOM.createRoot(document.getElementById('root'));
  root.render(<Goal isGoal={false} />);

  const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Goal isGoal={true} />);

function MyForm() {
  return (
    <form>
      <label>Enter your name:
        <input type="text" />
      </label>
      </form>
  )
}
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<MyForm />);




function HelloWorld() {
  return <h1>Hello, World!</h1>;
}
function Greeting(props) {
  return <h1>Hello, {props.name}!</h1>;
}

// Usage: <Greeting name="Alice" />
