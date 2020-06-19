package com.howe.tujiu.service;

import com.howe.tujiu.entity.TujiuUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hao.Zheng
 * @description:
 * @title: TuJiuUserService
 * @projectName tujiu
 * @date 2020/6/1916:52
 */

public interface TuJiuUserService {
    /**
     * 查询所有用户
     * @return
     */
    List<TujiuUser> findAllUser();

    /**
     * 登录
     * @param tujiuUser
     * @return
     */
    boolean userLogin(TujiuUser tujiuUser);
}
