public class Calculator {
    
    public static void main(String[] args){
   
    String nums="1,2,3";
    int sum=Add(nums);
    System.out.println("The sum is:" +sum);
}
    
    static int Add(String nums)
   {  
       int sum=0;
      for(int i=0;i<nums.length();i++)
      {
          if(Character.isDigit(nums.charAt(i)))
          {
              sum+=(nums.charAt(i)-'0');
          }
      }
      
      return sum;
   }
}