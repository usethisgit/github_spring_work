package com.upen.spring_data_jpa_ex.StudentRepo;

import com.upen.spring_data_jpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
    // JpaRepository provides basic CRUD operations and more
    // You can define custom query methods here if needed
    @Query("SELECT s FROM Student s WHERE s.name = ?1")
     List<Student> findByName(String name); // Example of a custom query method

     List<Student> findByMarksGreaterThan(int marks);

}
