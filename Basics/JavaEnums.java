//package basics;

class FreshJuice {
	enum FreshJuiceSize{SMALL, MEDIUM, LARGE}
	FreshJuiceSize size;
}

public class JavaEnums{
	
	public static void main(String args[]){
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.LARGE;
		System.out.println("Juice size : "+juice.size);
	}
}
