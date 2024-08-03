import java.util.Arrays;

public class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        int len=target.length;
        int sum=0;
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<len;i++)
        {
            
                if(arr[i]==target[i])
                {
                    sum+=1;
                }
            
        }
        if(sum>=len)
        {
            return true;
        }
        return false;

    }
} {
    
}
