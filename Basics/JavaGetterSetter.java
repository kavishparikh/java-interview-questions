package basics;

public class JavaGetterSetter {
	
	int myAge;
	
	public JavaGetterSetter(String name){
		System.out.println("The name in constructor is : "+name);
	}
	
	public void setAge(int age){
		myAge = age;
	}
	
	public int getAge(){
		System.out.println("My age is : "+myAge);
		return myAge;
	}
	
	public static void main(String arg[]){
		JavaGetterSetter howold = new JavaGetterSetter("Kavish");
		
		howold.setAge(23);
		
		howold.getAge();
		
		System.out.println("Variable value is : "+howold.myAge);
	}

}
