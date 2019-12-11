package firstpro.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class fileio {
public static void main(String args[]) throws IOException {
	FileInputStream fis=new FileInputStream("c:\\Users\\Trainee\\Desktop\\fileio.txt");
			FileOutputStream fis1=new FileOutputStream("c:\\Users\\Trainee\\Desktop\\fileio4.txt"); 
int val;
//to check end of stream
while((val = fis.read())!=-1) {
	System.out.println(val);
	fis1.write(val);
}
	fis.close();
	fis1.close();
}}
