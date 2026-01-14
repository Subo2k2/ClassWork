//Simple Insert Operation
class MyArray {
    private int[] items;
    private int count;

    public MyArray(int length) {
        items = new int[length];
    }

    public void insert(int value) {
        if (count == items.length) {
            System.out.println("Array is full! Cannot insert " + value);
            return;
        }
        items[count++] = value;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.print(items[i] + " ");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        MyArray numbers = new MyArray(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40); // full
        numbers.print();
    }
}

//Dynamic Insert Operation (Resizing)
class DynamicArray {
    private int[] items;
    private int count;

    public DynamicArray(int length) {
        items = new int[length];
    }

    public void insert(int value) {
        // if full, resize
        if (count == items.length) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
            System.out.println("Array resized to " + items.length);
        }
        items[count++] = value;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.print(items[i] + " ");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        DynamicArray numbers = new DynamicArray(2);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30); // triggers resize
        numbers.insert(40);
        numbers.print();
    }
}

//Delete Operation
public void removeAt(int index) {
    if (index < 0 || index >= count) {
        System.out.println("Invalid index!");
        return;
    }
    for (int i = index; i < count - 1; i++)
        items[i] = items[i + 1];
    count--;
}

//Search – indexOf
public int indexOf(int value) {
    for (int i = 0; i < count; i++)
        if (items[i] == value)
            return i;
    return -1;
}

//2D Arrays
public class Main {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
}

//Transpose
public class Main {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Transpose:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[j][i] + " ");
            System.out.println();
        }
    }
}
