package com.hpe.arrays;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

public class hashmaping {
	private static final String G_IO_INPUT_TXT = "G:\\io\\input.txt";

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(G_IO_INPUT_TXT));
		Map<String, Integer> hm = new LinkedHashMap<String, Integer>();

		String line;
		String[] keyvalues;
		while (((line = in.readLine()) != null)) {
			keyvalues = line.split("=");
			String name = keyvalues[0];
			int value=	getInteger(keyvalues[1])  ;
			if (hm.containsKey(name)) {
				value =hm.get(name)+value;
			}

			hm.put(name, value);
		}
		in.close();
		System.out.println(hm);
		//Files.lines(Paths.get(G_IO_INPUT_TXT)).forEach(record -> storeRecords(hm, record));
		//System.out.println(hm);
	}

	private static void storeRecords(Map<String, Integer> hm, String record) {
		String[] values = record.split("=");
		if(values.length<2 || values.length>2)
			System.out.println("invlaid record: "+record);
		else 
			hm.put(values[0], getRecordValue(hm, values));
	}

	private static int getRecordValue(Map<String, Integer> hm, String[] values) {
		String recordName = values[0];
		int recordValue = getInteger(values[1]);
		return hm.containsKey(recordName) ? hm.get(recordName)+recordValue : recordValue;
	}

	private static Integer getInteger(String value) {
		return Integer.valueOf(value);
	}
}
