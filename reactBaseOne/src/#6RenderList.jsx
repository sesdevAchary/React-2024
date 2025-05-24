function getQueryParams() {
  return Object.fromEntries(new URLSearchParams(window.location.search));
}
function scrollToElement(id) {
  document.getElementById(id).scrollIntoView({ behavior: 'smooth' });
}
function shuffleArray(arr) {
  return arr.sort(() => Math.random() - 0.5);
}
function isPrime(n) {
  if (n <= 1) return false;
  for (let i = 2; i <= Math.sqrt(n); i++) {
    if (n % i === 0) return false;
  }
  return true;
}
function startCountdown(seconds) {
  const interval = setInterval(() => {
    console.log(seconds--);
    if (seconds < 0) clearInterval(interval);
  }, 1000);
}
function isMobileDevice() {
  return /Mobi|Android/i.test(navigator.userAgent);
}
function randomHexColor() {
  return '#' + Math.floor(Math.random()*16777215).toString(16);
}
function debounce(func, delay) {
  let timeout;
  return function (...args) {
    clearTimeout(timeout);
    timeout = setTimeout(() => func.apply(this, args), delay);
  };
}
function copyText(text) {
  navigator.clipboard.writeText(text)
    .then(() => alert('Copied!'))
    .catch(err => alert('Failed to copy!'));
}
function toggleDarkMode() {
  document.body.classList.toggle('dark-mode');
}
function isPrime(n) {
  if (n <= 1) return false;
  for (let i = 2; i <= Math.sqrt(n); i++) {
    if (n % i === 0) return false;
  }
  return true;
}
function shuffleArray(arr) {
  return arr.sort(() => Math.random() - 0.5);
}

fetch('https://jsonplaceholder.typicode.com/posts/1')
  .then(response => response.json())
  .then(data => console.log(data))
  .catch(error => console.error('Error:', error));
