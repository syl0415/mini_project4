package com.aegis.image_shop.service;

import com.aegis.image_shop.domain.Item;
import com.aegis.image_shop.domain.Member;
import com.aegis.image_shop.domain.UserItem;

import java.util.List;

public interface UserItemService {

    public void register(Member member, Item item) throws Exception;

    public UserItem read(Long userItemNo) throws Exception;

    public List<UserItem> list(Long userNo) throws Exception;

}
