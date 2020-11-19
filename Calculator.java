
public class Calculator {
    
    public static void main(String[] args){
   
    String nums="1,\n,2,3";
    int sum=Add(nums);
    System.out.println("The sum is:" +sum);
}
    
    static int Add(String nums)
   {  
       int sum=0;
      for(int i=0;i<nums.length();i++)
      {
          if(nums.charAt(i)==',' && nums.charAt(i+1)=='\n' )
        {
            System.out.println("Error!");
            return 0;
        }
       
         else if(nums.charAt(i)=='\n' || nums.charAt(i)==',')
            continue;
         else if(Character.isDigit(nums.charAt(i)))
          {
              sum+=(nums.charAt(i)-'0');
          }
      }
      
      return sum;
   }
}
