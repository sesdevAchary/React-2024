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
  function copyText(text) {
    navigator.clipboard.writeText(text).then(() => {
      console.log("Copied!");
    }).catch(err => {
      console.error("Failed to copy: ", err);
    });
  }
  copyText("Hello from JavaScript!");
  function countdown(seconds) {
    const interval = setInterval(() => {
      console.log(seconds);
      if (seconds-- <= 0) clearInterval(interval);
    }, 1000);
  }
  countdown(5);
  function isPalindrome(str) {
    const clean = str.toLowerCase().replace(/[^a-z0-9]/g, "");
    return clean === clean.split("").reverse().join("");
  }
  console.log(isPalindrome("A man, a plan, a canal, Panama")); // true
  function getRandom(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
  }
  console.log(getRandom(1, 10));
  function capitalizeWords(str) {
    return str.replace(/\b\w/g, char => char.toUpperCase());
  }
  console.log(capitalizeWords("hello world")); // "Hello World"
  function debounce(fn, delay) {
    let timeoutId;
    return function(...args) {
      clearTimeout(timeoutId);
      timeoutId = setTimeout(() => fn.apply(this, args), delay);
    };
  }
  function getRandom(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
  }
  console.log(getRandom(1, 10));
  function reverseString(str) {
    return str.split("").reverse().join("");
  }
  console.log(reverseString("hello")); // "olleh"
  function isEven(num) {
    return num % 2 === 0 ? "Even" : "Odd";
  }
  console.log(isEven(7)); // Odd
  function isPalindrome(str) {
    const clean = str.toLowerCase().replace(/[^a-z0-9]/g, "");
    return clean === clean.split("").reverse().join("");
  }
  console.log(isPalindrome("A man, a plan, a canal, Panama")); // true
  function isEven(num) {
    return num % 2 === 0 ? "Even" : "Odd";
  }
  console.log(isEven(7)); // Odd
  function isEven(num) {
    return num % 2 === 0 ? "Even" : "Odd";
  }
  console.log(isEven(7)); // Odd
  function deepClone(obj, map = new WeakMap()) {
    if (obj === null || typeof obj !== 'object') return obj;
    if (map.has(obj)) return map.get(obj);
  
    const result = Array.isArray(obj) ? [] : {};
    map.set(obj, result);
  
    for (let key of Reflect.ownKeys(obj)) {
      result[key] = deepClone(obj[key], map);
    }
    return result;
  }
  class EventEmitter {
    constructor() {
      this.events = {};
    }
  
    on(event, listener) {
      (this.events[event] ||= []).push(listener);
    }
  
    emit(event, ...args) {
      (this.events[event] || []).forEach(fn => fn(...args));
    }
  
    off(event, listener) {
      this.events[event] = (this.events[event] || []).filter(fn => fn !== listener);
    }
  }
  function debounce(fn, delay) {
    let timer;
    return function (...args) {
      clearTimeout(timer);
      timer = setTimeout(() => fn.apply(this, args), delay);
    };
  }
  function lazy(fn) {
    let cached = false;
    let result;
    return new Proxy(() => {}, {
      apply(_, __, args) {
        if (!cached) {
          result = fn(...args);
          cached = true;
        }
        return result;
      }
    });
  }
  