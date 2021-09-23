package com.workshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HotelReservationTest {

    @Test
    public void AddHotelNamesLakeWood() {
        Hotel hotel1 = new Hotel("LakeWood", 110);
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel(hotel1);
        List<Hotel> list = hotelReservation.getHotels();
        Assertions.assertTrue(list.contains(hotel1));
    }

    @Test
    public void AddHotelNamesBridgeWood() {
        Hotel hotel1 = new Hotel("BridgeWood", 160);
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel(hotel1);
        List<Hotel> list = hotelReservation.getHotels();
        Assertions.assertTrue(list.contains(hotel1));
    }

}
