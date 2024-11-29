function Button (){

// button click without a parameter
   /* const handleCLick=()=> console.log("HELLO");
    return(<button onClick={handleCLick}> CLICK HERE</button>) // When clicked on the button it will render to the callBack onclick function //
   */

// button click having a parameter //
 /* const handleClick2=(name)=> console.log( `${name} stop clicking me `)
  return( <button onclick={()=>{handleClick2("bro")}};> click me </button>)
   // output here will be -> Bro stop clicking me//
*/

 let count = 0;
 const handleCLick3 = (name)=>{
         if (count < 3){
          count ++;
          console.log(`${name} you clicked me ${count} times`); //Here the o/p=> bro clicked me 1/2/3 times //
         }
         else{
          cosnole.log(`${name} stop clicling me`); // here the output =>bro stop clicking me
         }
 }
 return( <button onClick={()=>{handleCLick3('bro')}}> click me </button>);

}
export default Button ;