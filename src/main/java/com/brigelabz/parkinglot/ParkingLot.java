package com.brigelabz.parkinglot;

public class ParkingLot {

    int parkingLotSize[];

    //constructor to initialize array
    public ParkingLot() {
        this.parkingLotSize = new int[100];
    }

    public int getParkingLotSize() {
        return this.parkingLotSize.length;
    }
}
