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
