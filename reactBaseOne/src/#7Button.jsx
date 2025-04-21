<button onclick="changeText()">Click Me</button>
<p id="demo">Hello!</p>

<script>
function changeText() {
  document.getElementById("demo").innerHTML = "You clicked the button!";
}
</script>
