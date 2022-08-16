package sdbms;

public class Student {
private int id;
private String name;
private int age;
private int marks;
public Student(int id, String name, int age, int marks) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.marks = marks;
	
	
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
	
	@Override
	public String toString() {
		return  "id is"+id+"name is"+name+"age is"+age+"marks is"+marks;
	}
}


			