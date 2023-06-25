import java.util.*;

class Array2 {
    public static void main(String[] args) {

        sumPairs();
    }

    public static void sumPairs() {
        int[] arr = { 8, 7, 2, 5, 3, 1 };
        int target = 10;

        // ? BruteForce Apprach Time Complexity of o(n^2)
        // for (int i = 0; i <= arr.length; i++) {
        // for (int j = 0; j <= arr.length; j++) {
        // if (arr[i] + arr[j] == target) {
        // System.out.printf("Pair found (%d, %d)", arr[i], arr[j]);
        // return;
        // }
        // }
        // }
        // System.out.println("Pairs not Found");

        // ? usign 2 Pointers Time Complexity = o(n.log(n))
        // Arrays.sort(arr);
        // int low = 0;
        // int high = arr.length - 1;

        // while (low < high) {
        // if (arr[low] + arr[high] == target) {
        // System.out.printf("Pairs are (%d ,%d)", arr[low], arr[high]);

        // }
        // if (arr[low] + arr[high] < target) {
        // low++;
        // } else {
        // high--;
        // }
        // }

        // ? Using Hashing Time complexity = O(n) and requires extra space of o(n)
        // Empty hashmap
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                System.out.printf("The Pair is found at (%d, %d)", arr[map.get(target - arr[i])], arr[i]);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("Pair not found");

    }

}