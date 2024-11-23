function Button (){


    const style = {
        backgroundColor: "azure", // within the JSX content we can't use any hyphen
      
      
        border:"2px solid black",

    }
    return( <button style={styles}>CLICK ME </button>); {/* this is called internal styling , no problem for naming ambiguity*/}
}

export  default Button ;