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
