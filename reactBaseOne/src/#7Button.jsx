<button onclick="changeText()">Click Me</button>
<p id="demo">Hello!</p>

<script>
function changeText() {
  document.getElementById("demo").innerHTML = "You clicked the button!";
}
</script>
<script>
function add(a, b) {
  return a + b;
}

console.log(add(5, 3)); // Output: 8
</script>
<script>
window.onload = function() {
  alert("Page Loaded!");
};
</script>
<button onclick="toggleDark()">Toggle Dark Mode</button>

<script>
function toggleDark() {
  document.body.classList.toggle("dark-mode");
}
</script>

<style>
.dark-mode {
  background-color: black;
  color: white;
}
</style>
<p id="clock"></p>

<script>
setInterval(function() {
  const now = new Date();
  document.getElementById("clock").innerHTML = now.toLocaleTimeString();
}, 1000);
</script>
<script>
function getRandom() {
  return Math.floor(Math.random() * 10) + 1;
}

console.log(getRandom());
</script>
<script>
document.addEventListener("keydown", function(event) {
  console.log("You pressed: " + event.key);
});
</script>
<img id="myImage" src="img1.jpg" width="200">
<button onclick="switchImage()">Switch Image</button>

<script>
function switchImage() {
  const img = document.getElementById("myImage");
  img.src = img.src.includes("img1.jpg") ? "img2.jpg" : "img1.jpg";
}
</script>
<form onsubmit="return validateForm()">
  <input type="text" id="name" placeholder="Enter name">
  <input type="submit" value="Submit">
</form>

<script>
function validateForm() {
  const name = document.getElementById("name").value;
  if (name === "") {
    alert("Name must be filled out!");
    return false;
  }
  return true;
}
</script>
function toggleDarkMode() {
  document.body.classList.toggle("dark-mode");
}
function copyToClipboard(text) {
  navigator.clipboard.writeText(text).then(() => {
    alert("Text copied to clipboard!");
  });
}
function isPrime(n) {
  if (n < 2) return false;
  for (let i = 2; i <= Math.sqrt(n); i++) {
    if (n % i === 0) return false;
  }
  return true;
}
function getRandomColor() {
  return "#" + Math.floor(Math.random()*16777215).toString(16);
}
function debounce(func, delay) {
  let timer;
  return function(...args) {
    clearTimeout(timer);
    timer = setTimeout(() => func.apply(this, args), delay);
  };
}
function scrollToTop() {
  window.scrollTo({ top: 0, behavior: "smooth" });
}
function shuffleArray(arr) {
  return arr.sort(() => Math.random() - 0.5);
}
function getQueryParams() {
  return Object.fromEntries(new URLSearchParams(window.location.search));
}
function isEmptyObject(obj) {
  return Object.keys(obj).length === 0;
}
function countdown(seconds) {
  let interval = setInterval(() => {
    console.log(seconds);
    seconds--;
    if (seconds < 0) {
      clearInterval(interval);
      console.log("Time's up!");
    }
  }, 1000);
}
function debounce(func, delay) {
  let timeoutId;
  return (...args) => {
    clearTimeout(timeoutId);
    timeoutId = setTimeout(() => func(...args), delay);
  };
}
function copyToClipboard(text) {
  navigator.clipboard.writeText(text).then(() => {
    console.log("Copied to clipboard!");
  });
}
function isPrime(num) {
  if (num < 2) return false;
  for (let i = 2; i <= Math.sqrt(num); i++) {
    if (num % i === 0) return false;
  }
  return true;
}
function shuffleArray(arr) {
  return arr.sort(() => Math.random() - 0.5);
}
function getRandomColor() {
  return '#' + Math.floor(Math.random() * 16777215).toString(16);
}
function getRandomColor() {
  return '#' + Math.floor(Math.random() * 16777215).toString(16);
}
const isDarkMode = window.matchMedia && window.matchMedia('(prefers-color-scheme: dark)').matches;
console.log("Dark mode is", isDarkMode ? "enabled" : "disabled");
function scrollToTop() {
  window.scrollTo({ top: 0, behavior: 'smooth' });
}
function getQueryParam(param) {
  const urlParams = new URLSearchParams(window.location.search);
  return urlParams.get(param);
}
function isEven(num) {
  return num % 2 === 0;
}

console.log(isEven(4)); // true
function capitalize(str) {
  return str.charAt(0).toUpperCase() + str.slice(1);
}

console.log(capitalize("hello")); // "Hello"
function debounce(func, delay) {
  let timer;
  return function (...args) {
    clearTimeout(timer);
    timer = setTimeout(() => func.apply(this, args), delay);
  };
}
function getRandomColor() {
  return '#' + Math.floor(Math.random() * 16777215).toString(16);
}

console.log(getRandomColor());
function getRandomColor() {
  return '#' + Math.floor(Math.random() * 16777215).toString(16);
}

console.log(getRandomColor());


function copyToClipboard(text) {
  navigator.clipboard.writeText(text).then(() => {
    console.log("Copied to clipboard!");
  });
}

copyToClipboard("Hello, World!");
function isArray(value) {
  return Array.isArray(value);
}

console.log(isArray([1, 2, 3])); // true
function sleep(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

// Usage
sleep(1000).then(() => console.log("1 second passed"));
<input id="task" placeholder="Enter task">
<button onclick="addTask()">Add</button>
<ul id="list"></ul>

<script>
function addTask() {
  let taskText = document.getElementById("task").value;
  let li = document.createElement("li");
  li.textContent = taskText;
  document.getElementById("list").appendChild(li);
}
</script>
fetch('https://jsonplaceholder.typicode.com/posts/1')
  .then(response => response.json())
  .then(data => console.log(data))
  .catch(error => console.error("Error:", error));
  function debounce(func, delay) {
  let timeout;
  return function (...args) {
    clearTimeout(timeout);
    timeout = setTimeout(() => func.apply(this, args), delay);
  };
}

// Example usage
window.addEventListener('resize', debounce(() => {
  console.log("Resized!");
}, 500));
class Animal {
  constructor(name) {
    this.name = name;
  }
  speak() {
    console.log(`${this.name} makes a noise.`);
  }
}

class Dog extends Animal {
  speak() {
    console.log(`${this.name} barks.`);
  }
}

let d = new Dog("Rex");
d.speak(); // Rex barks.
function asyncTask(success = true) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (success) resolve("Task completed!");
      else reject("Task failed.");
    }, 1000);
  });
}

asyncTask(true)
  .then(msg => console.log(msg))
  .catch(err => console.error(err));
  <div id="drag" draggable="true" style="width:100px;height:100px;background:red;"></div>
  <div id="drop" style="width:150px;height:150px;background:lightgray;margin-top:20px;"></div>
  
  <script>
  let drag = document.getElementById("drag");
  drag.addEventListener("dragstart", e => {
    e.dataTransfer.setData("text", "drag");
  });
  
  let drop = document.getElementById("drop");
  drop.addEventListener("dragover", e => e.preventDefault());
  drop.addEventListener("drop", e => {
    e.preventDefault();
    drop.appendChild(drag);
  });
  </script>
  let seconds = 0;
let interval;

function start() {
  interval = setInterval(() => {
    seconds++;
    console.log("Time:", seconds);
  }, 1000);
}

function stop() {
  clearInterval(interval);
}

start();
// call stop() to stop it later
