package com.taewook.basic.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.taewook.basic.dto.Request.Student.PostStudentRequestDto;
import com.taewook.basic.service.StudentService;

@Service
public class StudentServiceImplement implements StudentService{

    @Override
    public ResponseEntity<String> postStudent(PostStudentRequestDto dto) {
        return null;
    }
    
}
