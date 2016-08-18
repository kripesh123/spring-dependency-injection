/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kripesh.springdepinj.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Admin
 */
@Component("driver")
public class Driver {
    @Autowired(required = false)
    private License license;

    public Driver() {
    }

    public Driver(License license) {
        this.license = license;
    }
    
    public void setLicense(License license){
        this.license=license;
    }

    public License getLicense() {
        return license;
    }
      
    @Override
    public String toString() {
        return "Driver [license=" + license + "]";
    }
}
