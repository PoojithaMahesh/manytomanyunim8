package manytomanyunim8.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanyunim8.dto.Course;
import manytomanyunim8.dto.Student;

public class StudentCourseCont {
public static void main(String[] args) {
	Course course1=new Course();
	course1.setId(1);
	course1.setName("Java");
	course1.setFees(5000);
	
	Course course2=new Course();
	course2.setId(2);
	course2.setName("AdvJava");
	course2.setFees(5000);
	
	Course course3=new Course();
	course3.setId(3);
	course3.setName("sql");
	course3.setFees(5000);
	
	Student student=new Student();
	student.setId(1);
	student.setName("Sindhu");
	student.setAddress("AP");
	
	List<Course> coursesofsindhu=new ArrayList<Course>();
	coursesofsindhu.add(course1);
	coursesofsindhu.add(course2);
	coursesofsindhu.add(course3);
	
	student.setCourses(coursesofsindhu);
	
	Student student2=new Student();
	student2.setId(2);
	student2.setName("Prem");
	student2.setAddress("AP");
	
	student2.setCourses(coursesofsindhu);
	
	Student student3=new Student();
	student3.setId(3);
	student3.setName("karthik");
	student3.setAddress("Chennai");
	
	student3.setCourses(coursesofsindhu);
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(course1);
	entityManager.persist(course2);
	entityManager.persist(course3);
	entityManager.persist(student);
	entityManager.persist(student2);
	entityManager.persist(student3);
	entityTransaction.commit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
