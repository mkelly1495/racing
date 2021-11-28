/**
 * Note: based on code from https://github.com/ralfhergert/pc2-telemetry
 */
package io.ppatierno.formula1.pc2.helpers;

/**
 * This class reads the next bytes into a string.
 */
public class StringParser {

	public static String parse(byte[] data, int length) {
		return parse(data, 0, length);
	}

	public static String parse(byte[] data, int offset, int length) {
		String value = "";
		for (int i = 0; i < length && i + offset < data.length; i++) {
			if (data[i + offset] == 0) {
				break; // null-terminated-string.
			}
			value += (char)data[i + offset];
		}
		return value;
	}
}
