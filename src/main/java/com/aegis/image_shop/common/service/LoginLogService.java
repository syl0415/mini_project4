package com.aegis.image_shop.common.service;


import com.aegis.image_shop.common.domain.LoginLog;

import java.util.List;

public interface LoginLogService {

    public void register(LoginLog loginLog) throws Exception;

    public List<LoginLog> list() throws Exception;

}
