import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class SubString {
	
	   public static void main(String args[])
	   {
	      
	      String first, second;
	      int firstlength,secondlength;
	 
	      Scanner in = new Scanner(System.in);
	      
	      System.out.println("Enter a string to print it's all substrings");
	      first  = in.nextLine();
	      
	      System.out.println("Enter second string");
	      second  = in.nextLine();
	      
	      firstlength=first.length();
	      secondlength=second.length();
	      
	      Hashtable<Character,Integer> hm = new Hashtable<Character,Integer>();
	      
	      for( int i = 0 ; i < firstlength ; i++ )
	      {
	    	 
	    	  for (int j = 0 ; j < secondlength ; j++ )
	    	
	    	  if(first.charAt(i)==second.charAt(j) || second.charAt(j)=='*')
	    	  {
	    		  
	    		  
	    		  
	    		  hm.put(second.charAt(j),1);
	    		  
	    		  break;
	    	  }
	         
	      }
	      
	    /*  if(count==secondlength)
	      {
	    	  System.out.println("sub string");
	      }
	      
	      if(check)
	      {
	    	  System.out.println("sub string 1");
	      }*/
	      
	      
	      boolean status=true;
	      
	      if(hm.isEmpty())
	      {
	    	  status=false;
	      }
	      else{
	      
	      Set<Character> keys = hm.keySet();
	        for(Character key: keys){
	            if(hm.get(key)!=1)
	            {
	            	System.out.println("hey");
	            	status=false;
	            	break;
	            }
	        }
	      }
	        
	        if(!status)
	        {
	        	System.out.println("no sub string final");
	        }
	        else
	        	System.out.println("finally got it");
	   }
	   
	}