// 66. Plus One
// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
//  The digits are ordered from most significant to least significant in left-to-right order.
//   The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.


import java.math.BigInteger;

public class PlusOne
{
    public static void  main(String[] args)
    {
        int[] digits={9,8,7,6,5,4,3,2,1,0};
        
        String  val="";
        for(int n : digits)
        {
            val+=Integer.toString(n);

        }
        BigInteger finalVal = new BigInteger(val);

        finalVal = finalVal.add(BigInteger.ONE);
        String valStr= finalVal.toString();
       
        int[] arr=new int[valStr.length()];
        for(int i=0;i<valStr.length();i++)
        {
            arr[i]= Character.getNumericValue(valStr.charAt(i));
        }
        

    }
}