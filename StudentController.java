package bhuvan1.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bhuvan1.demo.model.Student;
import bhuvan1.demo.service.StudentService;
@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:4200")
public class StudentController
{
@Autowired
StudentService service;
@PostMapping()
public Student addStudent(@RequestBody Student student)
{
	return service.saveStudent(student);
}
@GetMapping()
public List<Student> findAllStudents()
{
    return service.getStudents();
}
@GetMapping("{id}")
public Student findStudentById(@PathVariable int id)
{
    return service.getStudentById(id);
}
@DeleteMapping("{id}")
public void delete(@PathVariable int id)
{
    service.delete(id);
}
@PutMapping()
public Student update(@RequestBody Student student)
{
	return service.update(student);
}
}