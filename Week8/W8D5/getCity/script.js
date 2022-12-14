async function getCity(city) {
  const res = await fetch(`https://geocode.xyz/${city}?json=1`);
  const data = await res.json();
  console.log(`${data.latt} ${data.longt}`);
}


getCity("Boston");