package com.taewook.basic.service;

import org.springframework.http.ResponseEntity;

import com.taewook.basic.dto.Request.Student.PostStudentRequestDto;

public interface StudentService {
    ResponseEntity<String> postStudent(PostStudentRequestDto dto);
}
