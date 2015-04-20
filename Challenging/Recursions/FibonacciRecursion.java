import java.io.*;

class FibonacciRecursion{

	public static void main(String args[]){
        try{
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i <= N; i++)
            System.out.println(i + ": " + fibonacci(i));	
        }catch(Exception e){
        	
        }
        
	}
	
	public static int fibonacci(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   	else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}

}

