package com.taewook.basic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taewook.basic.dto.Request.Student.PostStudentRequestDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    // Post는 CRUD중 C Create
    @PostMapping("/")   // 첫번째 /는 생략 가능하다
    public ResponseEntity<?> postStudent (
        @RequestBody @Valid PostStudentRequestDto requestbody
    ) {
        return null;
    }

    // Patch, Put은 CRUD중 Update 수정과 삭제는 primary key를 조건으로 걸어두는것이 가장 안전
    @PatchMapping("/")
    public ResponseEntity<?> patchStudent () {
        return null;
    }

    // DELTE는 CRUD중 DELETE  수정과 삭제는 primary key를 조건으로 걸어두는것이 가장 안전
    @DeleteMapping("/{studentNumber}")
    public ResponseEntity<?> deleteStudent (
        @PathVariable ("studentNumber") Integer studentNumber
    ) {
        return null;
    }
}