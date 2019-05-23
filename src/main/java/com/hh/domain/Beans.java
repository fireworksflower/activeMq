package com.hh.domain;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * Created by IntelliJ IDEA.
 *
 * @author lijing
 * @date 2019/5/14 9:42
 **/
@Configurable
public class Beans {
    @Bean(name="car")
    public Car bulidCar(){
        Car car = new Car();
        car.setBrand("红旗");
        car.setMaxSpeed(200);
        return  car;
    }
}
