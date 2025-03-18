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
### 3. Получите API-ключ OpenWeatherMap:

Зарегистрируйтесь на OpenWeatherMap и получите API-ключ.

Добавьте ключ в application.properties:
```bash
openweathermap.api.key=ваш_api_ключ
```
## 📸 Скриншоты
**Главная страница**
![image](https://github.com/user-attachments/assets/fddb902d-4d5a-4d5e-b2ba-01386090cead)
**Вывод погоды**
![image](https://github.com/user-attachments/assets/67b392db-8ea2-41d3-b4ca-bbfc21821251)
**Обработка ошибок**
![image](https://github.com/user-attachments/assets/1ef18ca5-6349-4e6f-bad0-8143b92866cd)

