package com.taewook.basic.service.implement;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.taewook.basic.dto.Request.Student.PostStudentRequestDto;
import com.taewook.basic.entity.StudentEntity;
import com.taewook.basic.repository.StudentRepository;
import com.taewook.basic.service.StudentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImplement implements StudentService{

    private final StudentRepository studentRepository;

    @Override
    public ResponseEntity<String> postStudent(PostStudentRequestDto dto) {

        // CREATE (SQL : INSERT)
        // 1. Entity 클래스의 인스턴스 생성
        // 2. 생성한 인스턴스를 repository.save() 메서드로 저장
        StudentEntity studentEntity = new StudentEntity(dto);
        // studentEntity.setName(dto.getName());
        // studentEntity.setAge(dto.getAge());
        // studentEntity.setAddress(dto.getAddress());
        // studentEntity.setGraduation(dto.getGraduation());  나중에 너무 많아서 이렇게 사용하지 않고 StudentEntity로 들어가 생성자를 이용함

        // save() : 저장 및 수정(덮어쓰기(primary key를 기준으로))
        studentRepository.save(studentEntity);

        return ResponseEntity.status(HttpStatus.CREATED).body("성공!");
    }
    
}
