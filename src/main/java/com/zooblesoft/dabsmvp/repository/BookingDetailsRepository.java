package com.zooblesoft.dabsmvp.repository;

import com.zooblesoft.dabsmvp.model.BookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDetailsRepository extends JpaRepository<BookingDetails, Long> {

}
