// import profilePic from './assets/profile.jpg'// -> src={profilePic}

function cards(){
    return(
        <div className="Card">
           <img src="https://via.placeholder.com/150" alt="some picture"></img>
           <h2>Title Picture</h2>
           <p>this is a normal pic to be inserted section </p>
        </div>
    )
}

export default cards;

const [isOn, setIsOn] = useState(false);
<button onClick={() => setIsOn(!isOn)}>
  {isOn ? "ON" : "OFF"}
</button>
const [count, setCount] = useState(0);
<button onClick={() => setCount(count + 1)}>
  Count: {count}
</button>

useEffect(() => {
    console.log("Component not  mounted");
  }, []);
  
  useEffect(() => {
    const timer = setTimeout(() => alert("Hi!"), 2000);
    return () => clearTimeout(timer);
  }, []);
  