package com.brigelabz.parkinglot;

import org.junit.Assert;
import org.junit.Test;

public class ParkingLotTest {

    //test for initial status of parking lot
    @Test
    public void givenParkLot_WhenEmpty_ShouldReturn100() {

        ParkingLot parkingLot = new ParkingLot();
        int parkingLotSize = parkingLot.getParkingLotSize();
        Assert.assertEquals(100, parkingLotSize);
    }

    // test to return first empty slot to driver to fill
    @Test
    public void givenAnEmptyParkingLot_WhenAskedToFillFirstOpenSlot_ShouldReturnFirstEmptySlot() {
        ParkingLot parkingLot = new ParkingLot();
        int slots = parkingLot.getNearestParkingSlot();
        Assert.assertEquals(1, slots);
    }
}
