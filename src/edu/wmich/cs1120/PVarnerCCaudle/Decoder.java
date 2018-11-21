package edu.wmich.cs1120.PVarnerCCaudle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Decoder implements IDecoder {

	@Override
	public void decode(String filePath) throws IOException {
		RandomAccessFile randFile = new RandomAccessFile(filePath, "rw");

		String k = "";

		int y = 0;

		while (y != -1) {

			k = k + randFile.readChar();

			y = randFile.readInt();

			for (int j = 0; j < y; j++) {
				randFile.readChar();
			}

		}

		System.out.println(k);

	}

}
