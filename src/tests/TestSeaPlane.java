package tests;

import sources.SeaPlane;

public class TestSeaPlane {
    public static void main(String[] args) {
        SeaPlane seaPlane1 = new SeaPlane();
        seaPlane1.takeOff();
        seaPlane1.fly();
        seaPlane1.land();
    }
}
