import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAss {
    private int[] array;
    private int size;
    private int capacity;

    public ArrayListAss(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.size = 0;
    }

    public int add(int number) {
        if (size < capacity) {
            array[size] = number;
            size++;
            return size - 1;
        }
        return -1; // Indicates array is full
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return -1; // Indicates index out of bounds
    }

    public int size() {
        return size;
    }

    public int[] find(int number) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (array[i] == number) {
                indices.add(i);
            }
        }
        int[] result = new int[indices.size()];
        for (int i = 0; i < indices.size(); i++) {
            result[i] = indices.get(i);
        }
        return result;
    }

    public int getLargest() {
        if (size == 0) {
            return -1;
        }
        int largest = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    public int getSmallest() {
        if (size == 0) {
            return -1;
        }
        int smallest = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public double getAverage() {
        if (size == 0) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        return (double) sum / size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayListAss myList = new ArrayListAss(10);
        myList.add(5);
        myList.add(10);
        myList.add(15);
        System.out.println("List: " + myList);
        System.out.println("Size: " + myList.size());
        System.out.println("Element at index 1: " + myList.get(1));
        System.out.println("Indices of number 10: " + Arrays.toString(myList.find(10)));
        System.out.println("Largest number: " + myList.getLargest());
        System.out.println("Smallest number: " + myList.getSmallest());
        System.out.println("Average: " + String.format("%.2f", myList.getAverage()));
    }
}

