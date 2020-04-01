import java.net.URL;
import java.net.URLConnection;

public class CheckConnection{
	public static void main(String[] a){
		try{
			URL url = new URL("https://google.com");
			URLConnection con = url.openConnection();
			con.connect();
			System.out.println("You are connected!");

		}
		catch(Exception e){
			System.out.println("You are not connected!");
		}
	}
}