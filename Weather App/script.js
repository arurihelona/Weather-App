const apiKey = "YOUR_API_KEY_HERE";
weatherIcon.src="images/hello.png";
async function getWeather() {
    const city = document.getElementById("city").value;
    const result = document.getElementById("result");
    const weatherIcon = document.getElementById("weatherIcon");

    if (city === "") {
        result.innerHTML = "Please enter a city name!";
        weatherIcon.src="images/hello.png";
        return;
    }

    const url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}&units=metric`;

    try {
        const response = await fetch(url);
        const data = await response.json();

        if (data.cod === "404") {
            result.innerHTML = "City not found!";
            weatherIcon.src="images/not-found.png";
            return;
        }

        const mainWeather = data.weather[0].main.toLowerCase();

        if (mainWeather.includes("cloud")) {
            weatherIcon.src = "images/cloud.png";
        } else if (mainWeather.includes("clear")) {
            weatherIcon.src = "images/sun.png";
        } else if (mainWeather.includes("rain")) {
            weatherIcon.src = "images/rain.png";
        } else if (mainWeather.includes("storm") || mainWeather.includes("thunder")) {
            weatherIcon.src = "images/storm.png";
        } else if (mainWeather.includes("snow")) {
            weatherIcon.src = "images/snow.png";
        } else if (mainWeather.includes("mist") || mainWeather.includes("haze") || mainWeather.includes("fog")) {
            weatherIcon.src = "images/mist.png";
        } else {
            weatherIcon.src = "images/not-found.png";
        }

        result.innerHTML = `
            <p><strong>${data.name}</strong></p>
            <p>Temperature: ${data.main.temp}°C</p>
            <p>Weather: ${data.weather[0].description}</p>
            <p>Humidity: ${data.main.humidity}%</p>
        `;
    } catch (error) {
        result.innerHTML = "Error fetching weather!";
        weatherIcon.src = "images/not-found.png";

    }
}
