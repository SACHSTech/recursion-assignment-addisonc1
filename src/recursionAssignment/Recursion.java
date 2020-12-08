package recursionAssignment;

public class Recursion{

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

  
}
