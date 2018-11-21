package edu.wmich.cs1120.PVarnerCCaudle;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		IEncoder encoder = new Encoder();
		IDecoder decoder = new Decoder();
		String inputFileName = "input.txt";
		String encodedFileName = inputFileName + ".encode";
		try {
			encoder.encode(inputFileName, encodedFileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("There was an error with your file.");
		}
		decoder.decode(encodedFileName);

	}

}
