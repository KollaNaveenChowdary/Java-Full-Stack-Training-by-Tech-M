fetch("data/speakers.json")
    .then(response => response.json())
    .then(speakers => {
        let speakersHTML = "";
        speakers.forEach(speaker => {
            speakersHTML += `
                <div class="col-md-4">
                    <div class="card">
                        <img src="${speaker.image}" class="card-img-top">
                        <div class="card-body">
                            <h5>${speaker.name}</h5>
                            <p>${speaker.topic}</p>
                        </div>
                    </div>
                </div>`;
        });
        document.getElementById("speakers-container").innerHTML = speakersHTML;
    });
