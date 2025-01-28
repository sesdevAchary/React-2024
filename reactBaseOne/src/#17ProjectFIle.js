
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


