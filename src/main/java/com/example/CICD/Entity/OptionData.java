package com.example.CICD.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "nse_fo_bhavcopy")
@Data
public class OptionData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String symbol;

    @Column(name = "option_type")
    private String optionType;

    @Column(name = "strike_price")
    private Double strikePrice;

    @Column(name = "open_interest")
    private Long openInterest;

    @Column(name = "change_in_open_interest")
    private Long changeInOpenInterest;

    @Column(name = "underlying_price")
    private Double underlyingPrice;

    @Column(name = "expiry_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private LocalDate expiryDate;
}