package com.mayezer.coursejava.lesson_1_28_folder_structure;

public class FolderStructure {

    /*

    nomedoprojeto/
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/mayezer/nomedoprojeto/
    │   │   │       ├── config/
    │   │   │       │   └── AppConfig.java
    │   │   │       ├── controller/
    │   │   │       │   └── ExemploController.java
    │   │   │       ├── service/
    │   │   │       │   └── ExemploService.java
    │   │   │       ├── repository/
    │   │   │       │   └── ExemploRepository.java
    │   │   │       ├── model/
    │   │   │       │   └── Exemplo.java
    │   │   │       └── Main.java
    │   │   └── resources/
    │   │       └── application.properties
    │   │
    │   └── test/
    │       ├── java/
    │       │   └── com/mayezer/nomedoprojeto/
    │       │       ├── service/
    │       │       │   └── ExemploServiceTest.java
    │       │       └── repository/
    │       │           └── ExemploRepositoryTest.java
    │       └── resources/
    │
    ├── build.gradle
    ├── settings.gradle
    ├── gradlew
    ├── gradlew.bat
    ├── gradle/
    ├── .gitignore
    └── README.md

----------------------------------------------------------------------------------------------------------------------------

    nomedoprojeto/
    │
    ├── src/
    │   │
    │   ├── main/
    │   │   │
    │   │   ├── java/
    │   │   │   └── com/
    │   │   │       └── mayezer/
    │   │   │           └── nomedoprojeto/
    │   │   │               │
    │   │   │               ├── config/
    │   │   │               │   └── SecurityConfig.java
    │   │   │               │
    │   │   │               ├── controller/
    │   │   │               │   ├── HomeController.java
    │   │   │               │   └── UserController.java
    │   │   │               │
    │   │   │               ├── service/
    │   │   │               │   ├── UserService.java
    │   │   │               │   └── EmailService.java
    │   │   │               │
    │   │   │               ├── repository/
    │   │   │               │   └── UserRepository.java
    │   │   │               │
    │   │   │               ├── model/
    │   │   │               │   └── User.java
    │   │   │               │
    │   │   │               ├── dto/
    │   │   │               │   ├── UserRequestDTO.java
    │   │   │               │   └── UserResponseDTO.java
    │   │   │               │
    │   │   │               ├── exception/
    │   │   │               │   ├── ResourceNotFoundException.java
    │   │   │               │   └── GlobalExceptionHandler.java
    │   │   │               │
    │   │   │               ├── util/
    │   │   │               │   └── DateUtils.java
    │   │   │               │
    │   │   │               └── NomeDoProjetoApplication.java
    │   │   │
    │   │   └── resources/
    │   │       │
    │   │       ├── static/
    │   │       │   │
    │   │       │   ├── css/
    │   │       │   │   ├── style.css
    │   │       │   │   └── responsive.css
    │   │       │   │
    │   │       │   ├── js/
    │   │       │   │   └── script.js
    │   │       │   │
    │   │       │   ├── images/
    │   │       │   │   ├── logo.png
    │   │       │   │   └── banner.jpg
    │   │       │   │
    │   │       │   ├── fonts/
    │   │       │   │   └── custom-font.woff2
    │   │       │   │
    │   │       │   ├── favicon.ico
    │   │       │   └── index.html
    │   │       │
    │   │       ├── templates/
    │   │       │   ├── home.html
    │   │       │   ├── login.html
    │   │       │   └── dashboard.html
    │   │       │
    │   │       ├── db/
    │   │       │   └── migration/
    │   │       │       └── V1__create_users.sql
    │   │       │
    │   │       ├── application.properties
    │   │       ├── application-dev.properties
    │   │       └── application-prod.properties
    │   │
    │   └── test/
    │       │
    │       ├── java/
    │       │   └── com/
    │       │       └── mayezer/
    │       │           └── nomedoprojeto/
    │       │               │
    │       │               ├── controller/
    │       │               │   └── UserControllerTest.java
    │       │               │
    │       │               ├── service/
    │       │               │   └── UserServiceTest.java
    │       │               │
    │       │               ├── repository/
    │       │               │   └── UserRepositoryTest.java
    │       │               │
    │       │               └── NomeDoProjetoApplicationTests.java
    │       │
    │       └── resources/
    │           └── application-test.properties
    │
    ├── gradle/
    │   └── wrapper/
    │       ├── gradle-wrapper.jar
    │       └── gradle-wrapper.properties
    │
    ├── build.gradle
    ├── settings.gradle
    ├── gradlew
    ├── gradlew.bat
    │
    ├── Dockerfile
    ├── docker-compose.yml
    │
    ├── .env
    ├── .env.example
    ├── .gitignore
    └── README.md

    */
}
