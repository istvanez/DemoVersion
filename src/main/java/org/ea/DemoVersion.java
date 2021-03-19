package org.ea;

/**
 * Versioning demo created by Daniel Persson
 */
public class DemoVersion {
    public static void main(String args[]) {
        System.out.println("Hello explorers.");
        System.out.println();
        System.out.println("This program is running version "+
                DemoVersion.class.getPackage().getImplementationVersion());
    }
}
