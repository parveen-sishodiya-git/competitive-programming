import java.util.Scanner;
public class YouTubeLinkFinder{
	public static void main(String[] s){
		Scanner scan = new Scanner(System.in);
		String ytLink = scan.nextLine();
		System.out.println(getVideoId(ytLink));
	}
	
	public static String getVideoId(String link){
		String videoId = "";
		for(int i=link.length()-1;i>0;i--){
			char ch = link.charAt(i);
			if(ch =='/' || ch =='='){
				return videoId;
			}
			videoId = ch + videoId;
		}
		return videoId;
	}
}