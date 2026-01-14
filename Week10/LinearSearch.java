//LinearSearch
public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;   // found
            }
        }
        return -1;  // not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 9, 21, 3};
        int index = linearSearch(arr, 21);

        System.out.println(index == -1 ? "Not Found" : "Found at index: " + index);
    }
}

//Binary Search Iterative
public static int binarySearchIterative(int[] arr, int target) {

    int low = 0, high = arr.length - 1;

    while(low <= high) {

        int mid = (low + high) / 2;

        if(arr[mid] == target) return mid;

        else if(target > arr[mid])
            low = mid + 1;
        else
            high = mid - 1;
    }

    return -1;
}

//Linear Search Recursive
public class LinearSearchRecursive {

    // Recursive function
    public static int linearSearchRec(int[] arr, int target, int index) {

        // base case: index out of range
        if(index == arr.length) {
            return -1;   // not found
        }

        // check current element
        if(arr[index] == target) {
            return index;
        }

        // recursive call for next index
        return linearSearchRec(arr, target, index + 1);
    }

    // Main function
    public static void main(String[] args) {

        int[] arr = {5, 12, 7, 25, 3};
        int target = 25;

        int result = linearSearchRec(arr, target, 0);

        if(result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Found at index: " + result);
    }
}