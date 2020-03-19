## java-exercise

You need Java 11 installed

Clone
--------

```sh
git clone https://github.com/SebastianGamboa/java-exercise.git
```

Run
--------

```sh
./gradlew bootRun
```

Access
--------

### Get all users
### GET Method

```
http://localhost:8080/api/users
```

### Get user by id
### GET Method

```
http://localhost:8080/api/users/:id
```

### Save user
### POST Method

```
http://localhost:8080/api/users
```

Request body:

```json
{"name":"Pepito Pérez", "birthdate": "1990-02-28"}
```

### Update user
### PUT Method

```
http://localhost:8080/api/users/:id
```

Request body:

```json
{"name":"Pepe", "birthdate": "1990-02-28"}
```

### Delete user
### DELETE Method

```
http://localhost:8080/api/users/:id
```
