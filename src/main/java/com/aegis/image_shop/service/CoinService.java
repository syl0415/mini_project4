package com.aegis.image_shop.service;

import com.aegis.image_shop.domain.ChargeCoin;
import com.aegis.image_shop.domain.PayCoin;

import java.util.List;

public interface CoinService {

    public void charge(ChargeCoin chargeCoin) throws Exception;

    public List<ChargeCoin> list(Long userNo) throws Exception;

    public List<PayCoin> listPayHistory(Long userNo) throws Exception;
}
