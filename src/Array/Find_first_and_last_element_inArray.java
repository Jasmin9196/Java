package Array;

public class Find_first_and_last_element_inArray {

    public static void main(String[] args) {
        int[] a = { 4, 2, 3, 1, 6 };
        // Output = First is: 4, Last is: 6

        // find first element
        int first = a[0]; // First Element
        // find last element
        int last = a[a.length - 1]; // Last Element

        System.out.println("First is: " + first + ", Last is: " + last);
    }
}
