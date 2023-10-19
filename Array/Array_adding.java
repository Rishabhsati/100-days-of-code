import java.util.*;

public class Array_adding{
    // Java program to sum two numbers
// represented two arrays.

        static int[] calSum(int a[], int b[], int n, int m) {

            // a is the first array, n is size of first array
            // b is the second array, m is the size of second array

            // Numbers are represented by array
            // Each element of array is denoting -> Digit of that number

            // Return -> Final Array which represent sum of both array

            // final array size will be either larger array size or (1 + larger size)

            int largerSize = 0;
            if(n>m)
            {
                largerSize = n;
            }
            else
            {
                largerSize = m;
            }

            int result[] = new int[largerSize];

            // we need to add digits
            int i = n-1;
            int j = m-1;
            int k = largerSize - 1;

            int carry = 0;

            // n = 3, m = 4, largerSize = 4
            // a ->   9 9 8
            // b -> 1 7 8 7

            // STEP 1: i=2, j=3, k=3, sum = 8 + 7 + 0 = 15, carry = 1 (next time), result[3] = 5
            // STEP 2: i=1, j=2, k=2, sum = 9 + 8 + 1 = 18, carry = 1 (next time), result[2] = 8
            // STEP 3: i=0, j=1, k=1, sum = 9 + 7 + 1 = 17, carry = 1 (next time), result[1] = 7
            // STEP 4: i=-1, j=0, k=0, carry = 1 (Since i is negative, the loop will not run)
            // Both the arrays are present (ADDITION)
            while(i>=0 && j>=0)
            {
                int sum = a[i] + b[j] + carry;
                // sum < 10 or sum >= 10

                if(sum>=10)
                {
                    carry = 1;
                }
                else
                {
                    carry = 0;
                }

                result[k] = sum%10;

                // i is moving toward left
                i = i-1;

                // j is moving toward left
                j = j-1;

                // k is moving toward left
                k = k-1;
            }

            // STEP 5: j=0, k=0, sum = 1 + 1 = 2, carry = 0, result[0] = 2
            // STEP 6: j=-1, k=-1, The loop will stop
            // copy the elements with carry (First array is finished)
            while(j>=0)
            {
                int sum = b[j] + carry;

                if(sum>=10)
                {
                    carry = 1;
                }
                else
                {
                    carry = 0;
                }

                result[k] = sum%10;

                // j is moving toward left
                j = j-1;

                // k is moving toward left
                k = k-1;
            }

            // copy the elements with carry (Second array is finished)
            while(i>=0)
            {
                int sum = a[i] + carry;

                if(sum>=10)
                {
                    carry = 1;
                }
                else
                {
                    carry = 0;
                }

                result[k] = sum%10;

                // i is moving toward left
                i = i-1;

                // k is moving toward left
                k = k-1;
            }

            if(carry == 1)
            {
                // After copying all the elements the carry is still 1
                // EXTRA digit needs to be added and
                // we need to return a bigger size array

                int answer[] = new int[largerSize + 1];
                answer[0] = carry;

                // EXAMPLE
                //     9 9 9  -> a
                // + 9 9 9 9  -> b
                //   0 9 9 8  -> result
                //   0 1 2 3  -> index

                // answer = 1 0 0 0 0 (Initially)
                // result = 0 9 9 8

                // STEP 1: i=0, answer[1] = result[0], answer = 1 0 0 0 0
                // STEP 2: i=1, answer[2] = result[1], answer = 1 0 9 0 0
                // STEP 3: i=2, answer[3] = result[2], answer = 1 0 9 9 0
                // STEP 4: i=3, answer[4] = result[3], answer = 1 0 9 9 8

                for(int z=0; z<largerSize; z=z+1)
                {
                    answer[z+1] = result[z];
                }

                return answer;
            }

            return result;
        }

        /* Driver program to test above function */
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n1 = sc.nextInt();
            int[] arr1 = new int[n1];
            for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

            int n2 = sc.nextInt();
            int[] arr2 = new int[n2];
            for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
            sc.close();

            int[] res = calSum(arr1, arr2, n1, n2);
            for (int i : res) System.out.println(i);
        }
}
