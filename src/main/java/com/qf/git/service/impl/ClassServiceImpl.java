package com.qf.git.service.impl;

import com.qf.git.dao.IDaseDao;
import com.qf.git.entity.SClass;
import com.qf.git.mapper.SClassMapper;
import com.qf.git.service.ISclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl extends DaseServiceImpl<SClass> implements ISclassService {
   @Autowired
    private SClassMapper sClassMapper;

    @Override
    public IDaseDao<SClass> getDao() {
        return sClassMapper;
    }

    @Override
    public List<SClass> getlist() {
        return sClassMapper.getlist();
    }
}
