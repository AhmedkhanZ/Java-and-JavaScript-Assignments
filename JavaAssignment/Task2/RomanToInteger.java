
 
 import java.util.Scanner;
public class Main
{    
   static int romanToInt(String s)
    {
    char[] charsArr=s.toCharArray();
    int length=s.length();
    int decimalNum=0;

    for(int i=length-1;i>-1;i--){
        
        if( i-1 >-1 && charsArr[i]=='V' && charsArr[i-1]=='I' )
        {
            
            decimalNum+=4;
            i--;
            continue;
        }
        else if( i-1 >-1 && charsArr[i]=='X' && charsArr[i-1]=='I' )
        {
            decimalNum+=9;
            i--;continue;
        }
        else if( i-1 >-1 && charsArr[i]=='L' && charsArr[i-1]=='X' )
        {
            decimalNum+=40;
            i--;continue;
        }
        else if( i-1 >-1 && charsArr[i]=='C' && charsArr[i-1]=='X' )
        {
            decimalNum+=90;
            i--;continue;
        }
        else if( i-1 >-1 && charsArr[i]=='D' && charsArr[i-1]=='C' )
        {
            decimalNum+=400;
            i--;continue;
        }
        else if( i-1 >-1 && charsArr[i]=='M' && charsArr[i-1]=='C' )
        {
            decimalNum+=900;
            i--;continue;
        }
        
        
       if(i>-1){
           
           if(charsArr[i]=='I'){
               decimalNum+=1;
           }else if(charsArr[i]=='V'){
               decimalNum+=5;
           }else if(charsArr[i]=='X'){
               decimalNum+=10;
           }else if(charsArr[i]=='L'){
               decimalNum+=50;
           }else if(charsArr[i]=='C'){
               decimalNum+=100;
           }else if(charsArr[i]=='D'){
               decimalNum+=500;
           }
           else{
            // for value M = 1000
               decimalNum+=1000;
           }
        
          
        }
       
        
     }
       return decimalNum;
   }

   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a roman value");
    String romanValue = input.next();
    System.out.print("The decimal value for "+romanValue+" is: "+romanToInt(romanValue));
   }
}