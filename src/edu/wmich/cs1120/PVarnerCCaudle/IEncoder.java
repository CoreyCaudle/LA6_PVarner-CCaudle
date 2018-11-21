package edu.wmich.cs1120.PVarnerCCaudle;

import java.io.IOException;

public interface IEncoder {

	/**
	 * Given the paths of an input file and an output file, the encoder method will
	 * read the input file, encode the data with other random data, and store it
	 * into a binary file with the given path.
	 * 
	 */
	public void encode(String inputFileName, String outputFilePath) throws IOException;
}
