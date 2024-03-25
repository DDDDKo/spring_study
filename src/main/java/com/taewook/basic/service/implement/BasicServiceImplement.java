package com.taewook.basic.service.implement;

import com.taewook.basic.service.BasicService;

public class BasicServiceImplement implements BasicService{
    
    @Override
    public String getHello() {
        return "Hello Springboot!!";
    }
}
