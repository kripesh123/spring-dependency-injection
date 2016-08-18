/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kripesh.springdepinj;

import com.kripesh.springdepinj.config.AppConfig;
import com.kripesh.springdepinj.domain.Application;
import com.kripesh.springdepinj.domain.Bond;
import com.kripesh.springdepinj.domain.Driver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 *
 * @author Admin
 */
public class AppMain {
    
    public static void main(String args[]){
        AbstractApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
        
//        //Byname Autowiring
//        Application application = (Application)context.getBean("application");
//        System.out.println("Application Details : "+application);
         //Autowiring
//        Driver driver =(Driver) context.getBean("driver");
//        System.out.println("Driver details : " + driver);
        //Qualifier
        Bond bond=(Bond) context.getBean("bond");
        bond.showCar();
    }
}
