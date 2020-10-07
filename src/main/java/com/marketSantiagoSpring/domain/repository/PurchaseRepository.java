package com.marketSantiagoSpring.domain.repository;

import com.marketSantiagoSpring.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {

    List<Purchase> getAll();
    Optional<List<Purchase>> getByCliente(String clientId);
    Purchase save (Purchase purchase);
}
