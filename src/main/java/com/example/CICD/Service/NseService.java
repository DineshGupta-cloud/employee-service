package com.example.CICD.Service;

import com.example.CICD.Entity.OptionData;
import com.example.CICD.repository.OptionDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
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
}
