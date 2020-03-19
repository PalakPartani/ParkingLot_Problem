package com.brigelabz.parkinglot;

import org.junit.Assert;
import org.junit.Test;

public class ParkingLotTest {

    @Test
    public void givenParkLot_WhenEmpty_ShouldReturn100() {

        ParkingLot parkingLot = new ParkingLot();
        int parkingLotSize = parkingLot.getParkingLotSize();
        Assert.assertEquals(100, parkingLotSize);
    }
}
