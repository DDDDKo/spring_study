package com.taewook.basic.service.implement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.taewook.basic.dto.Request.Student.PatchStudentRequestDto;
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

    @Override
    public ResponseEntity<String> patchStudent(PatchStudentRequestDto dto) {
        Integer studentNumber = dto.getStudentNumber();
        String address = dto.getAddress();
        // student 테이블로 접근(StudentRepository 사용)
        StudentEntity studentEntity = studentRepository.
        // dto.studentNumber에 해당하는 레코드를 검색
        findById(studentNumber).get();
        // 위 코드는 1줄임

        // 검색된 레코드의 address 값을 dto.address로 변경
        studentEntity.setAddress(address);        
        //-----객체지향프로그래밍언어의 class == RDBMS의 table-----


        //-----객체지향프로그래밍언어의 instance == RDBMS의 record-----
        // student 클래스로 접근
        // dto.studentNumber에 해당하는 인스턴스를 검색
        // 검색된 레코드의 address 값을 dto.address로 변경

        return null;
    }
    
}
