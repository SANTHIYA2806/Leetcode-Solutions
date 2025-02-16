class Solution{
    static int removeDuplicates(int nums[]){
        if(nums.length<=2){
            return nums.length;
        }
        int temp=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[temp-2]){
                nums[temp++] = nums[i];
            }
        }
        return temp;
    }
}
