package com.aegis.image_shop.common.service;

import com.aegis.image_shop.common.domain.PerformanceLog;
import com.aegis.image_shop.common.repository.PerformanceLogRepository;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PerformanceLogServiceImpl implements PerformanceLogService {

    private final PerformanceLogRepository repository;

    // 서비스 성능 로깅 처리
    @Override
    public void register(PerformanceLog performanceLog) throws Exception {
        repository.save(performanceLog);
    }

    @Override
    public List<PerformanceLog> list() throws Exception {
        return repository.findAll(Sort.by(Direction.DESC, "logNo"));
    }

}

