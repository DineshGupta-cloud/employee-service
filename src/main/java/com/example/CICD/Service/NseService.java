package com.example.CICD.Service;

import com.example.CICD.Entity.OptionData;
import com.example.CICD.repository.OptionDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class NseService {

    @Autowired
    public OptionDataRepository  optionDataRepository;

    public List<String> getStocksList(){
        List<OptionData> s = optionDataRepository.findAll();

        List<String> d = s.stream().map(g->g.getSymbol()).distinct().collect(Collectors.toList());
        System.out.println(d);
        return d;
    }

    public Map<Boolean,List<OptionData>> getStock(){
        List<OptionData> s = optionDataRepository.findAll();

        Map<Boolean,List<OptionData>> d = s.stream()
                .collect(Collectors.partitioningBy(t->t.getOptionType()=="CE"));
        System.out.println(d);
        return d;
    }

    public Map<LocalDate,List<OptionData>> getBYSymbol(){
        List<OptionData> s = optionDataRepository.findAll();
        Map<LocalDate,List<OptionData>> f = s.stream().filter(d->d.getSymbol().equals("ADANIENSOL")).collect(Collectors.groupingBy(OptionData::getExpiryDate));
        System.out.println(f);
        return f;
    }

    public List<LocalDate> getBYExpiryDate() {

        return optionDataRepository.findAll()
                .stream()
                .map(OptionData::getExpiryDate)
                .filter(Objects::nonNull)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
