import java.util.Scanner;
public class CasinoSecurity{
	
	public static void main(String[] a){
		
		Scanner scan = new Scanner(System.in);
		String securityMap = scan.nextLine();
		
		int guardCount = getGuardCount(securityMap);
		
		System.out.println(securitySignal(guardCount));
		
	}
	
	public static int getGuardCount(String str){
		char ch;
		int MTC = 0;
		int guardCount = 0;
		for(int i = 0; i < str.length(); i++){
			ch = str.charAt(i);
			if(ch=='$' || ch=='T'){
				if((ch=='$' || ch=='T') && MTC == 1){
					return guardCount;
				}
				MTC = 1;
			}
			if(MTC == 1){
				if(ch=='G')
				guardCount++;
			}
		}
		return guardCount;
	}
	
	public static String securitySignal(int guardCount){
		if(guardCount==0)
			return "ALARM";
		else
			return "quite";
	}

}