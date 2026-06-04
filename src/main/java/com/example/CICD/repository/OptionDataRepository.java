package com.example.CICD.repository;

import com.example.CICD.Entity.OptionData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OptionDataRepository
        extends JpaRepository<OptionData, Long> {

    List<OptionData> findBySymbol(String symbol);

    List<OptionData> findBySymbolAndOptionType(
            String symbol,
            String optionType
    );

    @Query("SELECT DISTINCT o.symbol FROM OptionData o")
    List<String> findDistinctSymbols();
}