//Write a function called get getRandomNumber
function getRandomNumber() {
	return new Promise(resolve => 

//In the promise, write a setTimeout() that will resolve the promise with a random number after .5 seconds
		setTimeout(() => {
			var randomNumber = Math.floor(Math.random() * 10);
			resolve(randomNumber);
		}, 500)
	)
} 

//Write an async function that invokes the getRandomNumber function, awaiting the random number, and printing that to the console.
async function print() {
    let result =  await getRandomNumber();
    console.log(result);
}

//Invoke your async function
print();
