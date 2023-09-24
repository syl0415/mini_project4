package com.aegis.image_shop.common.service;

import com.aegis.image_shop.common.domain.LoginLog;
import com.aegis.image_shop.common.repository.LoginLogRepository;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LoginLogServiceImpl implements LoginLogService {

    private final LoginLogRepository repository;

    @Override
    public void register(LoginLog loginLog) throws Exception {
        repository.save(loginLog);
    }

    @Override
    public List<LoginLog> list() throws Exception {
        return repository.findAll(Sort.by(Direction.DESC, "logNo"));
    }

}
