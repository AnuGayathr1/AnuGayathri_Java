package mementoPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MementoPattern {
	public static void main(String[] args) throws Exception {
		Laddu myladdu = new Laddu();
		System.out.println("Size of laddu:" + myladdu.size);
		new WriteObject().writeObject(myladdu);
		System.out.println("I ate the laddu");
		myladdu.size = 5;
		System.out.println("Size of laddu after eating..:" + myladdu.size);

		System.out.println("After undo: " + new ReadObject().readObject("myladdu.txt").size);

	}
}
class Laddu implements Serializable {
	int size = 10;
}

class WriteObject {
	public void writeObject(Laddu laddu) throws IOException, FileNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myladdu.txt"));
		oos.writeObject(laddu);
	}
}
class ReadObject {
	public Laddu readObject(String filename) throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
		return (Laddu) ois.readObject();
	}
}
