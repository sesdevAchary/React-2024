function Button (){

// button click without a parameter
   /* const handleCLick=()=> console.log("HELLO");
    return(<button onClick={handleCLick}> CLICK HERE</button>) // When clicked on the button it will render to the callBack onclick function //
   */

// button click having a parameter //
  const handleClick2=(name)=> console.log( `${name} stop clicking me `)
  return( <button onclick={handleClick2("bro")}> click me </button>)


}
export default Button ;