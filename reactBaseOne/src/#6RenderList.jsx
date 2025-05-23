function getQueryParams() {
  return Object.fromEntries(new URLSearchParams(window.location.search));
}
function scrollToElement(id) {
  document.getElementById(id).scrollIntoView({ behavior: 'smooth' });
}
function shuffleArray(arr) {
  return arr.sort(() => Math.random() - 0.5);
}
