package com.systoque_back_end.service;

import com.systoque_back_end.model.Product;
import com.systoque_back_end.model.Sale;
import com.systoque_back_end.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> findAll() {
        return saleRepository.findAll();
    }

    public Sale save(Sale sale) {
        // Atualiza o estoque
        Product product = sale.getProduct();
        product.setQuantityInStock(product.getQuantityInStock() - sale.getQuantitySold());
        // Salva a venda
        return saleRepository.save(sale);
    }}
