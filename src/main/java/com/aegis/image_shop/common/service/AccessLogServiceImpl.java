package com.aegis.image_shop.common.service;

import java.util.List;

import com.aegis.image_shop.common.domain.AccessLog;
import com.aegis.image_shop.common.repository.AccessLogRepository;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AccessLogServiceImpl implements AccessLogService {

    private final AccessLogRepository repository;

    //접근 로깅 처리
    @Override
    public void register(AccessLog accessLog) throws Exception {
        repository.save(accessLog);
    }

    @Override
    public List<AccessLog> list() throws Exception {
        return repository.findAll(Sort.by(Direction.DESC, "logNo"));
    }

}
