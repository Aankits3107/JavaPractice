package Strings;

public class RepeatCharacter {
    public static void main(String[] args) {    
       String myString = "Hey How are you?";    
       int count;    
       char myStringArray[] = myString.toCharArray();    
        System.out.println("Duplicate characters in a string: ");  
       for(int i = 0; i < myStringArray.length; i++) {    
           count = 1;    
           for(int j = i+1; j < myStringArray.length; j++) {    
               if(myStringArray[i] == myStringArray[j] && myStringArray[i] != ' ') {    
                   count++;        
                   myStringArray[j] = '0';    
               }    
           }      
           if(count > 1 && myStringArray[i] != '0')    
               System.out.println(myStringArray[i]);    
       }    
   }  
}
