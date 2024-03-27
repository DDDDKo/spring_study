package com.taewook.basic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    // Post는 Create
    @PostMapping("/")   // 첫번째 /는 생략 가능하다
    public ResponseEntity<?> postStudent (){
        return null;
    }

}
