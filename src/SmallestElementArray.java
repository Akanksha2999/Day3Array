public class SmallestElementArray {
    public static void main(String[] args) {

        //Initialize the array elements
        int numbers[] = {32, 43, 53, 54, 32, 65, 63, 98, 43, 23};

        //Initialize smallest with first element of array
        int smallest = numbers[0];

        //going through the array
        for (int i = 1; i < numbers.length; i++) {

            //Comparing elements of array with smallest
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest Number is : " + smallest);
    }
}
