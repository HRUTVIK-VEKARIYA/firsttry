import java.net.*;
public class FindIP{
	public static void main(String[] args) {
		try{
			InetAddress ip1 = InetAddress.getByName("www.vvpedulink.ac.in"); // For Any Machine IP Address
			InetAddress ip2 = InetAddress.getLocalHost(); // For Local Computer IP Address
			System.out.println(ip1);
			System.out.println(ip2);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}