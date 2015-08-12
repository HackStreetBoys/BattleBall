package com.battleball;

import java.io.PrintStream;

public class Utils {

	private static PrintStream out = System.out;
	
	public static void log(String output){
		Utils.out.println(output);
	}
	
	public static void setPrintStream(PrintStream stream){
		Utils.out = stream;
	}
}
