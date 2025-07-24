package com.upen.spring_data_jpa_ex;

import com.upen.spring_data_jpa_ex.StudentRepo.StudentRepo;
import com.upen.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringDataJpaExApplication.class, args);
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		StudentRepo repo = context.getBean(StudentRepo.class);
	//	System.out.println("Spring Data JPA Example Application Started Successfully!");

//		s1.setId(1);
//		s1.setName("Alice");
//		s1.setMarks(85);
//
//		s2.setId(2);
//		s2.setName("Bob");
//		s2.setMarks(90);
//
		s3.setId(3);
		s3.setName("Charlie");
		s3.setMarks(90);
//
//	repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);
//
//		System.out.println("Students saved successfully!");
//
//		System.out.println("List of Students:");
//		repo.findAll().forEach(System.out::println);
//		System.out.println("Total Students: " + repo.count());
	//	System.out.println("Student with ID 1: " + repo.findById(1).orElse(null));
		// repo.deleteById(1);

//		System.out.println(repo.findByName("Alice"));
//		System.out.println(repo.findByMarksGreaterThan(70));


//	repo.save(s3);
	repo.delete(s3);

	}

}
