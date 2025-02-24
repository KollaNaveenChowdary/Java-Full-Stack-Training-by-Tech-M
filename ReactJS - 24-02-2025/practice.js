function Portfolio() {
    return (
        <div>
            {/* Profile Image */}
            <img src="images/na.jpg" alt="Profile" className="profile-img" />

            <h1>Welcome to My Portfolio</h1>
            <h2>I am <b>KOLLA NAVEEN CHOWDARY</b></h2>
            <p>Aspiring ReactJS Developer | Passionate about Web Development</p>
            <button onClick={() => alert('Thanks for visiting!')}>Contact Me</button>

            {/* Projects Section */}
            <div className="projects">
                <h3>My Projects</h3>
                <div className="project-container">
                    <img src="images/project1.jpg" alt="Project 1" className="project" />
                    <img src="images/project2.jpeg" alt="Project 2" className="project" />
                </div>
            </div>
        </div>
    );
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Portfolio />);
