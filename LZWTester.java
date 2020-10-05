/*
* Praise be to Ms. Kaufman and Computer Science A teachers.
* They spoke the truth when they spoke of handwritten code and BlueJ. */

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


/*
 *          ,   ,
 *          \\  \\
 *          ) \\ \\    I--
 *          )  )) ))  / * \
 *          \  || || / /^="
 * ,__      _\ \\ --/ /
 * <  \\___/         '
 *     '===\    ___, )
 *          \  )___/\\
 *          / /      '"
 *          \ \
 *           '"*/
