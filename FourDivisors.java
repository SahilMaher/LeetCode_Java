// 1390. Four Divisors


// Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors. 
// If there is no such integer in the array, return 0.

public class FourDivisors 
{
    public static int sumFourDivisors(int n)
    {

        int checkDiv=0;
        int sum=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println("Divisor: i is "+i);
                System.out.println("Divisor: n is "+n);
                checkDiv++;
                sum+=i;
                if(i!=n/i)
                {
                    sum+=n/i;
                    checkDiv++;
                }
            }
        }
        System.out.println("Total Divisors: "+checkDiv);
        System.out.println("Total sum: "+sum);
        System.out.println("---------------------------------------------------");
       
        if(checkDiv==4)
        {
            return sum;
        }
        return 0;


    }
    public static void main(String[] args)
    {
        int nums[] = {7286,18704,70773,8224,91675};
        int totalSum=0;
        System.out.println(nums.length);
        if(nums.length<1)
        {
            System.out.println("kk");
        }
        for(int i=0;i<nums.length;i++)
        {
            int sum=FourDivisors.sumFourDivisors(nums[i]);
            totalSum+=sum;
        }
        System.out.println(totalSum);
    }
}