function renderingList(){

 /* first Example ------>
     const fruits = {apple,banan,Orange,coconut}
     const listItems = fruits.map(fruit => <li>{fruits}</li>); {//to arrange it in order }
     return( <ol>listItems</ol>);
*/

const fruits =[ { id:1, name:"apple" ,cal:21},
                 { id:2, name:"orange" ,cal:85},
                  { id:3, name:"banana" ,cal:218} ]

const listItems= fruits.map(fruit => <li key={fruit.id}>{fruit.name}:&nbsp;
                                                       <b>{fruit.cal}</b></li>); { /*each key item should have always an unique id */}

  return(<ol>{listItems}</ol>);

 }
