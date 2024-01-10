
import java.util.Scanner;

class CountSubs {
    public static void main(String[] args) {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // int testcases = Integer.parseInt(br.readLine());
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();

        int arr[] = new int[n];

        // String line = br.readLine();
        // String[] elements = line.trim().split(" ");

        for (int index = 0; index < n; index++) {
            arr[index] = sc.nextInt();
        }

        // Solution obj = new Solution();

        System.out.println(countSubarrays(arr, n, l, r));

    }

    static long countSubarrays(int arr[], int n, int l, int r) {
        // Complete the function
        long count = 0;
        int i = 0, j = 0;
        int window = 0;
        while (j < n) {
            if ((arr[j] >= l) && (arr[j] <= r)) {
                window = j - i + 1;
            } else if (arr[j] > r) {
                window = 0;
                i = j + 1;
            }
            count += window;
            j++;
        }
        return count;
    }
}
