package com.aegis.image_shop.service;

import com.aegis.image_shop.dto.CodeLabelValue;

import java.util.List;

public interface CodeService {
    public List<CodeLabelValue> getGroupCodeList() throws Exception;

    public List<CodeLabelValue> getCodeList(String groupCode) throws Exception;
}
