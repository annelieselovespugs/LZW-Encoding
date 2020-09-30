import java.io.IOException;

public class LZWTester {
	public static void main (String [] args) throws IOException
	{
		Encoder en = new Encoder ();

		//System.out.println("Encoding...");
		en.encode("input.txt");

		//System.out.println("Decoding...");
		en.decode();

		//System.out.println("Testing has completed! :)");
	}
}
