public class MinimizeMaximumofArray {
//    2439. Minimize Maximum of Array
//    Medium
//1.3K
//308
//    Companies
//    You are given a 0-indexed array nums comprising of n non-negative integers.
//
//    In one operation, you must:
//
//    Choose an integer i such that 1 <= i < n and nums[i] > 0.
//    Decrease nums[i] by 1.
//    Increase nums[i - 1] by 1.
//    Return the minimum possible value of the maximum integer of nums after performing any number of operations.




    static int minimizeArrayValue(int[] A) {
        long sum = 0, res = 0;
        for (int i = 0; i < A.length; ++i) {
            sum += A[i];
            res = Math.max(res, (sum + i) / (i + 1));
        }
        return (int)res;
    }

    public static void main(String[] args) {
        System.out.println(minimizeArrayValue(new int []{3,7,1,6}));
    }

}
