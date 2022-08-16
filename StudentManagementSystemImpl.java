package sdbms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
public class StudentManagementSystemImpl	 implements StudentManagementSystem{
	
	
	Scanner scan=new Scanner(System.in);
	LinkedHashMap<Integer,Student> db=new LinkedHashMap<Integer,Student>();
	
	
@Override
public void addStudent() {
	System.out.println("enter id ,name,age and marks");
	int id=scan.nextInt();
	String name=scan.next();
	int age=scan.nextInt();
	int marks=scan.nextInt();
	
	Student std=new Student(id,name,age,marks);
	db.put(id, std);//db.put(std.getId(),std)
	System.out.println(" Student records inserted succesfully");
}

@Override
public void removeStudent() {
	
	System.out.println("enter student Id:");
	int id=scan.nextInt();//key -->containskey()
	
	if(db.containsKey(id)) {
		db.remove(id);
		System.out.println("student record  deleted");
	}
	else {
	    try {
	    	throw new StudentNotFoundException("Student data not found !");
	    }
	    catch(StudentNotFoundException e) {
	    	System.out.println(e.getMessage());
	    }
	}
	
}

@Override
public void removeAllStudent() {
	db.clear();
	System.out.println("all the student record deleted succesfully");
	
}

@Override
public void displayStudent() {
	System.out.println("enter student Id:");
	int id=scan.nextInt();//key -->containskey()
	
	if(db.containsKey(id)) {
	//	System.out.println(db.get(id));
		Student std=db.get(id);  //Student std = new student(10,'A'.....etc)
	//	System.out.println(std);   // since toString  is Overridden
		System.out.println("id:"+std.getId());
		System.out.println("age:"+std.getAge());
		System.out.println("name:"+std.getName());
		System.out.println("marks:"+std.getMarks());
	
	}
	else {
		  try {
		    	throw new StudentNotFoundException("Student data not found !");
		    }
		    catch(StudentNotFoundException e) {
		    	System.out.println(e.getMessage());
		    }
	}
	
	
	
}

@Override
public void displayAllStudents() {
	Set<Integer> SetOfKeys = db.keySet();
	for(int id:SetOfKeys) {
		System.out.println(db.get(id));
	}
/*for(int key: SetOfKeys) {
		Student s=db.get(key);
		System.out.println("id:"+s.getId()+"\tName:"+s.getName());
		System.out.println("\tAge:"+s.getAge()+"\tMarks:"+s.getMarks());
	}*/
}

@Override
public void updateStudent() {
	System.out.println("enter student id");
	int id=scan.nextInt();
	if(db.containsKey(id)) {
		Student s=db.get(id);
		System.out.println("1.update age\n2:update name\n3:update marks");
		System.out.println("enter choice:");
		int choice=scan.nextInt();
		
		
		switch (choice){
		case 1:
		System.out.println("enter age:");
		int age=scan.nextInt();
		s.setAge(age);
		break;
		
		case 2:
			System.out.println("enter name:");
			String name=scan.next();
			s.setName(name);
			break;
			
		case 3:
			System.out.println("enter marks:");
			int marks=scan.nextInt();
			s.setMarks(marks);
			break;
			default:
				System.out.println("invalid choice");
		
	
		}
	}
	else {
		  try {
		    	throw new StudentNotFoundException("Student data not found !");
		    }
		    catch(StudentNotFoundException e) {
		    	System.out.println(e.getMessage());
		    }
	}
		
	
}

@Override
public void countStudents() {
	System.out.println("number of records is"+db.size());
	
	
}

@Override
public void sortStudents() {
	ArrayList<Student> l=new ArrayList<Student>();
	Set<Integer> s=db.keySet();
	for(int id: s) {
		l.add(db.get(id));
	}
	System.out.println("1:Sort based on Id\n2:Sort Based On Name");
	System.out.println("3:Sort Based On Marks\n4:Sort Base On Age");
	System.out.println("enter choice");
	int choice =scan.nextInt();
	
	switch (choice) {
	
	case 1:
		Collections.sort(l,new SortStudentById());
		for(Student s1:l) {
			System.out.println(s1);
		}
		break;
		
		
		case 2:
			Collections.sort(l,new SortStudentByName());
			for(Student s1:l) {
				System.out.println(s1);
			}
			break;
			
			
		case 3:
			Collections.sort(l,new SortStudentByMarks());
			for(Student s1:l) {
				System.out.println(s1);
			}
			break;
			
			
		case 4:
			Collections.sort(l,new SortStudentByAge());
			for(Student s1:l) {
				System.out.println(s1);
			}
			break;
			
			default:
				System.out.println("invalid choice");
	
			
		
	}
System.out.println("_____________________");
	
}

}
