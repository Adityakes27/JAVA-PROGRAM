
public class MaxEvenOddSubarray {

    public static void main(String[] args) {

        int arr[] = {5, 10, 20, 6, 3, 8};

        int curr = 1;
        int res = 1;

        for(int i = 1; i < arr.length; i++) {

            if((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) ||
               (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {

                curr++;
                res = Math.max(res, curr);

            } else {
                curr = 1;
            }
        }

        System.out.println("Maximum Length = " + res);
    }
} 