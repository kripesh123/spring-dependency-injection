/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kripesh.springdepinj.domain;

import org.springframework.stereotype.Component;

/**
 *
 * @author Admin
 */
@Component("Mustang")
public class Mustang implements Car{

    @Override
    public void getCarName() {
        System.out.println("This is Mustang");
    }
    
}
