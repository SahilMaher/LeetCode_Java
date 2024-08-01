// 2678. Number of Senior Citizens
class Solution {
    public int countSeniors(String[] details) 
    {
        int len=details.length;
      
        int val=0;
        int sum=0;
     
        for(int i1=0;i1<len;i1++)
        {
            String data=details[i1];
           
            char ch=data.charAt(11);
            char ch2=data.charAt(12);
            val=ch-'0';
            int val2=ch2-'0';
             
            if(val>=6  )
            {
                if(val ==6 && val2==0 )
                {
                    continue;

               
                }
                else
                {
                     sum+=1;
                }
            }
        
        }
        return sum;
        
    }
}