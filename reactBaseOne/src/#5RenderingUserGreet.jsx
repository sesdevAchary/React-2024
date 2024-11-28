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