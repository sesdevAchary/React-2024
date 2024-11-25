function userGreeting(props){
     return ( props.isLoggedIn   ?    <h2>welcome {props.userName}</h2> :
                                       <h2> else statement </h2>  
     );
       
     }
}