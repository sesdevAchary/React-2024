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
