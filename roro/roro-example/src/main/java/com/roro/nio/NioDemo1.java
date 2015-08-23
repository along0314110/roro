package com.roro.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.apache.commons.io.IOUtils;

public class NioDemo1 {
	/*
	 * private static Selector selector;
	 * 
	 * public static Selector getSelector() { if (selector == null) { try {
	 * selector = Selector.open(); } catch (IOException e) {
	 * e.printStackTrace(); } } return selector; }
	 */

	public static void main(String[] args) {
		String str = "C:\\Users\\yebin\\Desktop\\123.txt";
		Path path = FileSystems.getDefault().getPath(str);
		BufferedReader reader = null;
		try {
			reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			Stream<String> stream = reader.lines();
			stream.filter(w -> w.contains("Known")).forEach(
					new Consumer<String>() {
						public void accept(String t) {
							System.out.println(t);
						}
					});
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(reader);
		}
	}
}
