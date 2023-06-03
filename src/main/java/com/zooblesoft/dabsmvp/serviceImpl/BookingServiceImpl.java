package com.zooblesoft.dabsmvp.serviceImpl;

import com.zooblesoft.dabsmvp.model.BookingDetails;
import com.zooblesoft.dabsmvp.repository.BookingDetailsRepository;
import com.zooblesoft.dabsmvp.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingDetailsRepository bookingDetailsRepo;

    @Override
    public BookingDetails addABookingViaIVR(BookingDetails bookingDetails) {
        return bookingDetailsRepo.save(bookingDetails);
    }
}
