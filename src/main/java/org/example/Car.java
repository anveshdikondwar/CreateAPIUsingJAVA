package org.example;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String colour;

    public void setColour(String colour){
        this.colour=colour;
    }

    public Car() {
        this.colour="Golden";
        System.out.println("Car object Created !!!!!!!!!!!!!!");
    }

    public String getColour(){
        return colour;
    }

}
