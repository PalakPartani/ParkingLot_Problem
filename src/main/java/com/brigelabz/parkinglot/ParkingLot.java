package com.brigelabz.parkinglot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    int parkingLotSize[];
    Map<Availability, ArrayList> storeLotMap;


    //constructor to initialize array
    public ParkingLot() {
        this.parkingLotSize = new int[100];
        this.setInitialParkingStatus();

    }

    public void setInitialParkingStatus() {
        this.storeLotMap = new HashMap<>();
        ArrayList openSlots = new ArrayList(100);       //Initially all open
        ArrayList fullSlots = new ArrayList();
        for (int i = 0; i < 100; i++) {
            openSlots.add(i);
        }
        this.storeLotMap.put(Availability.UNOCCUPIED, openSlots);
        this.storeLotMap.put(Availability.OCCUPIED, fullSlots);

    }

    public int getAvailableSlots() {
        return this.storeLotMap.get(Availability.UNOCCUPIED).size();
    }

    public int getNearestParkingSlot() {
        int nearestAllottedSlot = (int) this.storeLotMap.get(Availability.UNOCCUPIED).remove(1);
        this.storeLotMap.get(Availability.OCCUPIED).add(nearestAllottedSlot);
        Collections.sort(this.storeLotMap.get(Availability.OCCUPIED));
        return nearestAllottedSlot;
    }

    public int getParkingLotSize() {
        return this.parkingLotSize.length;
    }
}
