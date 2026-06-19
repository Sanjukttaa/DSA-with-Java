import java.util.Scanner;

public class ArrayOperation {

    static int index = 0;   // keeps track of current array size

    static void addLast(int a[], int value) {
        a[index] = value;   // insert at end
        index++;
    }

    static void addFirst(int a[], int value) {

        // shift elements one position right
        for (int i = index; i > 0; i--)
            a[i] = a[i - 1];

        a[0] = value;       // insert at first position
        index++;
    }

    void Travel_Forward(int a[]) {   // display array elements

        System.out.print("Array elements are: ");

        for (int i = 0; i < index; i++)
            System.out.print(a[i] + " ");

        System.out.println();
    }

    static void addAtGivenPosition(int a[], int pos, int value) {

        // check invalid position
        if (pos < 0 || pos > index) {
            System.out.println("The given index is invalid");
            return;
        }

        // special cases
        if (pos == 0) {
            addFirst(a, value);
            return;
        }

        if (pos == index) {
            addLast(a, value);
            return;
        }

        // shift elements to make space
        for (int i = index; i > pos; i--) {
            a[i] = a[i - 1];
        }

        a[pos] = value;   // insert value
        index++;
    }

    static void deleteLast(int x[]) {

        // check if array is empty
        if (index == 0) {
            System.out.println("Array is empty");
            return;
        }

        index--;   // remove last element logically
    }

    public static void main(String[] args) {

        ArrayOperation op = new ArrayOperation();
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[20];   // array capacity = 20

        // adding elements at end
        addLast(arr, 10);
        addLast(arr, 7);
        addLast(arr, 9);
        addLast(arr, 3);
        addLast(arr, 15);

        op.Travel_Forward(arr);

        // add element at a specific position
        addAtGivenPosition(arr, 35, 23);

        op.Travel_Forward(arr);

        // delete last element
        deleteLast(arr);

        op.Travel_Forward(arr);

        sc.close();
    }
}