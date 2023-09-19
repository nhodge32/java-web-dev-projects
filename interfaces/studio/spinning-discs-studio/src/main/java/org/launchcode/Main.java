package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCD = new CD("LaunchCode's Best Hits", 200, "mp3", "CD-R");
        DVD myDVD = new DVD("LaunchCode's Blooper Real", 15, "wav", "DVD-RW");
        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCD.throwDisc();
        myDVD.throwDisc();

        myDVD.laser();
        myCD.laser();

        myDVD.spinDisc();
        myCD.spinDisc();

        myDVD.storeData();
        myCD.storeData();
    }
}