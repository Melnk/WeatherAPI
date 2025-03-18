package com.example.calculator.Service;

import com.example.calculator.DTO.WeatherResponse;
import com.example.calculator.Entity.WeatherEntity;
import com.example.calculator.Repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class WeatherService {
    @Value("${openweathermap.api.key}")
    private String apiKey;

    private RestTemplate restTemplate;
    private WeatherRepository weatherRepository;

    public WeatherService(RestTemplate restTemplate, WeatherRepository weatherRepository) {
        this.restTemplate = restTemplate;
        this.weatherRepository = weatherRepository;
    }

    public WeatherResponse getWeather(String city) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";
        WeatherResponse weatherResponse = restTemplate.getForObject(url, WeatherResponse.class);

        // Сохраняем данные в базу
        WeatherEntity entity = new WeatherEntity();
        entity.setCity(city);
        entity.setWeather(weatherResponse.toString()); // Сохраняем разобранные данные
        entity.setTimestamp(LocalDate.from(LocalDateTime.now()));
        weatherRepository.save(entity);

        return weatherResponse;
    }
}
