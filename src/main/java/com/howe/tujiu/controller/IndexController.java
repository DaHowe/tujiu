package com.howe.tujiu.controller;

import com.howe.tujiu.entity.Result;
import com.howe.tujiu.utils.ResultForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Hao.Zheng
 * @description:
 * @title: IndexController
 * @projectName tujiu
 * @date 2020/6/1917:40
 * @company 上海织田信息技术有限公司 (Oda-Group)
 */
@Controller
@Slf4j
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public Result index(){
        log.info("#####################################");
        log.info("####### 欢迎使用TU.JIU平台 ##########");
        log.info("#####################################");
        return ResultForm.success();
    }
}
