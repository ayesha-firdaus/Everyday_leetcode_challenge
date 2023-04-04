public class BinarySearch {
    static int search(int[] a, int target) {
        int start=0,end=a.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==a[mid])
            {
                return mid;
            }
            else if (a[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;

            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12},9));
    }
}
