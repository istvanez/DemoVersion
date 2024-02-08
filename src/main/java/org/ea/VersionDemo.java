package org.ea;

public class VersionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<------- Hola mundo equipo elias ortiz ---->");
		System.out.println();
		System.out.println("Este programa en ejecucion es la version:"
				+ VersionDemo.class.getPackage().getImplementationVersion());
	}

}
