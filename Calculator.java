
import java.util.*;

class Calculator{
public static void main(String[] args){
   
   Scanner sc = new Scanner(System.in);
    String nums=sc.next();
    int sum=Add(nums);
    System.out.println("The sum is:" +sum);
}

static int Add(String nums)
{
    int sum=0,i=0;
    char delim=',';
    int s=0;
    
    if(nums.charAt(0)=='/' && nums.charAt(1)=='/')
    {
        delim=nums.charAt(2);
        i=3;
    }
    for(;i<nums.length();i++)
        
        if(nums.charAt(i)==',' && nums.charAt(i+1)=='\n' )
        {
            System.out.println("Error!");
            return 0;
        }
       
        else if(nums.charAt(i)=='\n' || nums.charAt(i)==delim)
            continue;
        
        else if(Character.isDigit(nums.charAt(i)) && nums.charAt(i-1)=='-')
        {
            try
            {
                s=i;
                throw new Exception("negatives not allowed\n");
            }
            catch(Exception e)
            {
                System.out.print(e);
                for(int j=s;j<nums.length();j++)
                {
                   if(Character.isDigit(nums.charAt(j)) && nums.charAt(j-1)=='-')
                       System.out.println(nums.charAt(j)-'0');
                }
                return 0;
            }
        }
        else if(Character.isDigit(nums.charAt(i)))
        {
            sum+=(nums.charAt(i)-'0');
        }
    
    return sum;
}
}
