// conditional rendering = allows us to control what gets rendered in your applications based on some conditions 


import propTypes from 'prop-types'
function userGreeting(props){
     return ( props.isLoggedIn   ?    <h2>welcome {props.userName}</h2> :
                                       <h2> else statement </h2>  
     );
       userGreeting.propTypes={
          isLoggedIn:bool,
          userName:string,
       }
     }
export default userGreeting



import { useState } from 'react';
import { DndProvider, useDrag, useDrop } from 'react-dnd';
import { HTML5Backend } from 'react-dnd-html5-backend';

const ItemTypes = { FIELD: 'field' };

const Field = ({ field, index, moveField }) => {
  const [, ref] = useDrag({
    type: ItemTypes.FIELD,
    item: { index },
  });

  const [, drop] = useDrop({
    accept: ItemTypes.FIELD,
    hover(item) {
      if (item.index !== index) {
        moveField(item.index, index);
        item.index = index;
      }
    },
  });

  return (
    <div ref={(node) => ref(drop(node))} className="field">
      {field.label}
    </div>
  );
};

export default function FormBuilder() {
  const [fields, setFields] = useState([
    { label: 'Name' },
    { label: 'Email' },
    { label: 'Age' },
  ]);

  const moveField = (from, to) => {
    const updated = [...fields];
    const [moved] = updated.splice(from, 1);
    updated.splice(to, 0, moved);
    setFields(updated);
  };

  return (
    <DndProvider backend={HTML5Backend}>
      <div className="form-builder">
        {fields.map((field, index) => (
          <Field key={index} field={field} index={index} moveField={moveField} />
        ))}
      </div>
    </DndProvider>
  );
}
import { createContext, useEffect, useState, useContext } from 'react';

const ThemeContext = createContext();

export const useTheme = () => useContext(ThemeContext);

export function ThemeProvider({ children }) {
  const [theme, setTheme] = useState(() => localStorage.getItem('theme') || 'light');

  useEffect(() => {
    document.body.className = theme;
    localStorage.setItem('theme', theme);
  }, [theme]);

  return (
    <ThemeContext.Provider value={{ theme, toggle: () => setTheme(t => (t === 'light' ? 'dark' : 'light')) }}>
      {children}
    </ThemeContext.Provider>
  );

  import { useEffect, useState } from 'react';

export function useDebounce(value, delay) {
  const [debounced, setDebounced] = useState(value);

  useEffect(() => {
    const handler = setTimeout(() => setDebounced(value), delay);
    return () => clearTimeout(handler);
  }, [value, delay]);

  return debounced;
}
import { useQuery } from 'react-query';
import axios from 'axios';

const fetchUsers = async () => {
  const { data } = await axios.get('https://jsonplaceholder.typicode.com/users');
  return data;
};

export function Users() {
  const { data, error, isLoading } = useQuery('users', fetchUsers);

  if (isLoading) return <p>Loading...</p>;
  if (error) return <p>Error fetching users</p>;

  return (
    <ul>
      {data.map(user => (
        <li key={user.id}>{user.name}</li>
      ))}
    </ul>
  );
}
