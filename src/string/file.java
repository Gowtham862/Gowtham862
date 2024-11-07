package string;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file {
public static void main(String[] args) throws IOException {
	File f=new File("D:\\Movies\\gowtham\\dummy.txt");
	String s="hlo how are you";
	FileOutputStream fi=new FileOutputStream(f);
	fi.write(s.getBytes());
	FileInputStream f1=new FileInputStream(f);
	int i=f1.read();
	while(i>0) {
		System.out.print((char)i);
		i=f1.read();
	}
}
}