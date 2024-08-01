// 1. Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        int[] arr=new int[2];
        int len =nums.length;

        for(int i=0;i<len;i++)
        {
            int tempVal=nums[i];
            for(int ii=0;ii<len;ii++)
            {
                int temp=nums[ii];
                int tempSum=temp+tempVal;
                if(tempSum==target && i!=ii)
                {
                    arr[0]=i;
                    arr[1]=ii;
                }

            }
        }
    

       return arr;
    }
   
        
    
}
public class P1TwoSum
{

    
}
