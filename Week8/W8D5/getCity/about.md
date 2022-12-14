Fetch remote data using async/await
Write an asynchronous function that accepts 1 parameter
A city name
When invoked, this function should use geocode.xyz's API retrieve the city data, which uses a URL formatted as follows:

https://geocode.xyz/seattle?json=1

Once retrieved, print to the console the latitude and longitude
Invoke your async function with a few cities as a test
(Note: the API will only allow you 2 calls per second, so if you are getting errors and you think you shouldn't be, try calling fetching only ONCE per execution.)
