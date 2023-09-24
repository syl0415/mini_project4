package com.aegis.image_shop.common.service;

import com.aegis.image_shop.common.domain.PerformanceLog;

import java.util.List;

public interface PerformanceLogService {

    public void register(PerformanceLog performanceLog) throws Exception;

    public List<PerformanceLog> list() throws Exception;

}
