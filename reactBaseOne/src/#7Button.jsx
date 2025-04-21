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
