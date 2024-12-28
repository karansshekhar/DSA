import java.util.Scanner;

class MyArray {
    int totalSize;
    int usedSize;
    int[] arr;

    // Method to create the array
    public void createArray(int tSize, int uSize) {
        totalSize = tSize;
        usedSize = uSize;
        arr = new int[totalSize];
    }

    // Method to set values in the array
    public void setVal() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < usedSize; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    // Method to display the array elements
    public void show() {
        for (int i = 0; i < usedSize; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyArray marks = new MyArray();

        marks.createArray(10, 2);
        System.out.println("We are running setVal now");
        marks.setVal();

        System.out.println("We are running show now");
        marks.show();
    }
}
