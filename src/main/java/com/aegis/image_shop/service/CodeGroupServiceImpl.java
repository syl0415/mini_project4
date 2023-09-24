package com.aegis.image_shop.service;

import com.aegis.image_shop.domain.CodeGroup;
import com.aegis.image_shop.repository.CodeGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CodeGroupServiceImpl implements CodeGroupService {

    private final CodeGroupRepository repository;

    @Override
    public void register(CodeGroup codeGroup) throws Exception {
        repository.save(codeGroup);
    }

    @Override
    public CodeGroup read(String groupCode) throws Exception {
        return repository.getOne(groupCode);
    }

    @Override
    public void modify(CodeGroup codeGroup) throws Exception {
        CodeGroup codeGroupEntity = repository.getOne(codeGroup.getGroupCode());

        codeGroupEntity.setGroupName(codeGroup.getGroupName());

        repository.save(codeGroupEntity);
    }

    @Override
    public void remove(String groupCode) throws Exception {
        repository.deleteById(groupCode);
    }

    @Override
    public List<CodeGroup> list() throws Exception {
        System.out.println(repository.findAll());
        return repository.findAll(Sort.by(Sort.Direction.DESC, "groupCode"));
    }

}
