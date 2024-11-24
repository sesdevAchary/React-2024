function student(props){  {/*To accept props,student function needs a parameter,gonna be the jsObject */}
return ( 
    <div>
        <p>Name: {props.name}</p>
        <p>Age: {props.age}</p>

        </div>

)
}
export default student;