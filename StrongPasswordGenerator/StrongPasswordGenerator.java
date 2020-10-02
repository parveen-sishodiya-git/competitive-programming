//Author: Daniel


//Please upvote my code..


import java.util.Random;





public class StrongPasswordGenerator 


{


	public static void main(String[] args)


	{


		int length = 10; // password length


		System.out.println(generatePswd(length));


	}


	static char[] generatePswd(int len)


	{


		System.out.println("Your Password:");


	String passSymbols =	 "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_=+-/€.?<>)[];^#"; //86

		System.out.println("Symbol stream length : "+passSymbols.length());
		Random rnd = new Random();


		char[] password = new char[len];
		

		for (int i = 0; i < len; i++) 


		{


			password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()-1));	 //	87	


		}


		return password;


	}


}