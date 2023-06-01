package com.example.simpleRESTQuoteApi.controller;


import com.example.simpleRESTQuoteApi.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quotes")
public class QuoteController {
    @Autowired
    private QuoteService quotes;


    @GetMapping()
    public List<String> getQuotes( ) {
        return quotes.getAllQuotes();
    }


    @GetMapping("/{index}")
    public String getQuoteByIndex(@PathVariable int index) {
        String quote = quotes.getQuoteByIndex(index);
        return quote;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void addQuote(@RequestBody String quote) {
        System.out.println(quote);
        quotes.addQuote(quote);
    }


    @PatchMapping("/{index}")
    @ResponseStatus(HttpStatus.OK)
    public void updateQuote(@PathVariable int index, @RequestBody String quote) {
        quotes.updateQuote(index, quote);
    }
}
