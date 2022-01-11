package com.vue_backend.vue_backend.Dao;

import com.vue_backend.vue_backend.Entities.Student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    public Student findById(int id);

}
