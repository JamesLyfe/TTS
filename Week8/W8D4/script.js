//Example of a synchronous callback
//Greeting Alert Box

function greeting(name) {
  alert(`Hello, ${name}`);
}

function processUserInput(callback) {
  const name = prompt("Please enter your name.");
  callback(name);
}

processUserInput(greeting);


//Example of an asynchronous callback
//A button that will display an alert in 3 seconds

var timeoutID;

function showAlert() {
    timeoutID = setTimeout(alert, 3000, 'Alert!');
}

