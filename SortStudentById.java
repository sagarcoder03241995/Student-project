package sdbms;

import java.util.Comparator;

public class SortStudentById implements Comparator<Student>{
	public int compare (Student x,Student y) {
	
	return x.getId()-y.getId();
	

}
}