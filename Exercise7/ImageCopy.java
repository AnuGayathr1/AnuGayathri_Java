package Exercise7;

import java.io.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageCopy {
	public static void main (String[] args) throws IOException {
		
	// Read the image from the file
	BufferedImage image = ImageIO.read(new File("Java-tutorials.jpg"));
	ByteArrayOutputStream outStreamObj = new ByteArrayOutputStream();
		
	// Write the image into the object of ByteArrayOutputStream class
	ImageIO.write(image, "jpg", outStreamObj);
	byte[] byteArray = outStreamObj.toByteArray();
	ByteArrayInputStream inStreamObj = new ByteArrayInputStream(byteArray);
		
	// Read image from byte array
	BufferedImage newImage = ImageIO.read(inStreamObj);
		
	// Write output image
	ImageIO.write(newImage, "jpg", new File("java-logo-vert-blk.png"));
	System.out.println("Image generated from the byte array.");
	}
}

