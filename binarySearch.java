public class binarySearch {
    public static void search(int[] arr, int s, int e, int target) {
        if (s == e) {
            if (target == arr[s])
                System.out.println(s);
        }
        if (s < e) {
            int mid = (s + e) / 2;
            if (arr[mid] == target)
                System.out.println(mid);
            else if (arr[mid] < target)
                search(arr, mid + 1, e, target);
            else
                search(arr, mid - 1, mid, target);
                return;

        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        search(arr, 0, arr.length - 1, 5);
    }
}
