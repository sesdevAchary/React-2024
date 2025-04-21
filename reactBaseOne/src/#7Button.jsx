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
