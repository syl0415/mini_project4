package com.aegis.image_shop.repository;

import com.aegis.image_shop.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
