package com.exps.test;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class SingletonClassLoaderTest1 {

	public static void main(String[] args) throws Exception {
		com.exps.sdp.Printer p1 = null;

		Object p2 = null, p3 = null;

		URLClassLoader loader1 = null, loader2 = null;

		ClassLoader loader = null;

		// get First object
		p1 = com.exps.sdp.Printer.getInstance();
		loader = p1.getClass().getClassLoader();
		System.out.println(loader);

		// create Custom ClassLoader and Load Singleton class and also create obj using
		// reflection api
		// loader1=new URLClassLoader(new URL[] {new
		// URL("file:/C:\\Users\\win\\eclipse-workspace-DesignPatterns\\8Proj-Singleton_CustomClassLoader\\MyJar.jar")},p1.getClass().getClassLoader());
		loader1 = new URLClassLoader(
				new URL[] {
						new URL("file:/C:\\Users\\win\\git\\DesignPatterns\\SingletonJAVAClasses\\1Proj-SingletonDP\\bin\\Myjar.jar") },
				null); // Independent ClassLoader
		Class<?> clazz1 = loader1.loadClass("com.exps.sdp.Printer");
		Method method = clazz1.getDeclaredMethod("getInstance", new Class[] {});
		p2 = method.invoke(null);
		System.out.println(p1.hashCode() + "   " + p2.hashCode());

		/*
				// create Custom ClassLoader and Load Singleton class and also create obj using
				// reflection api
				loader2 = new URLClassLoader(
						new URL[] {
								new URL("file:/E:\\WorkSpaces\\spring\\NTDP914\\SingletonDP4-CustomClassLoader\\sdpnit.jar") },
						loader1);
				Class<?> clazz2 = loader2.loadClass("com.nt.sdp1.Printer");
				Method method1 = clazz2.getDeclaredMethod("getInstance", new Class[] {});
				p3 = method1.invoke(null);
		
				System.out.println(p1.hashCode() + "   " + p2.hashCode() + "  " + p3.hashCode());
		 */
	}

}
