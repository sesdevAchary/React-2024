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
