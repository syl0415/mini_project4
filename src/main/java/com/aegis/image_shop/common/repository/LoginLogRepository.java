package com.aegis.image_shop.common.repository;


import com.aegis.image_shop.common.domain.LoginLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginLogRepository extends JpaRepository<LoginLog, Long> {

}
