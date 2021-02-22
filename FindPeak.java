public class FindPeak {
    
    public int findPeakElement(int[] array) {
        int low = 0;
        int high = array.length -1;

        while(low <= high) {
            int mid = low+ (high-low)/2;

            if(mid==0  || (array[mid] > array[mid+1] && array[mid] > array[mid-1]) || mid > array.length -1) {
                return array[mid];
            }
            if(array[mid]<array[mid+1]) {
                low = mid+1;
            } else if(array[mid]<array[mid-1]) {
                high = mid-1;
            } 
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,1,4,5,8,4};
        FindPeak findPeak = new FindPeak();
        int peakElement = findPeak.findPeakElement(array);
        System.out.println("The peak element is"+peakElement);
    }
}
