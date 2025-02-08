
 
import { Component } from 'react';
import './App.css';
import Game from './components/Game';

class App extends Component{  
    render(){
      return (
      <Game/>
    );
  }
}

export default App;


import React, {Component} from "react";
import './Game.css';

class Game extends Component{
    constructor(props) {
        super(props)
        this.state = {
            playerVal : null,
            computerVal : null,
            playerScore: 0,
            compScore: 0,
        };


      };
    }
    logic = (playerVal, computerVal)=>{
        if(playerVal == computerVal){
            return 0;
        } else if ((playerVal == "ROCK" && computerVal == "SCISSORS") ||
            (playerVal == "SCISSORS" && computerVal == "PAPER") ||
            (playerVal == "PAPER" && computerVal == "ROCK")
        ) {
            return 1;
        } else {
            return -1;
        }
    }

    
    decision = (playerChoice)=> {
      const choices = ["ROCK", "PAPER", "SCISSORS"];
      const compChoice =  choices[Math.floor(Math.random() * choices.length)];
      const val = this.logic(playerChoice, compChoice)
      if(val == 1) {
          console.log("Hello")
          this.setState({
              playerVal: playerChoice,
              computerVal : compChoice, 
              playerScore : this.state.playerScore +1
          })
        } else if(val == -1) {
          console.log("Hello")
          this.setState({
              playerVal: playerChoice,
              computerVal : compChoice,
              compScore : this.state.compScore +1
          })
      } else {
          console.log("Hello")
          this.setState({
              computerVal : compChoice,
              playerVal : playerChoice
          })
      }
  }

  render(){
    const {playerVal, computerVal, playerScore, compScore} = this.state;
    return(
        <div className="container">
            <h1>Welcome to Rock, Paper, Scissors Game</h1>
            <div >
                <button onClick={()=>this.decision("ROCK")}>
                    <i className={`fas fa-hand-rock`} /> Rock
                </button>
                <button onClick={()=>this.decision("PAPER")}>
                    <i className={`fas fa-hand-paper`} /> Paper
                </button>
                <button onClick={()=>this.decision("SCISSORS")}>
                    <i className={`fas fa-hand-scissors`} />  Scissors 
                </button>

                </div>
                <div className="content">
                    <p>Your choice: {playerVal}</p>
                    <p>Computer's choice: {computerVal}</p>
                    <h2>Your Score:{playerScore}</h2>
                    <h2>Computer Score: {compScore}</h2>
                </div>
            </div>
        )
    }
}

// export default Game;

const Header = () => {
    return (
      <>
        <h1 style={{color: "red"}}>Hello Style!</h1>
        <p>Add a little style!</p>
      </>
    );
  }

  const Header = () => {
    return (
      <>
        <h1 style={{backgroundColor: "lightblue"}}>Hello Style!</h1>
        <p>Add a little style!</p>
      </>
    );
  }


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