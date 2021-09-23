package com.workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Vaishnavi
 * @date : 23-september-2021.
 * @purpose : To Add hotel in a Hotel Reservation System with Name
 * and Rates of Regular Customer.
 */


public class HotelReservation {

    public List<Hotel> list = new ArrayList<>();

    /**
     * @param hotel
     * @purpose: Adding Hotel to the List
     */
    public void addHotel(Hotel hotel) {
        list.add(hotel);
    }

    public List<Hotel> getHotels() {
        return list;
    }

    public void setList(List<Hotel> list) {
        this.list = list;
    }

    // main Method
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation system..!!");
    }

}


