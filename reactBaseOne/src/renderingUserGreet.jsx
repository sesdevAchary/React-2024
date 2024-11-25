function userGreeting(props){
     if( props.isLoggedIn){
        return <h2>{props.userName}</h2> // "if true then this will be displayed"
     }
}