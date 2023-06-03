package com.zooblesoft.dabsmvp.controller;

import com.zooblesoft.dabsmvp.model.BookingDetails;
import com.zooblesoft.dabsmvp.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking-patient")
public class BookingController {


    @Autowired
    private BookingService bookingServ;

    @PostMapping("/ivr")
    public ResponseEntity<BookingDetails> saveABookingViaIVR(@RequestBody BookingDetails bookingDetails){
//        bookingServ.addABookingViaIVR(bookingDetails);
        return new ResponseEntity<BookingDetails>(bookingServ.addABookingViaIVR(bookingDetails), HttpStatus.ACCEPTED);
    }

}
