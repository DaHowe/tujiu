package com.howe.tujiu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.howe.tujiu.entity.TujiuUser;
import com.howe.tujiu.mapper.TuJiuUserMapper;
import com.howe.tujiu.service.TuJiuUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hao.Zheng
 * @description:
 * @title: TuJiuUserServiceImpl
 * @projectName tujiu
 * @date 2020/6/1916:52
 */
@Service
public class TuJiuUserServiceImpl implements TuJiuUserService {

    @Autowired
    private TuJiuUserMapper tuJiuUserMapper;

    @Override
    public List<TujiuUser> findAllUser() {
        LambdaQueryWrapper<TujiuUser> queryWrapper = new LambdaQueryWrapper<>();
        List<TujiuUser> tujiuUsers = tuJiuUserMapper.selectList(queryWrapper);
        return tujiuUsers;
    }

    @Override
    public boolean userLogin(TujiuUser tujiuUser) {
        return false;
    }
}
