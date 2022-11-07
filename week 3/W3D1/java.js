//challenge one //

let cups = 1

if(cups < 3){
    console.log("Yes. I'll take another cup of coffee!");
} else {
    console.log("I think I'm okay for now.");
}

//challenge two//

let temp = 85;
let precipitation = false;
let indoors = true;

console.log("The temperature is " + temp + " degrees");

if (temp > 80 && precipitation === false) {
  console.log("time to swim!");
} else if (indoors) {
  console.log("time to swim!");
}

//Challenge three - loops //

for (let bottle = 99; bottle >= 0; bottle --){
 
  if (bottle === 0) {
    console.log("Hey! We need more root beer!");
  } else {
      console.log(bottle + " bottles of root beer on the wall");
  }
}

//Challenge four 