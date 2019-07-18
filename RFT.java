//Author thenerdpoint60
// 18/7/19


import java.util.Scanner;
//Rail-Fence Technique
class RFT
{
public static void main(String args[])
{
  int i;
  String a="",c="";//saving the cipher text
  Scanner myObj = new Scanner(System.in); 
  System.out.println("Enter Plain Text");
  //input from the user
  String plaintext = myObj.nextLine(); 
  for(i=0;i<plaintext.length();i++)
  {
      if(i%2==0)//Checking for every alternate letters
      {
        c+=plaintext.charAt(i);
      }
      else
      {
      a+=plaintext.charAt(i);
      }
  }
  System.out.println("Your Plaint Text is :"+plaintext);
  System.out.println("The Cipher Text is:"+c+a);
}
}