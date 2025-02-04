<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles/styles.css">
    <title>Book Store Home</title>
    <style>
        /* Apply background image */
        body {
            background-image: url("images/cbn.jpg"); /* Ensure correct path */
            background-size: cover;
            background-position: center; /* Fix invalid value */
            background-repeat: no-repeat;
            background-attachment: fixed; /* Keeps background fixed */
            color: rgb(182, 33, 33); /* Ensures text is readable */
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        header {
            text-align: center;
            padding: 20px;
            background: rgba(1, 0, 0, 0.7); /* Semi-transparent background */
        }

        nav ul {
            list-style: none;
            text-align: center;
            padding: 0;
        }

        nav ul li {
            display: inline;
            margin: 0 15px;
        }

        nav ul li a {
            color: white;
            text-decoration: none;
            font-size: 18px;
            font-weight: bold;
        }

        main {
            padding: 50px;
            text-align: center;
            background: rgba(0, 0, 0, 0.5); /* Semi-transparent overlay */
            margin: 50px auto;
            border-radius: 10px;
            max-width: 80%;
        }

        /* Make paragraph content bold */
        main p {
            font-weight: bold;
        }

        footer {
            text-align: center;
            padding: 20px;
            background: rgba(0, 0, 0, 0.7);
        }
    </style>
</head>
<body>
    <header>
        <h1>Welcome to our bookstore</h1>
    </header>
    <nav>
        <ul>
            <li><a href="index.html">Home</a></li>
            <li><a href="books.html">Books</a></li>
            <li><a href="contacts.html">Contact</a></li>
        </ul>
    </nav>
    <main>
        <p>
            Welcome to <strong>Books Store</strong>, your one-stop destination for a diverse
            collection of books across all genres. Whether you're a fan of fiction,
            non-fiction, mystery, romance, or self-improvement, we have something
            for every reader. Our carefully curated selection ensures that book
            lovers of all ages can find their next great read. Explore our
            collection and embark on a journey of knowledge, adventure, and
            imagination!
        </p>
    </main>
    <footer>
        <p>&copy; 2025 Books Store, All rights reserved.</p>
    </footer>
</body>
</html>


