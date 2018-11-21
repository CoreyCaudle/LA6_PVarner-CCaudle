package edu.wmich.cs1120.PVarnerCCaudle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Encoder implements IEncoder {

	@Override
	public void encode(String inputFileName, String outputFilePath) throws IOException {

		File file = new File(inputFileName);

		char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l' };

		RandomAccessFile randFile = new RandomAccessFile(outputFilePath, "rw");

		ArrayList<Character> list = new ArrayList<Character>();

		String k = "";

		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				k = k + scan.nextLine();
			}

			scan.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("There was an issue with the file");
		}

		for (int i = 0; i < k.length(); i++) {
			list.add(k.charAt(i));
		}

		for (int j = 0; j < list.size() - 1; j++) {
			int v = ThreadLocalRandom.current().nextInt(1, 20 + 1);

			randFile.writeChar(list.get(j));
			randFile.writeInt(v);

			for (int m = 0; m < v; m++) {
				int z = ThreadLocalRandom.current().nextInt(1, 11 + 1);
				randFile.writeChar(chars[z]);
			}

		}

		randFile.writeChar(list.get(list.size() - 1));
		randFile.writeInt(-1);

	}

}
