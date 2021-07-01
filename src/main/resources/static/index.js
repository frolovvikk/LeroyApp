function onEntry(entry) {
  entry.forEach((change) => {
    if (change.isIntersecting) {
      change.target.classList.add("element-show");
    } else {
      change.target.classList.remove("element-show");
    }
  });
}

let options = {
  threshold: [0.05],
};
let observer = new IntersectionObserver(onEntry, options);
let elements = document.querySelectorAll(".whoiam");

for (let elm of elements) {
  observer.observe(elm);
}
//scrollup


//location

function onEntry1(entry) {
  entry.forEach((change) => {
    if (change.isIntersecting) {
      change.target.classList.add("element-show");
    } else {
      change.target.classList.remove("element-show");
    }
  });
}

let options1 = {
  threshold: [0.05],
};
let observer1 = new IntersectionObserver(onEntry1, options1);
let elements1 = document.querySelectorAll(".location");

for (let elm of elements1) {
  observer.observe(elm);
}

//edu

function onEntry2(entry) {
  entry.forEach((change) => {
    if (change.isIntersecting) {
      change.target.classList.add("element-show");
    } else {
      change.target.classList.remove("element-show");
    }
  });
}

let options2 = {
  threshold: [0.05],
};
let observer2 = new IntersectionObserver(onEntry2, options2);
let elements2 = document.querySelectorAll(".edu");

for (let elm of elements2) {
  observer.observe(elm);
}

//edu
function onEntry3(entry) {
  entry.forEach((change) => {
    if (change.isIntersecting) {
      change.target.classList.add("element-show");
    } else {
      change.target.classList.remove("element-show");
    }
  });
}

let options3 = {
  threshold: [0.05],
};
let observer3 = new IntersectionObserver(onEntry3, options3);
let elements3 = document.querySelectorAll(".projects");

for (let elm of elements3) {
  observer.observe(elm);
}

//scroll
