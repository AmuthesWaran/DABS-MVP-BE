package com.zooblesoft.dabsmvp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "booking_details")
public class BookingDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long bookingId;
    private Long tokenNo;
    private Long  patientPhoneNo;
    private String bookingSlot;
    private String doctorId;
    private String notes;


}
