import { useState } from "react"
import react from 'react'

function colorpicker(){
    const[color,setColor]= useState("#FFFFFF");

    function handleColorChange(){
        
    }


    // CREAING HTML ELEMENT WITHIN THE RETURN APP //
    return(
        <div className="color-picker-container">
            <h1>COLOR PICKER </h1>
            
            <div className="color-display" style={{backgroundColor:color}}> {/*for white background color  */}
                <p> Selected color:{color}</p>
            </div>
            <label htmlFor=""> SELECT A COLOR </label>
            <input type="color" value={color} onChange={handleColorChange}/> {/*default-changed-want to change; format */}
        </div>
    )
}