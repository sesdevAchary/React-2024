function userGreeting(props){
     if( props.isLoggedIn){
        return <h2>{props.userName}</h2>
     }
}