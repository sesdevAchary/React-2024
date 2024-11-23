function Button (){


    const styles={
        backgroundColor: "azure",
        border:"2px solid black",

    }
    return( <button style={styles}>CLICK ME </button>); {/* this is called internal styling , no problem for naming ambiguity*/}
}

export  default Button ;