

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