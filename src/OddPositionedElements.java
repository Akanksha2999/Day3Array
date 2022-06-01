public class OddPositionedElements {
    public static void main(String[] args) {

        //Initilize the array elements
        int arr[] = {10, 20, 30, 40, 50};

        //Displaying the message of elements of the array at odd position are
        System.out.println("Elements on odd position are:");

        //Loop through the array
        for (int i = 0; i < arr.length; i = i + 2) {
            //Printing the elements of the array at odd position
            System.out.println(arr[i]);
        }
    }
}
