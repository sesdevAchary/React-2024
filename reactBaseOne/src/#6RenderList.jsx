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