package com.aegis.image_shop.common.repository;

import com.aegis.image_shop.common.domain.PerformanceLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerformanceLogRepository extends JpaRepository<PerformanceLog, Long> {
}
