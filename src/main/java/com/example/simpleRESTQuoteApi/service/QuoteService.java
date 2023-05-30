package com.example.simpleRESTQuoteApi.service;

import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class QuoteService {

    private List<String> fakeQuote = new ArrayList<>(
            Arrays.asList(
                    "Quote 1",
                    "Quote 2",
                    "Quote 3"));

    public List<String> getAllQuotes() {
        return fakeQuote;
    }


    public String getQuoteByIndex(int index) {
        try{
            return fakeQuote.get(index);
        }
        catch (Exception e){
            return "No item in this index";
        }

    }

    public void addQuote(String quote) {
//        System.out.println(quote);
        fakeQuote.add(quote);
    }
}
