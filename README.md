# Погодное приложение на Spring Boot

## 📌 Описание проекта
Приложение использует API OpenWeatherMap для получения данных о погоде и сохраняет историю запросов в базе данных PostgreSQL.

## 🛠️ Технологии
- Java 17
- Spring Boot
- Spring Data JPA
- Thymeleaf
- Lombok
- Gradle
- PostgreSQL.
- OpenWeatherMap.
- HTML
- CSS

# Установка и запуск

1. **Клонируйте репозиторий:**
   ```bash
   git clone https://github.com/ваш-репозиторий/weather-app.git
   cd weather-app
### 2. Настройка базы данных
Создайте базу данных weather_db в PostgreSQL.
В файле `src/main/resources/application.properies` настрой параметры доступа к базе данных:
  ```bash
  spring.datasource.url=jdbc:postgresql://localhost:5432/weather_db
  spring.datasource.username=НАЗВАНИЕ
  spring.datasource.password=ВАШ ПАРОЛЬ
  spring.jpa.hibernate.ddl-auto=update
```
## 📸 Скриншоты
