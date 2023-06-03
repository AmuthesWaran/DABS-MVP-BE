package com.zooblesoft.dabsmvp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "patient_details")
public class PatientDetails {

    @Id
    private Long phoneNo;
    private String fullName;
    private String city;
    private String gender;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dateOfBirth;
    private String email;

}
