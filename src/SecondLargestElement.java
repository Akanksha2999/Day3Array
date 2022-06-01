import java.util.Arrays;

public class SecondLargestElement {
    public static int getSecondLargest(int[] a, int total) {

        //Sorting the array in asscending order
        Arrays.sort(a);

        //Return the second largest element of the array
        return a[total - 2];
    }

    public static void main(String args[]) {

        //Initialize the array elements
        int a[] = {1, 2, 5, 6, 3, 2};

        //Printing the second largest element in the array
        System.out.println("Second Largest: " + getSecondLargest(a, 6));
    }
}