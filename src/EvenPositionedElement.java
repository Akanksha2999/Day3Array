public class EvenPositionedElement {
    public static void main(String[] args) {

        //Initialize array
        int arr[] = {10, 20, 30, 40, 50};

        //Printing the message of elements on even position are
        System.out.println("Elements on even position are:");

        //Loop through the array to print elements at even position
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }
}
