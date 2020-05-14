package com.exps.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.exps.sdp.Printer;

public class DeSerializationTest4 {

	public static void serialize(Object obj) {
		ObjectOutputStream out = null;
		try {
			// create stream pointing to the null
			out = new ObjectOutputStream(new FileOutputStream("E:/print.ser"));
			out.writeObject(obj);
			out.flush();
			System.out.println("Object Serialized");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null)
					out.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}// serialize

	public static Object deSerialize() {
		ObjectInputStream ois = null;
		Object obj = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("E:/print.ser"));
			obj = ois.readObject();
			System.out.println("Object DeSerialized");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
			} catch (Exception exc) {
				exc.printStackTrace();
			}
		}
		return obj;
	}// deSerialize

	public static void main(String[] args) {
		// get singleton Object
		Printer p1 = null;
		Printer p2 = null;
				p1 = Printer.INSTANCE;
		
				// perform serialization
				DeSerializationTest4.serialize(p1);
				System.out.println("p1 :" + p1.hashCode());
		
		// perform deSerialization
		try {
			p2 = (Printer) DeSerializationTest4.deSerialize();
				System.out.println("p1: " + p1.hashCode() + "\np2: " + p2.hashCode());
				System.out.println("p1==p2? " + (p1 == p2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
