package com.howe.tujiu.controller;

import com.howe.tujiu.entity.TujiuUser;
import com.howe.tujiu.service.TuJiuUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Hao.Zheng
 * @description:
 * @title: TuJiuUserController
 * @projectName tujiu
 * @date 2020/6/1916:56
 * @company 上海织田信息技术有限公司 (Oda-Group)
 */
@Controller
@Slf4j
@RequestMapping("/user")
public class TuJiuUserController {

    @Autowired
    private TuJiuUserService tuJiuUserService;

    @RequestMapping("/find")
    @ResponseBody
    public List<TujiuUser> findAllUser(){
        List<TujiuUser> allUser = tuJiuUserService.findAllUser();
        return allUser;
    }


}
