package com.aegis.image_shop.repository;

import com.aegis.image_shop.domain.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, Long> {

}
