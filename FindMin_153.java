public class FindMin_153 {
    
    public int findMinimum(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        
        while (low < high) {
            int mid = low + (high-low)/2;
            if (arr[mid] < arr[high]) {
                high = mid;
            } else {
                low = mid+1;
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {
        FindMin_153 findMin_153 = new FindMin_153();
        int minimum = findMin_153.findMinimum(new int[] {3,4,5,6,7,1,2});
        System.out.println("The minmum is: "+minimum);
    }
}
