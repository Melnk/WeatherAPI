package com.example.calculator.Controller;

import com.example.calculator.DTO.WeatherResponse;
import com.example.calculator.Service.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/weather")
    public String getWeather(@RequestParam String city, Model model) {
        try {
            WeatherResponse weatherResponse = weatherService.getWeather(city);
            model.addAttribute("weather", weatherResponse);
            model.addAttribute("city", city);
            return "weather";
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Город не найден. Пожалуйста, проверьте правильность ввода.");
            return "error";
        }
    }
    
}
