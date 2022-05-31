import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        // array input
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // displayArr(arr, 0);
        // displayArrReverse(arr, 0);
        // displayArrReverse2(arr, n-1);
        // displayArrReverse3(arr, n-1);
        // System.out.println(maxOfArray(arr, 0));
        int x = scn.nextInt();
        System.out.println(firstIndex(arr, 0, x));
    }

    public static void displayArr(int arr[], int idx) {
        if(idx == arr.length) return;

        System.out.println(arr[idx]);
        displayArr(arr, idx+1);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx == arr.length) return;

        displayArrReverse(arr, idx + 1);
        System.out.println(arr[idx]);
    }

    public static void displayArrReverse2(int[] arr, int idx){
        if(idx == -1){
            return;
        }

        System.out.println(arr[idx]);
        displayArrReverse2(arr, idx-1);
    }

    public static void displayArrReverse3(int[] arr, int idx){
        if(idx == 0){
            System.out.println(arr[0]);
            return;
        }

        System.out.println(arr[idx]);
        displayArrReverse3(arr, idx-1);
    }
    
    public static int max = Integer.MIN_VALUE;
    
    public static int maxOfArray(int[] arr, int idx){
        // int max = Integer.MIN_VALUE;
        
        if(idx == arr.length){
            return max;
        }

        maxOfArray(arr, idx+1);
        if(arr[idx] > max){
            max = arr[idx];
        }

        return max;
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }

        if(arr[idx] == x){
            return idx;
        }

        return firstIndex(arr, idx+1, x);
    }
}
