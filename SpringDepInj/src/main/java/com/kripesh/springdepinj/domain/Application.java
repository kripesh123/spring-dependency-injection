/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kripesh.springdepinj.domain;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 *
 * @author Admin
 */
@Component("application")
public class Application {
    
    @Resource(name="applicationUser")
    private ApplicationUser user;

    @Override
    public String toString() {
         return "Application [user=" + user + "]";
    }
    
    
}
