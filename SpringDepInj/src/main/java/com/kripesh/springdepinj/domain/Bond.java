/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kripesh.springdepinj.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author Admin
 */
@Component
public class Bond {
    
    @Autowired
    @Qualifier("Mustang")
    private Car car;
    
    public void showCar(){
        car.getCarName();
    }
}
