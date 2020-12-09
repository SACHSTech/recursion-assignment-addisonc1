package recursionAssignment;

public class Recursion{
/**
* counts the 7's in a given number
*
* @param int n is the give number to have the count the 7s
* @return returns the number of 7
* @author Addison chan
*/

public static int count7(int n){
 if (7>n){
   return 0;
  }else{
    if (n % 10 ==7){
      return 1 + count7( n / 10 );
    }else{
      return 0 + count7( n / 10);
    }
  }

 }
 /**
*putting pair letters a * inbetween them
*
* @String str given word 
* @return returns string with a new 
* @author Addison chan
*/
public static String pairStar(String str){
 if(str.length() < 2){
   return str;
}
 if (str.charAt(0)== str.charAt(1)){
   return str.charAt(0)+ "*"+ pairStar(str.substring(1));
   
 }else{
   return str.charAt(0)+ pairStar(str.substring(1));
 
 
}
}
/**
* cleans duplicates of letters in the given string 
*
* @string str is the given string 
* @return returns the string with no duplicates 
* @author Addison chan
*/
public static String stringClean(String str){
  if(str.length() <2)
    return str;
  
  if(str.charAt(0) == str.charAt(1)){
  return stringClean(str.substring(1));

  }else{  
    return str.charAt(0) + stringClean(str.substring(1));
  }

}
}
