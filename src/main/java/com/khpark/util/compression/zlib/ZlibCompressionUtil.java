package com.khpark.util.compression.zlib;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class ZlibCompressionUtil {

	public static byte[] compress(byte[] data) throws IOException {
		Deflater deflater = new Deflater();
		deflater.setInput(data);
		ByteArrayOutputStream bos = new ByteArrayOutputStream(data.length);
		deflater.finish();

		byte[] buffer = new byte[1024];

		while (!deflater.finished()) {
			int count = deflater.deflate(buffer);
			bos.write(buffer, 0, count);
		}

		bos.close();
		byte[] output = bos.toByteArray();
		deflater.end();

		return output;
	}

	public static byte[] decompress(byte[] data) throws IOException, DataFormatException {
		Inflater inflater = new Inflater();
		inflater.setInput(data);

		ByteArrayOutputStream bos = new ByteArrayOutputStream(data.length);
		byte[] buffer = new byte[1024];

		while (!inflater.finished()) {
			int count = inflater.inflate(buffer);
			bos.write(buffer, 0, count);
		}

		bos.close();
		byte[] output = bos.toByteArray();
		inflater.end();

		return output;

	}
}