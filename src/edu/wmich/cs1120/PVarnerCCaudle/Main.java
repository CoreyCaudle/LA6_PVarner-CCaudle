package edu.wmich.cs1120.PVarnerCCaudle;

import java.io.IOException;

public class Main {

	/**
	 * @param encoder         Instance of an encoder object
	 * @param decoder         Instance of an encoder object
	 * @param inputFileName   String that contains the input file path
	 * @param encodedFileName Creates the path for the encoded file
	 */

	public static void main(String[] args) throws IOException {
		// Create encoder, decoder objects
		IEncoder encoder = new Encoder();
		IDecoder decoder = new Decoder();
		String inputFileName = "input.txt";
		String encodedFileName = inputFileName + ".encode";

		// Call the encode method
		try {
			encoder.encode(inputFileName, encodedFileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("There was an error with your file.");
		}
		// Call the decode method
		decoder.decode(encodedFileName);

	}

}
