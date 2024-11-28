function Button (){


   /* const handleCLick=()=> console.log("HELLO");
    return(<button onClick={handleCLick}> CLICK HERE</button>) // When clicked on the button it will render to the callBack onclick function //
   */

  const handleClick2=(name)=> console.log( `${name} stop clicking me `)
  return( <button onclick={handleClick2("bro")}> click me </button>)


}