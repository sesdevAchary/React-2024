function Button (){


    const style = {
        backgroundColor: "azure", // within the JSX content we can't use any hyphen kind of statements.
      
      
        border:"2px solid black",

    }
    return( <button style={style}>CLICK ME </button>); {/* this is called internal styling , no problem for naming ambiguity*/}
}

export  default Button ;


// otherwise we can use external Css styling too where we can create another file named Button.module.css and can export it in the JSX content.//