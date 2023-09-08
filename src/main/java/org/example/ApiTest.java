package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTest {

    @Autowired   // call the object car
    Car carObj;

    @GetMapping("api/v1/Good")
    public  String api(){
        return "Anvesh";
    }

    @GetMapping("api/v1/car")
    public Car getCar(){
        return carObj;
    }
    @PutMapping("api/v1/change/colour")
    public String setColor(){
        carObj.setColour("red");
        return "colour Changed";
    }


}
