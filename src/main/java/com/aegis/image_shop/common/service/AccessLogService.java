package com.aegis.image_shop.common.service;

import com.aegis.image_shop.common.domain.AccessLog;

import java.util.List;

public interface AccessLogService {

    // 접근 로깅 처리
    public void register(AccessLog accessLog) throws Exception;

    public List<AccessLog> list() throws Exception;
}
