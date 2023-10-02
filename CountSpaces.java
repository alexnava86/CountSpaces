public class CountSpaces
{
   public static void main(String[] args)
   {
      int spaceCount = 0;   
      int i;    
      String someString = "The person who says something is impossible should not interrupt the person who is doing it."; 
      
      System.out.printf("%s\n", someString);
      for(i=0;i< someString.length(); i++)
      {
         if(Character.isWhitespace(someString.charAt(i)))
         {
            spaceCount++;
         }
      }
      System.out.printf("^This sentence contains %d blank spaces.\n", spaceCount);
   }
}