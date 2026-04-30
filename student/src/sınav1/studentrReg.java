package sınav1;

public class studentrReg {

	public static void main(String[] args) {
		studenta n1,n2;
		
		studenta age1,age2;
		
		String s1,s2;
		int s1a,s2a;
		
		n1=new studenta();
		n1.setName("ayca");

		n2=new studenta();
		n2.setName("hazal");
		
		age1=new studenta();
		age1.setAge(20);
	
		
		age2=new studenta();
		age2.setAge(22);
		
		s1=n1.getName();
		s1a=n1.getAge();
		
		s2=n2.getName();
		s2a=n2.getAge();
		
		System.out.println("1.öğrencinin ismi ve yaşı:"+s1+s1a);
		System.out.println("2.öğrencinin ismi ve yaşı:"+s2+s2a);
		
		
		
		
		
		
		

	}

}
