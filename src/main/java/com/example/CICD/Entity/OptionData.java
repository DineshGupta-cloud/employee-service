package com.example.CICD.Entity;

import jakarta.persistence.*;
import lombok.Data;

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
}