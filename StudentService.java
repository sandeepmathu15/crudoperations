package bhuvan1.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import bhuvan1.demo.model.Student;
import bhuvan1.demo.repository.StudentRepository;

@Service
public class StudentService {
@Autowired
private StudentRepository repository;

public Student saveStudent(Student student) {
    return repository.createStudent(student);
}

public List<Student> getStudents() {
    return repository.getAllStudents();
}

public Student getStudentById(int id) {
    return repository.findById(id);
}

public void delete(int id) {
	
	 repository.deleteById(id);
}

public Student update(Student student) {
	
	return repository.updateStudent(student);
}
}
