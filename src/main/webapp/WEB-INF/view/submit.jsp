<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Spring Form Demo</title>

    <link rel="stylesheet" href="/vendor/normalize.css">
    <link rel="stylesheet" href="/vendor/skeleton.css">

    <link rel="stylesheet" href="/style.css">
</head>
<body>
    <div class="container">
        <h1>Submitted Form</h1>
        <form>
            <div class="row">
                <div class="ten columns">
                    <label for="name">Full Name</label>
                    <input type="text" class="u-full-width" value="${param.name}" id="name" name="name" disabled>
                </div>
                <div class="two columns">
                    <label for="age">How old are you?</label>
                    <input type="number" class="u-full-width" value="${param.age}" id="age" min="10" max="99" name="age" disabled>
                </div>
            </div>
            <div class="row">
                <label for="email">Email</label>
                <input type="email" class="u-full-width" value="${param.email}" id="email" name="email" disabled>
            </div>
        </form>
    </div>
</body>
</html>