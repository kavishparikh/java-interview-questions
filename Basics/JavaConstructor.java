package basics;

public class JavaConstructor {
	
	public JavaConstructor(String name){
		System.out.println("The name in constructor is : "+name);
	}
	
	public static void main(String args[]){
		JavaConstructor abc = new JavaConstructor("kavish");
	}

}
