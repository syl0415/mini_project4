package com.aegis.image_shop.common.repository;

import com.aegis.image_shop.common.domain.AccessLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessLogRepository extends JpaRepository<AccessLog, Long> {
}
