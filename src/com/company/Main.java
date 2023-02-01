package com.company;

public class Main {

    public static void main(String[] args) {
	ScrewStore screwStore = new ScrewStore();
    Screw screw = new Screw(20,20,100,ScrewDrive.HEX);
    Screw screw1 = new Screw(20,20,100,ScrewDrive.CROSS);
    Screw screw2 = new Screw(20,20,100,ScrewDrive.SLOTDRIVE);
    Screw screw3 = new Screw(20,20,100,ScrewDrive.TORX);
    screwStore.addItem(screw, 20);
    screwStore.addItem(screw1, 20);
    screwStore.addItem(screw2, 20);
    screwStore.addItem(screw3, 20);
        System.out.println(screwStore.stock.get(screw));
    System.out.println(screwStore.stockToString());
    }
}
