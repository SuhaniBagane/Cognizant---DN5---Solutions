// Exercise 1
console.log("Welcome to the Community Portal");

window.onload = function () {

    alert("Page Loaded Successfully");

    // Exercise 2
    if (document.getElementById("result")) {

        const eventName = "Music Festival";
        const eventDate = "20 June 2026";
        let seats = 50;

        seats--;

        document.getElementById("result").innerHTML =
            `Event: ${eventName}<br>
             Date: ${eventDate}<br>
             Available Seats: ${seats}`;
    }

};

// Exercise 3
const events = [
    { name: "Music Festival", seats: 10, upcoming: true },
    { name: "Food Carnival", seats: 0, upcoming: true },
    { name: "Book Fair", seats: 20, upcoming: false }
];

if (document.getElementById("eventList")) {

    events.forEach(function (event) {

        if (event.upcoming && event.seats > 0) {

            const p = document.createElement("p");
            p.innerHTML = event.name;

            document.getElementById("eventList").appendChild(p);
        }

    });

}

// Exercise 4
function addEvent() {

    document.getElementById("output").innerHTML = "Event Added";

}

function registerUser() {

    document.getElementById("output").innerHTML = "User Registered";

}

function filterEventsByCategory(callback) {

    callback();

}

// Exercise 5
class Event {

    constructor(name, seats) {

        this.name = name;
        this.seats = seats;

    }

}

Event.prototype.checkAvailability = function () {

    return this.seats > 0;

};

// Exercise 6
let eventArray = ["Music Festival", "Workshop"];

eventArray.push("Sports Meet");

let musicEvents = eventArray.filter(function (item) {

    return item.includes("Music");

});

let displayEvents = eventArray.map(function (item) {

    return "Workshop on " + item;

});

// Exercise 7
if (document.getElementById("showEventsBtn")) {

    document.getElementById("showEventsBtn").onclick = function () {

        const card = document.createElement("div");

        card.innerHTML = "Community Event Card";

        document.getElementById("eventContainer").appendChild(card);

    };

}

// Exercise 8
if (document.getElementById("registerBtn")) {

    document.getElementById("registerBtn").onclick = function () {

        if (document.getElementById("output")) {

            document.getElementById("output").innerHTML =
                "Registration Successful";

        }

    };

}

if (document.getElementById("category")) {

    document.getElementById("category").onchange = function () {

        if (document.getElementById("output")) {

            document.getElementById("output").innerHTML =
                "Category: " + this.value;

        }

    };

}

if (document.getElementById("search")) {

    document.getElementById("search").onkeydown = function () {

        console.log("Searching...");

    };

}

// Exercise 9
if (document.getElementById("loadEventsBtn")) {

    document.getElementById("loadEventsBtn").onclick = async function () {

        if (document.getElementById("loading")) {

            document.getElementById("loading").style.display = "block";

        }

        setTimeout(function () {

            if (document.getElementById("loading")) {

                document.getElementById("loading").innerHTML =
                    "Events Loaded";

            }

        }, 1000);

    };

}

// Exercise 10
function showEvent(eventName = "Music Festival") {

    const details = {

        name: eventName,
        location: "City Park"

    };

    const { name, location } = details;

    const copy = [...eventArray];

    if (document.getElementById("output")) {

        document.getElementById("output").innerHTML =
            name + " - " + location;

    }

}

// Exercise 11
if (document.getElementById("registrationForm")) {

    document.getElementById("registrationForm").onsubmit = function (event) {

        event.preventDefault();

        const form = event.target;

        const name = form.elements["name"].value;
        const email = form.elements["email"].value;
        const selectedEvent = form.elements["event"].value;

        if (name === "" || email === "" || selectedEvent === "") {

            document.getElementById("errorMessage").innerHTML =
                "Please fill all fields.";

        } else {

            document.getElementById("errorMessage").innerHTML =
                "Registration Successful.";

        }

    };

}

// Exercise 12
if (document.getElementById("submitBtn")) {

    document.getElementById("submitBtn").onclick = function () {

        document.getElementById("status").innerHTML =
            "Sending Registration...";

        setTimeout(function () {

            document.getElementById("status").innerHTML =
                "Registration Submitted Successfully";

        }, 2000);

    };

}

// Exercise 13
if (document.getElementById("debugForm")) {

    document.getElementById("debugForm").onsubmit = function (event) {

        event.preventDefault();

        console.log("Form Submitted");

        document.getElementById("message").innerHTML =
            "Check Console for Debug Logs";

    };

}

// Exercise 14
if (typeof $ !== "undefined") {

    $(document).ready(function () {

        $("#registerBtn").click(function () {

            alert("Registration Successful");

        });

        $("#showBtn").click(function () {

            $("#eventCard").fadeIn();

        });

        $("#hideBtn").click(function () {

            $("#eventCard").fadeOut();

        });

    });

}