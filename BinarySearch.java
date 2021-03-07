//Binary Search Implementation (Iterative)




class BinarySearch {
    private static int binarySearch(int[] nums, int target) {
      int start = 0, end = nums.length - 1;
  
      while(start <= end) {
        int mid = (start + end)/2;
        if(target == nums[mid]) {
          return mid;
        } else if (target < nums[mid]){
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
  
      return -1;
    }
    
    public static void main(String[] args) {
      int[] nums = new int[]{1, 7, 9, 11, 17, 24, 38};  
      int target = 1;
  
      int result = binarySearch(nums, target);
  
      if (result >= 0) {
        System.out.printf("The element %d exists at index %d in the array", target, result);
      } else {
        System.out.printf("The element %d doesn't exist in the array", target);
      }
    }
  }