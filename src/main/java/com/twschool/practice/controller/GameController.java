package com.twschool.practice.controller;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GameController {
    @PostMapping("/game/guess-numbers")
    public Map<String,String> guess(@RequestBody Map<String, String> requestBody){
        Map<String, String> responseBody = new HashMap<>();
        responseBody.put("input",requestBody.get("number"));
        responseBody.put("result", "4A0B");
        return responseBody;
    }
}
