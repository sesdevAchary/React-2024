import { useState } from "react"
import react from 'react'

function colorpicker(){
    const[color,setColor]= useState("#FFFFFF");


    // CREAING HTML ELEMENT WITHIN THE RETURN APP //
    return(
        <div className="color-picker-container">
            <h1>COLOR PICKER </h1>
            
            <div className="color-display" style={backgroundColor:color}></div>
        </div>
    )
}