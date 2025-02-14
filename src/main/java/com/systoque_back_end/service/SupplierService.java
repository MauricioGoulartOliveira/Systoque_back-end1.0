package com.systoque_back_end.service;

import com.systoque_back_end.exception.ProductNotFoundException;
import com.systoque_back_end.model.Supplier;
import com.systoque_back_end.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    public Optional<Supplier> findById(Long id) {
        return supplierRepository.findById(id);
    }

    public Supplier save(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    public Supplier update(Long id, Supplier updatedSupplier) {
        return supplierRepository.findById(id).map(supplier -> {
            supplier.setName(updatedSupplier.getName());
            supplier.setContact(updatedSupplier.getContact());
            supplier.setAddress(updatedSupplier.getAddress());
            return supplierRepository.save(supplier);
        }).orElseThrow(() -> new ProductNotFoundException("Fornecedor não encontrado com o ID: " + id));
    }

    public void delete(Long id) {
        if (!supplierRepository.existsById(id)) {
            throw new ProductNotFoundException("Fornecedor não encontrado com o ID: " + id);
        }
        supplierRepository.deleteById(id);
    }
}