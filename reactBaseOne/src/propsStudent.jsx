function Student(props){  {/*To accept props,student function needs a parameter,gonna be the jsObject */}
return ( 
    <div>
        <p>Name: {props.name}</p>
        <p>Age: {props.age}</p>
        <p>Name: {props.isStudent ? " Nice ": "Not Nice"}</p>  {/*BOOLEANS need conditions , dont get directly displayed on Js Dom*/}


        </div>

)
}
export default Student;