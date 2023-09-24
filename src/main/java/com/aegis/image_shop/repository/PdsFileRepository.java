package com.aegis.image_shop.repository;

import com.aegis.image_shop.domain.PdsFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PdsFileRepository extends JpaRepository<PdsFile, Long> {

    public List<PdsFile> findByFullName(String fullName);

}