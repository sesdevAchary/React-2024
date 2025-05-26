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
  function promisify(fn) {
    return function (...args) {
      return new Promise((resolve, reject) => {
        fn(...args, (err, result) => {
          if (err) return reject(err);
          resolve(result);
        });
      });
    };
  }
  async function asyncPool(limit, tasks) {
    const results = [];
    const executing = new Set();
  
    for (const task of tasks) {
      const p = task().then(res => {
        executing.delete(p);
        return res;
      });
      executing.add(p);
      results.push(p);
  
      if (executing.size >= limit) {
        await Promise.race(executing);
      }
    }
  
    return Promise.all(results);
  }
  function memoize(fn) {
    const cache = new Map();
    return function (...args) {
      const key = JSON.stringify(args);
      if (cache.has(key)) return cache.get(key);
      const result = fn(...args);
      return result;
    };
  }
const compose = (...fns) => x => fns.reduceRight((v, f) => f(v), x);
function $(selector, root = document) {
  return [...root.querySelectorAll(selector)];
}
class Subject {
  constructor() {
    this.observers = new Set();
  }

  subscribe(observer) {
    this.observers.add(observer);
  }

  unsubscribe(observer) {
    this.observers.delete(observer);
  }

  notify(data) {
    this.observers.forEach(observer => observer.update(data));
  }
}

class Observer {
  update(data) {
    console.log('Received:', data);
  }
}
function $(selector, root = document) {
  return [...root.querySelectorAll(selector)];
}
function createState(initial) {
  let value = initial;
  const listeners = new Set();
  return {
    get: () => value,
    set: (v) => {
      value = v;
      listeners.forEach(fn => fn(value));
    },
    subscribe: (fn) => {
      listeners.add(fn);
      return () => listeners.delete(fn);
    },
  };
}
function curry(fn) {
  return function curried(...args) {
    return args.length >= fn.length
      ? fn(...args)
      : (...next) => curried(...args, ...next);
  };
}
function binarySearch(arr, target) {
  let [left, right] = [0, arr.length - 1];
  while (left <= right) {
    const mid = left + Math.floor((right - left) / 2);
    if (arr[mid] === target) return mid;
    if (arr[mid] < target) left = mid + 1;
    else right = mid - 1;
  }
  return -1;
}
class LRUCache {
  constructor(capacity) {
    this.capacity = capacity;
    this.map = new Map();
  }

  get(key) {
    if (!this.map.has(key)) return -1;
    const value = this.map.get(key);
    this.map.delete(key);
    this.map.set(key, value);
    return value;
  }

  put(key, value) {
    if (this.map.has(key)) this.map.delete(key);
    this.map.set(key, value);
    if (this.map.size > this.capacity) {
      this.map.delete(this.map.keys().next().value);
    }
  }
}
function flattenObject(obj, prefix = '', res = {}) {
  for (let key in obj) {
    const newKey = prefix ? `${prefix}.${key}` : key;
    if (typeof obj[key] === 'object' && obj[key] !== null) {
      flattenObject(obj[key], newKey, res);
    } else {
      res[newKey] = obj[key];
    }
  }
  return res;
}
async function* asyncGenerator(arr) {
  for (const item of arr) {
    await new Promise(r => setTimeout(r, 100));
    yield item;
  }
}
class Subject {
  constructor() {
    this.observers = [];
  }
  subscribe(observer) {
    this.observers.push(observer);
  }
  notify(data) {
    this.observers.forEach(observer => observer(data));
  }
}
function throttle(fn, limit) {
  let inThrottle;
  return function (...args) {
    if (!inThrottle) {
      fn.apply(this, args);
      inThrottle = true;
      setTimeout(() => (inThrottle = false), limit);
    }
  };
}
function sum(a) {
  const inner = (b) => sum(a + b);
  inner.valueOf = () => a;
  return inner;
}
const myIterable = {
  *[Symbol.iterator]() {
    yield 1;
    yield 2;
    yield 3;
  }
};
const user = new Proxy({}, {
  set(obj, prop, value) {
    if (prop === 'age' && typeof value !== 'number') {
      throw new TypeError('Age must be a number');
    }
    obj[prop] = value;
    return true;
  }
});
const workerCode = () => {
  onmessage = function(e) {
    postMessage(e.data * 2);
  };
};

const blob = new Blob(['(' + workerCode.toString() + ')()'], { type: 'application/javascript' });
const worker = new Worker(URL.createObjectURL(blob));
worker.onmessage = e => console.log('Result:', e.data);
worker.postMessage(10);
