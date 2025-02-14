package com.systoque_back_end.controller;

import com.systoque_back_end.model.Stock;
import com.systoque_back_end.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping
    public ResponseEntity<List<Stock>> getAllStockEntries() {
        List<Stock> stockEntries = stockService.findAll();
        return ResponseEntity.ok(stockEntries);
    }

    @PostMapping
    public ResponseEntity<Stock> createStockEntry(@Valid @RequestBody Stock stock) {
        Stock savedStock = stockService.save(stock);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStock);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStockEntry(@PathVariable Long id) {
        stockService.delete(id);
        return ResponseEntity.noContent().build();
    }
}