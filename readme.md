# 👨‍💻 User Management System (Spring Boot + Thymeleaf + MySQL)

This is a simple **User Management Web Application** built using **Spring Boot**, **Thymeleaf**, and **MySQL**. It allows users to be **added**, **viewed**, and **stored** in a relational database. The project follows the traditional **MVC architecture** and uses basic HTML/CSS for styling.

---

## 🔧 Tech Stack

- **Backend:** Spring Boot (Spring Web, Spring Data JPA)
- **View Layer:** Thymeleaf Templates
- **Database:** MySQL
- **Build Tool:** Maven
- **Java Version:** 21
- **CSS Styling:** Plain CSS (no Bootstrap)

---

## ✨ Features

- Add new users with name and email
- View list of all users in a table
- Form validation (HTML5-based)
- Styled using custom CSS

---

## 📂 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com.example.demo/
│   │       ├── controller/         # Handles web requests
│   │       ├── model/              # JPA entity (User.java)
│   │       └── repository/         # Spring Data JPA repository
│   ├── resources/
│   │   ├── templates/
│   │   │   ├── user-form.html      # Form for adding users
│   │   │   └── user-list.html      # Displays users in table
│   │   └── static/css/style.css    # Custom CSS styling
│   └── application.properties      # DB config & server port
```

---

## ⚙️ How to Run

### 1. 🧑‍💻 Prerequisites

- Java 21
- Maven
- MySQL running on port **3380** (or adjust it in `application.properties`)

### 2. 🛠️ Configure Database

```properties
# src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3380/your_db_name
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.thymeleaf.cache=false
server.port=8085
```

### 3. ▶️ Run the Application

```bash
mvn spring-boot:run
```

Navigate to: [http://localhost:8085/users](http://localhost:8085/users)

---

## 📸 Screenshots

> Add screenshots of `user-list.html` and `user-form.html` pages once running. You can paste them here to make the project look polished.

---

## 🤝 Author

**Nandu Ayush Kumar Choudhary**\
📧 [choudharyayush344@gmail.com](mailto\:choudharyayush344@gmail.com)\
🔗 [LinkedIn](https://www.linkedin.com/in/nandu-ayush-kumar-choudhary-93053421b/)\
💻 [GitHub](https://github.com/Ayushchoudhary1064)

---

## 📝 License

This project is open for learning and practice. No commercial use without permission.

