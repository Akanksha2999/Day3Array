public class LargestElementArray {
    public static void main(String[] args) {
        //Initialize array of 10 numbers
        int numbers[] = {32, 43, 53, 54, 32, 65, 63, 98, 43, 23};
        int largest = numbers[0];

        //Loop through the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest)
                largest = numbers[i];
        }
        //Printing the largest element of the array
        System.out.println("Largest Number is : " + largest);
    }
}
