	
public class StringToInteger {
	
	public void atoi(String number)
	{
		int value = 0;
		
		int length = number.length();
		for(int i = 0;i<length;i++)
		{
			System.out.println(number.charAt(i));
	      	value += (number.charAt(i) - '0')*Math.pow(10,length-1-i);	
	      	System.out.println(value);
		}
		
		//This will throw an exception for NumberFormatException
		// System.out.println("This is by parseInt method");
		// int num = Integer.parseInt("number");
		// System.out.println(num);
		
		//But if the Integer string is directly passed in parseInt. It will convert it to Integer.
		int num = Integer.parseInt("786");
		System.out.println(num);

		//Trying the difference in ASCII value
		int val = 'M' - 'J';
		System.out.println(val);

		//To convert integer to string
		//String str = Integer.toString(num);
		//OR
		//String str = String.valueOf(num);

	}

	public static void main(String[] args) {
		myAtoi ob = new myAtoi();
		ob.atoi("876");

	}

}
