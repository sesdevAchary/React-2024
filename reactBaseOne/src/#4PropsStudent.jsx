import propTypes from 'prop-Types';

function Student(props){  {/*To accept props,student function needs a parameter,gonna be the jsObject */}
return ( 
    <div>
        <p>Name: {props.name}</p>
        <p>Age: {props.age}</p>
        <p>Name: {props.isStudent ? " Nice ": "Not Nice"}</p>  {/*BOOLEANS need conditions , dont get directly displayed on Js Dom*/}
    </div>

);
};
Student.propTypes;{
    name:propTypes.string ; {/* to confit, that name should only be of string type*/}
    age:propTypes.int;

}
export default Student;

import React, { useState } from 'react';

const formConfig = [
  { name: 'email', type: 'email', label: 'Email', required: true },
  { name: 'password', type: 'password', label: 'Password', required: true },
];

const DynamicForm = () => {
  const [form, setForm] = useState({});
  const [errors, setErrors] = useState({});

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const validate = () => {
    const newErrors = {};
    formConfig.forEach(({ name, required }) => {
      if (required && !form[name]) newErrors[name] = 'This field is required';
    });
    setErrors(newErrors);
    return Object.keys(newErrors).length === 0;
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (validate()) alert('Form Submitted: ' + JSON.stringify(form));
  };

  return (
    <form onSubmit={handleSubmit}>
      {formConfig.map(({ name, type, label }) => (
        <div key={name}>
          <label>{label}</label>
          <input name={name} type={type} onChange={handleChange} />
          {errors[name] && <span style={{ color: 'red' }}>{errors[name]}</span>}
        </div>
      ))}
      <button type="submit">Submit</button>
    </form>
  );
};

export default DynamicForm;

import React, { createContext, useContext, useState, useEffect } from 'react';

const ThemeContext = createContext();

export const useTheme = () => useContext(ThemeContext);

const ThemeProvider = ({ children }) => {
  const [theme, setTheme] = useState(() => localStorage.getItem('theme') || 'light');

  useEffect(() => {
    document.body.className = theme;
    localStorage.setItem('theme', theme);
  }, [theme]);

  const toggleTheme = () => setTheme(prev => (prev === 'light' ? 'dark' : 'light'));

  return (
    <ThemeContext.Provider value={{ theme, toggleTheme }}>
      {children}
    </ThemeContext.Provider>
  );
};

export default ThemeProvider;
import React from 'react';
import { FixedSizeList as List } from 'react-window';

const Row = ({ index, style }) => (
  <div style={style}>Row #{index}</div>
);

const VirtualizedList = () => (
  <List
    height={400}
    itemCount={1000}
    itemSize={35}
    width={'100%'}
  >
    {Row}
  </List>
);

export default VirtualizedList;
import React, { useRef, useEffect } from 'react';
import * as d3 from 'd3';

const data = [30, 86, 168, 281, 303, 365];

const D3BarChart = () => {
  const ref = useRef();

  useEffect(() => {
    const svg = d3.select(ref.current);
    svg.selectAll('*').remove();

    svg.selectAll('rect')
      .data(data)
      .join('rect')
      .attr('width', d => d)
      .attr('height', 25)
      .attr('y', (_, i) => i * 30)
      .attr('fill', 'steelblue');
  }, []);

  return <svg ref={ref} width={400} height={200}></svg>;
};

export default D3BarChart;

