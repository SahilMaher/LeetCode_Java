public class Solution {
    public string KthDistinct(string[] arr, int k) 
    {
        long len = arr.Length;
        ArrayList ls = new ArrayList();
        string[] arr2 = new string[len];
        int k1 = 0;
        for (int i = 0; i < len; i++)
        {
            for (int ii = 0; ii < len; ii++)
            {

                if (arr[i] == arr[ii] && i != ii)
                {
                    ls.Add(arr[i]);

                }
            }

        }


        ArrayList ls2 = new ArrayList();
        int j = 0;
        for (int i = 0; i < len; i++)
        {
            if (!ls.Contains(arr[i]))
            {

               ls2.Add( arr[i]);
                j++;
            }

        }
        string res = "";
        k = k - 1;

      


    if( k>=ls2.Count)
    {
        res="";
    }
    else
    {
         res =(string) ls2[k];
    }
    if(res==null)
    {
        res="";

    }
      
        return res;

    }
}