class Solution {
    public  int removeElement(int[] nums, int val) 
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[count]=nums[i];
                count++;
            }
        }
        return count ;
        
    }
}
class MAin{
    public static void main (String args[])
    {
        int num[]={3,2,2,3};
        int val=3;
        Solution sol=new Solution();
        int k=sol.removeElement(num, val);
        System.out.println(k);
        for(int i=0;i<k;i++)
        {
            System.out.println(num[i]);
        }
       

    }
}
