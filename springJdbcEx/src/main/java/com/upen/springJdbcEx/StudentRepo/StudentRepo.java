package com.upen.springJdbcEx.StudentRepo;

import com.upen.springJdbcEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {
        String sql = "INSERT INTO student(id, name, marks) VALUES (?, ?, ?)";
        jdbc.update(sql, student.getId(), student.getName(), student.getMarks());
        System.out.println("Student saved: " + student);

    }

    public List<Student> findAll() {
        String sql = "SELECT * FROM student";

        return jdbc.query(sql, (rs, rowNum) -> {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setMarks(rs.getInt("marks"));
            return student;
        });

    }
}
