package sınıfprojesi;
//değişkenler=name age constructor=name age getter setter 
public class student {
//add data members
	
	private String name;
	private int age;
	
	public student() {
		name="unknown";
		age=0;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String newname) {
		name=newname;
	}
	public void setAge(int newage) {
		age=newage;
	}
	public void birthday() {
		age=+1;
	}
	
}
