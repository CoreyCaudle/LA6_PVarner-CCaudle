package edu.wmich.cs1120.PVarnerCCaudle;

import java.io.IOException;

public interface IDecoder {

	/**
	 * Given a binary file, the decoder method will read the file, decode the
	 * message and print it to the console.
	 */

	public void decode(String filePath) throws IOException;

}
