package com.systoque_back_end.service;

import com.systoque_back_end.exception.ProductNotFoundException;
import com.systoque_back_end.model.Stock;
import com.systoque_back_end.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> findAll() {
        return stockRepository.findAll();
    }

    public Stock save(Stock stock) {
        return stockRepository.save(stock);
    }

    public void delete(Long id) {
        if (!stockRepository.existsById(id)) {
            throw new ProductNotFoundException("Entrada de estoque não encontrada com o ID: " + id);
        }
        stockRepository.deleteById(id);
    }
}