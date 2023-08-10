package bhuvan1.demo.repository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import bhuvan1.demo.model.Student;

@Repository
public class StudentRepository {
private ArrayList<Student> list = new ArrayList<>();
public Student createStudent(Student S) 
{   
	list.add(S);
   	return S;
}
public List<Student> getAllStudents()
{
	return list;
} 
public Student findById(int id) 
{
	return list.stream().filter((n)->n.getId()==id).findFirst().orElse(null);
}
public void deleteById(int id)
{
	 list.remove(list.stream().filter((n)->n.getId()==id).findFirst().orElse(null));
//	 return list.stream().filter((n)->n.getId()==id).findFirst().orElse(null);
}
public Student updateStudent(Student student)
{
	 list.set(list.indexOf(list.stream().filter((n)->n.getId()==student.getId()).findFirst().orElse(null)),student);
	 return list.stream().filter((n)->n.getId()==student.getId()).findFirst().orElse(null);
}
}
