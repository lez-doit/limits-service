package com.demo.microservices.limitsservice.bean;

import com.demo.microservices.limitsservice.configuration.Configuration;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Limits {

    private int minimum;
    private int maximum;

    public Limits(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }
}
