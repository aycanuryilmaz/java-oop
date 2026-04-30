package sınıfprojesi;

public class studentRegistration {

	public static void main(String[] args) {
	student name1,name2;
	String studentName1,studentName2;
	student age1,age2;
	int studentAge1,studentAge2;
	
	
	name1=new student();
	name1.setName("ayca");
	name2=new student();
	name2.setName("hazal");
	
	age1=new student();
	age1.setAge(20);
	age2=new student();
	age2.setAge(22);
	
	
	studentName1=name1.getName();
	studentAge1=age1.getAge();
	
	
	studentName2=name2.getName();
	studentAge2=age2.getAge();
	System.out.println(studentName1+studentAge1);
	System.out.println(studentName2+studentAge2);


	}

}
