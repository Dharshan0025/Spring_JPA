# JPA Demo – Employee Management API

This project is a **Spring Boot REST API** for managing employee details using **Spring Data JPA** and **MySQL Database**.  
It demonstrates **CRUD operations** with a layered architecture (Controller → Service → Repository → Database).

---

## 🚀 Features
- Add new employees  
- Fetch employee by ID  
- Fetch all employees  
- Update employee details  
- Delete employee by ID  
- Delete all employees  

---

## 🛠️ Tech Stack
- Spring Boot  
- Spring Data JPA  
- MySQL Database (configurable)  
- Lombok  

---

## 📂 Project Structure
<img width="697" height="443" alt="image" src="https://github.com/user-attachments/assets/4cc3b807-feee-4b8c-b5f5-13057161191d" />


---

## 📌 API Endpoints

| Method   | Endpoint   | Description           |
|----------|------------|-----------------------|
| `POST`   | `/emp`     | Add new employee      |
| `GET`    | `/emp/{id}`| Get employee by ID    |
| `GET`    | `/emp`     | Get all employees     |
| `PUT`    | `/emp`     | Update employee       |
| `DELETE` | `/emp/{id}`| Delete employee by ID |
| `DELETE` | `/emp`     | Delete all employees  |

---

## 🧪 Example Request (Add Employee)

**POST** `http://localhost:8080/emp`

```json
{
  "id": 1,
  "name": "John Doe",
  "department": "IT",
  "salary": 55000
}

Response

Employee details added successfully

