package edu.wmich.cs1120.PVarnerCCaudle;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Decoder implements IDecoder {

	/**
	 * @param randFile The binary file passed through during method call
	 * @param k        String to Store data read from the binary file
	 * @param y        integer used to store the random integer n, to determine how
	 *                 many pieces of random data to skip
	 */

	@Override
	public void decode(String filePath) throws IOException {
		// Access the binary file

		RandomAccessFile randFile = new RandomAccessFile(filePath, "rw");

		String k = "";

		int y = 0;

		// Read the file, Storing the proper data into a string, ignoring the rest

		while (y != -1) {

			k = k + randFile.readChar();

			y = randFile.readInt();

			for (int j = 0; j < y; j++) {
				randFile.readChar();
			}

		}

		// Print the data decoded from the binary file

		System.out.println(k);
		randFile.close();

	}

}
