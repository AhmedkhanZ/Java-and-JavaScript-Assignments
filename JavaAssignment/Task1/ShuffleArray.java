import java.util.*;
public class Main
{

public static void shuffleArrayValues(int[] arr)
{
    Random randomObject = new Random();
    int randomValue = randomObject.nextInt(arr.length);
    for(int i=0; i<arr.length; i++){
     int temp = arr[i];
     arr[i] = arr[randomValue];
     arr[randomValue] = temp;
    }

    for(int j=0; j<arr.length; j++)
    {
        System.out.print(arr[j]+" ");
    }
    System.out.println();
}

public static void main(String[] args)
{
   int[] arr = { 1,2,3,4,5,6,7};
   shuffleArrayValues(arr);
}

}

