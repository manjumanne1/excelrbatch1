public class Demo064 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        if (array.length < 2) {
            System.out.println("Array must have at least two elements to swap.");
            return;
        }
        System.out.println("Original array:");
        printArray(array);
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        System.out.println("Array after swapping first and last elements:");
        printArray(array);
    }
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); 
    }
}