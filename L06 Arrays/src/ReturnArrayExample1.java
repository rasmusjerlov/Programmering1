public class ReturnArrayExample1
{
    public static void main(String args[])
    {
        int[] a=numbers();           //obtain the array
        for (int i = 0; i < a.length; i++) //for loop to print the array
            System.out.print( a[i]+ " ");
    }
    public static int[] numbers()
    {
        int[] arr={5,6,7,8,9};  //initializing array
        return arr;
    }
}