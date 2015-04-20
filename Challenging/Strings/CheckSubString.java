import java.io.*;
import java.util.*;

public class Trial {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    
    try{
      while ((s = in.readLine()) != null) {
        String[] splitString = s.split(",");

        String second = ""+splitString[1];
    
        String[] splitSecondString = new String[splitString.length];
        if(second.contains("*")){
          splitSecondString = second.split("\\*");
          
          isSubString(splitString, splitSecondString);
          
        }
        break;
      }

    }catch(Exception e){
      e.printStackTrace();
    }

  }
    
  public static void isSubString(String[] sString, String[] splitSecondString){
      System.out.println("Inside method");
      int secondLength = splitSecondString.length;
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
  
}
