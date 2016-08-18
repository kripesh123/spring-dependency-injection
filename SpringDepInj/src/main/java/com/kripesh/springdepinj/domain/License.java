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
@Component
public class License {
    
    private String number="123456ABC";

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    @Override
    public String toString() {
        return "License [number=" + number + "]";
    }
}
