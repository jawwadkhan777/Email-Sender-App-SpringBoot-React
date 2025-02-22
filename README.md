# 📧 Email Sender App

## 🚀 Project Overview
The **Email Sender App** is a full-stack application that allows users to send emails with attachments. The frontend is built using **React.js**, while the backend is powered by **Spring Boot**. The app features a rich text editor for composing messages, along with file attachment functionality.

---

## 📂 Folder Structure
```
email-sender-app/
├── backend/     # Spring Boot backend
├── frontend/    # React frontend
├── README.md    # Documentation
```

---

## 🛠️ Tech Stack
### **Frontend (React.js)**
- React.js with functional components
- TinyMCE Rich Text Editor
- Tailwind CSS for styling

### **Backend (Spring Boot)**
- Spring Boot
- Spring MVC & REST API
- Input Stream for file attachment

---

## 🎯 Features
✅ Send emails with **To, Subject, and Message** fields  
✅ Use **rich text editor** for formatting messages  
✅ Attach file before sending email  
✅ Validate email inputs to prevent errors  
✅ Backend handles **email sending using JavaMail API**  
✅ Error handling for failed email deliveries  
✅ Responsive UI for a seamless experience  

---

## 🏗️ Installation & Setup
### **1️⃣ Clone the Repository**
```bash
git clone https://github.com/your-username/email-sender-app.git
cd email-sender-app
```

### **2️⃣ Setup Backend (Spring Boot)**
```bash
cd backend
mvn clean install
mvn spring-boot:run
```

Ensure you configure **SMTP settings** in `application.properties`:
```properties
spring.mail.host=smtp.example.com
spring.mail.port=587
spring.mail.username=your-email@example.com
spring.mail.password=your-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

### **3️⃣ Setup Frontend (React.js)**
```bash
cd frontend
npm install
npm start
```

This will start the React development server on `http://localhost:3000`.

---

## ⚡ API Endpoints (Backend)
| Method | Endpoint | Description |
|--------|----------|-------------|
<<<<<<< HEAD
| POST   | `/api/v1/email/send` | Send an email without attachments |
| POST   | `/api/v1/email/send-with-file` | Send an email with attachments |
=======
| POST   | `/api/v1/email/send` | Send an email without attachment |
| POST   | `/api/v1/email/send-with-file` | Send an email with attachment |
>>>>>>> 57a96abbbff82bd485f500eb268a2bd83205bec5

Example JSON payload:
```json
{
  "to": "recipient@example.com",
  "subject": "Hello!",
  "message": "<h1>Welcome</h1><p>This is a test email.</p>",
  "attachments": "document.pdf"
}
```

---

## 📜 License
This project is **open-source** and available under the [MIT License](LICENSE).

---

## 🏆 Acknowledgments
Special thanks to the **Spring Boot** and **React** communities for their great documentation and support!

---

## 🤝 Contributing
Contributions are welcome! Feel free to **fork** this repository and submit a **pull request**. 🙌

---

## 📞 Contact
For any issues or suggestions, reach out at:
📧 **m.jawwadkhan777@gmail.com**  
🔗 [LinkedIn Profile](https://www.linkedin.com/in/jawwadkhan777/)
