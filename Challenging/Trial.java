import java.io.*;
import java.util.*;

public class Trial {
  
  public static void main(String[] args) throws IOException {
    
    //METHOD 1
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    //System.out.println("Enter the input test strings");
    
    try{
      while ((s = in.readLine()) != null) {
        String[] splitString = s.split(",");

        //trial code
        String second = ""+splitString[1];
        //System.out.println("second string : " +second);

        String[] splitSecondString = new String[splitString.length]; //= new splitSecondString[10];
        if(second.contains("*")){
          splitSecondString = second.split("\\*");
          
          isSubString(splitString, splitSecondString);
          
        }
          
        // for(String st : splitString)
        // System.out.println(st);
        
        //isSubString(splitString, splitSecondString);
        
        break;
      }

    }catch(Exception e){
      e.printStackTrace();
    }

    //METHOD 2
    // Scanner input = new Scanner(System.in);  

    // ArrayList<String> inputText = new ArrayList<String>();
    // input.useDelimiter("[,\\s]");

    // inputText.add(input.next());
    // inputText.add(input.next());
    // //System.out.println(inputText.get(0));
    // //System.out.println(inputText.get(1));
    // isSubstringUsingArrayList(inputText);

  }
    
  public static void isSubString(String[] sString, String[] splitSecondString){
      System.out.println("Inside method");
      int secondLength = splitSecondString.length;
      //System.out.println("secondLength : "+secondLength);
      int result = 0;
      boolean match;
      for(int i = 0 ; i<secondLength; i++){
        if(match = (splitStringn[0]).contains(splitSecondString[i]))
          result = 1;
        else
          result = 0;
      }
      
      if(result == 1)
          System.out.println("true");
        else
          System.out.println("false");

      
  }

  // public static void isSubstringUsingArrayList(String[] sString){
  //     boolean match = (arr.get(0)).contains(arr.get(1));
  //     if(match == true)
  //       System.out.println("true");
  //     else
  //       System.out.println("false");
      
  // }         
    
}
