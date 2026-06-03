package com.example.CICD.Controller;

import com.example.CICD.Entity.OptionData;
import com.example.CICD.Service.NseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {

    public NseService nseService;

    public TestController(NseService nseService) {
        this.nseService = nseService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "CI/CD Working";
    }

    @GetMapping("/symbol")
    public List<String> symbol() {

        List<String> f = nseService.getStocksList();
        return f;
    }

    @GetMapping("/symbolStock")
    public Map<Boolean,List<OptionData>> symbolList() {

        Map<Boolean,List<OptionData>> f = nseService.getStock();
        return f;
    }
}