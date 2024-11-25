// conditional rendering = allows us to control what gets rendered in your applications based on some conditions 


function userGreeting(props){
     return ( props.isLoggedIn   ?    <h2>welcome {props.userName}</h2> :
                                       <h2> else statement </h2>  
     );
       
     }
