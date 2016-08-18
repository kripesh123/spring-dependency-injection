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
@Component("applicationUser")
public class ApplicationUser {
    
    private String name="defaultName";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ApplicationUser [name=" + name + "]";
    }
 
    
}
