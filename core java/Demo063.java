public class Demo063 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        if (array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int firstElement = array[0];
        int lastElement = array[array.length - 1];
        int sum = firstElement + lastElement;
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
        System.out.println("Sum of first and last element: " + sum);
    }
}