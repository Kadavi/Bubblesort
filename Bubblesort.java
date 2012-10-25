public class Bubblesort {

    public static int[] bubblesort(int[] nums) {
        boolean flag = true;

        while (flag) {

            flag = false;

            for (int i = 0; i < nums.length - 1; i++) {
		// If we get through a whole loop without seeing something to be done, then exit and finish
		//     Otherwise, tick the flag to let us continue another sweep
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {81, 1, 3, 5};
        
        bubblesort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

		// Output: 1 3 5 81 

    }
}
