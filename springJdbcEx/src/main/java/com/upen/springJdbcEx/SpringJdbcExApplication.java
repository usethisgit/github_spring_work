package com.upen.springJdbcEx;

import com.upen.springJdbcEx.model.Student;
import com.upen.springJdbcEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);
		Student student = context.getBean(Student.class);
		System.out.println("Spring JDBC Example Application Started Successfully!");
		student.setId(4);
		student.setName("John ");
		student.setMarks(80);

		StudentService studentService = context.getBean(StudentService.class);
		//studentService.addStudent(student);

		List<Student> students =studentService.getStudents();
		System.out.println("List of Students:"+ students);
	}

}
