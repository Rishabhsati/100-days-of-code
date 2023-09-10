import java.util.*;

public class Array_substraction {
    static boolean biggerCheck(int n1[], int n2[])
    {
        // n1 = [1, 3, 1, 0]
        // n2 = [1, 3, 0, 1]

        // STEP 3) i = 2 (The loop will break, first number will be bigger)

        // what is each element of array denoting - (digits of a number)
        if(n1.length > n2.length)
        {
            return true;
        }
        else if(n1.length < n2.length)
        {
            return false;
        }
        else
        {
            // when their lengths are equal
            // n1 = [1, 3, 0, 0]
            // n2 = [1, 3, 0, 1]

            // STEP 1) i = 0, both condition are false (1>1, 1<1)
            // STEP 2) i = 1, both condition are false (3>3, 3<3)
            // STEP 3) i = 2, both condition are false (0>0, 0<0)
            // STEP 4) i = 3, (0>1 false) (0<1 TRUE (Second number is bigger))
            for(int i=0; i<n1.length; i=i+1)
            {
                if(n1[i] > n2[i])
                {
                    return true; // n1 is bigger
                }
                else if(n1[i] < n2[i])
                {
                    return false; // n2 is bigger
                }
            }

            // when numbers are same
            return true;
        }
    }

    static int[] subtraction(int bigger[], int smaller[])
    {
        // bigger - smaller
        // 100 - 99 = 001
        int answer[] = new int[bigger.length];

        int n = bigger.length;
        int m = smaller.length;

        int i = n-1;
        int j = m-1;

        int borrow = 0;

        while(i>=0 && j>=0)
        {
            if(bigger[i]-borrow < smaller[j])
            {
                answer[i] = bigger[i] - borrow + 10 - smaller[j];
                borrow = 1;
            }
            else
            {
                answer[i] = bigger[i] - borrow - smaller[j];
                borrow = 0;
            }

            i = i-1;
            j = j-1;
        }

        while(i>=0)
        {
            if(bigger[i] - borrow < 0)
            {
                answer[i] = bigger[i] - borrow + 10;
                borrow = 1;
            }
            else
            {
                answer[i] = bigger[i] - borrow;
                borrow = 0;
            }

            i = i - 1;
        }

        return answer;
    }

    static int[] removeExtraZeroFromFront(int result[])
    {
        int i = 0;
        int n = result.length;

        while(i<n)
        {
            if(result[i] != 0)
            {
                // first non zero digit we found
                break;
            }
            i = i + 1;
        }

        if(i == n)
        {
            // all the digts are zero, there will be no non zero digit
            int ans[] = new int[1];
            return ans;
        }

        // i is referring to first non zero digit
        int size = n-i;
        int answer[] = new int[size];

        int j = 0;
        while(j<size)
        {
            answer[j] = result[i];
            j = j + 1;
            i = i + 1;
        }

        return answer;
    }

    static int[] subtract(int[] n1, int[] n2) {

        // 1. Find the bigger number
        boolean isFirstNumberBiggerThanSecondNumber = biggerCheck(n1, n2);

        // declaring the array
        int result[];

        int sign = 1;

        // 2. Bigger - Smaller number
        if(isFirstNumberBiggerThanSecondNumber)
        {
            result = subtraction(n1, n2);
        }
        else
        {
            sign = -1;
            result = subtraction(n2, n1);
        }

        // 3. There can be leading zero (there can zero's in front 100 - 99 = 001)
        // These extra zero's need to removed
        result = removeExtraZeroFromFront(result);

        // 4. Second > First (Final result is negative, we need to add negative sign)
        result[0] = sign * result[0];

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

        int[] res = subtract(arr1, arr2);
        for (int i : res) System.out.println(i);
    }
}
