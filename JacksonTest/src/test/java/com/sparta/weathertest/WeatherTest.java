package com.sparta.weathertest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;

public class WeatherTest {
    @Test
    public void testBirmingham(){
        ObjectMapper objMapper = new ObjectMapper();
        try{
            Weather result = objMapper.readValue(
                    new URL("https://api.openweathermap.org/data/2.5/weather" +
                            "?q=Birmingham,UK"+
                            "&appid=91302ec55ea1d638496b1cce86f4043a"),
                    Weather.class);
            Assertions.assertEquals("Birmingham", result.getName());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
