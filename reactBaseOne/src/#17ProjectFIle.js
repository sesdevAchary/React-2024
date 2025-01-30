
import React, { Component } from 'react'
import Result from './components/Result'
import './App.css'
class App extends Component {
 
    static defaultProps = {
        secret: Math.floor(Math.random() * 20) + 1
    }
 
    constructor(props) {
        super(props)
        this.state = { term: '' }
 
        this.handleChange = this.handleChange.bind(this)
    }
 
    handleChange(event) {
        this.setState({
            [event.target.name]: event.target.value
        })
    }
 
    render() {
        return (
            <div className='container'>
                <div className='head'>
                    <label htmlFor='term'>
                        Guess Number between 1 to 20
                    </label>
                </div>
                <input
                    id='term'
                    type='text'
                    name='term'
                    value={this.state.term}
                    onChange={this.handleChange}
                />
 
                <Result term={this.state.term}
                    secretNum={this.props.secret} />
            </div>
        )
    }
}
export default App



// Result.js

import React from 'react'

const Result = ({ term, secretNum }) => {
	let result;
	if (term) {
		if (secretNum > term) {
			result = 'Lower'
		}
		else if (secretNum < term) {
			result = 'Higher'
		}
		else if (secretNum == term) {
			result = 'Yippee, correct!'
		}
		else {
			result = "Enter Valid Input"
		}
	}
	return <h3>You Guessed: {result}</h3>
}


import React from 'react';
import BoxContainer from './BoxContainer'

function App() {
return (
	<div className="App">
	<BoxContainer />
	</div>
);
}


import React,{ Component } from 'react'
import './BoxContainer.css'
import Box from './Box'
import { rgbValue, generateColors } from './helper'

class BoxContainer extends Component{

// Number of color boxes want shows by default
static defaultProps = {
	num : 18
}
constructor(props){
	super(props)
	this.state = {
	
	// Color state contains array of rgb color values
	colors : generateColors(this.props.num)
	}
	this.changeColor = this.changeColor.bind(this)
}

changeColor(c){

	// Create new random rgb color
	let newColor
	do{
	newColor = `rgb(
		${rgbValue()},
		${rgbValue()},
		${rgbValue()}
	)`
	
	// If new rgb color is equal to previous 
	// color of the box then again create new 
	// rgb color value
	}while(newColor === c)

	// Change colors array state by inserting 
	// new color value in place of previous color
	this.setState(st => ({
	colors : st.colors.map(color => {
		if(color !== c) return color
		return newColor
	})
	}))
}

render(){ 
	return(
	<div className='BoxContainer'>
		{this.state.colors.map(color => (
		
		// For each color make a box component
		<Box color={color} changeColor={this.changeColor}/>
		))}
	</div>
	)
}
}



import React,{ Component } from 'react'

class Box extends Component{
constructor(props){
	super(props)
	this.handleChangeColor = this.handleChangeColor.bind(this)
}

// Handler callback
handleChangeColor(){

	// Call parent component cahngeColor method passing the
	// color value of div
	this.props.changeColor(this.props.color)
}

render(){

	// Create a div component and assign the given 
	// color value by BoxContainer component as its
	// background color
	return <div
	
	// Set click handler to the div and pass a callback
	onClick={this.handleChangeColor} 
	style={{backgroundColor:this.props.color, 
				width:'13em', height:'13em'}} 
	/>
}
}

// Method return a random number from 0 to 255 
const rgbValue = () => {
    return Math.floor(Math.random() * 256)
    }
    
    // Method generates an array of rgb colors
    const generateColors = (num) => {
    let colors = []
    
    for(let i=0; i<num; i++){
        const red = rgbValue()
        const blue = rgbValue()
        const green = rgbValue()
        colors.push(`rgb(${red},${blue},${green})`)
    }
    return colors
    }
    
    export { rgbValue, generateColors }

    

     

function button (){
    const imgUrl='./src/assets....location';
    const handleClick5 = (e)=>{ console.log("iamge to be clicked ")}; // or to hide =>e.target.style.display ="none" 
      //return (<img onClick={(e)=>{handleClick5(e)} src = {imgUrl}></img>);//
 }
 


 function App() {
     const [click, setClick] = useState(0);
     // using array destructuring here 
     // to assign initial value 0
     // to click and a reference to the function 
     // that updates click to setClick
     return (
         <div>
             <p>You clicked {click} times</p>
 
             <button onClick={() => setClick(click + 1)}>
                 Click me
             </button>
         </div>
     );
 }
 

 // Method return a random number from 0 to 255 
const rgbValue = () => {
    return Math.floor(Math.random() * 256)
    }
    
    // Method generates an array of rgb colors
    const generateColors = (num) => {
    let colors = []
    
    for(let i=0; i<num; i++){
        const red = rgbValue()
        const blue = rgbValue()
        const green = rgbValue()
        colors.push(`rgb(${red},${blue},${green})`)
    }
    return colors
    }
    

    function Demo() {
        return (
          <CodeSandbox
            files={{
              "package.json": {
                content: {
                  dependencies: {
                    react: "latest",
                    "react-dom": "latest"
                  }
                }

            },
            "index.js": {
              content: code
            },
            "index.html": {
              content: `<div id="root"></div>`
            }
          }}
        >
          Open in CodeSandbox
        </CodeSandbox>
      )
    }

    import React from 'react';
import CodeSandbox from '@uiw/react-codesandbox';

const code = `import React from 'react';
import ReactDOM from 'react-dom';

const App = (
  <h1>
    Hello, {formatName(user)}!
  </h1>
);

import React from 'react';
import ReactDOM from 'react-dom';

const element = (
  <h1> Hello, CodeSandbox! </h1>
);

ReactDOM.render(
  element,
  document.getElementById('root')
);


function Hello(props) {
    return <h1>Hello World!</h1>;
  }
  
  const container = document.getElementById("root");
  const root = ReactDOM.createRoot(container);
  root.render(<Hello />);


  function Football() {
  const shoot = () => {
    alert("Great Shot!");
  }

  return (
    <button onClick={shoot}>Take the shot!</button>
  );
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Football />);

