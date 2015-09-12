 1 public class Solution {
 2     /**
 3      * @param nums: A list of integers.
 4      * @return: An integer denotes the middle number of the array.
 5      */
 6     public int median(int[] nums) {
 7         // write your code here
 8         int len  = nums.length;
 9         if (len%2 == 0) return search(nums, len/2, 0, len-1);
10         else return search(nums, len/2+1, 0, len-1);
11     }
12     
13     public int search(int[] nums, int k, int start, int end) {
14         int l=start, r=end;
15         int pivot = r;
16         while (true) {
17             while (nums[l] < nums[pivot] && l<r) {
18                 l++;
19             }
20             while (nums[r] >= nums[pivot] && l<r) {
21                 r--;
22             }
23             if (l == r) break;
24             swap(nums, l, r);
25         }
26         swap(nums, l, end);
27         if (k == l+1) return nums[l];
28         else if (k > l+1) return search(nums, k, l+1, end);
29         else return search(nums, k, start, l-1);
30     }
31     
32     public void swap(int[] nums, int l, int r) {
33         int temp = nums[l];
34         nums[l] = nums[r];
35         nums[r] = temp;
36     }
37 }