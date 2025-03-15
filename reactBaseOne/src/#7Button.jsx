function Button (){







/*
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
*/




/*
// to change the dialogue box on doubel Click event //
function button (){
   const handleCLick4=(e)=>{e.target.textContent = 'oouch' }; // console.log("Ouuch")
   return ( <button onDoubleClick={(e)=>handleCLick4(e)} >click me </button>) //  will show first the click me area then it will convert to oouch ater we doubleCLick the event //
}
   */
  

function button (){
   const imgUrl='./src/assets....location';
   const handleClick5 = (e)=>{ console.log("iamge to be clicked ")}; // or to hide =>e.target.style.display ="none" 
     //return (<img onClick={(e)=>{handleClick5(e)} src = {imgUrl}></img>);//
}
}
export default Button ;


// export default function CustomButton({ label, onClick }) {
//   return (
//     <button 
//       onClick={onClick} 
//       className="px-4 py-2 bg-blue-500 text-white font-semibold rounded-lg shadow-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-400 focus:ring-opacity-75"
//     >
//       {label}
//     </button>
//   );
// }



