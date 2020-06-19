package com.howe.tujiu.utils;

import com.howe.tujiu.entity.Result;

/**
 * @author Hao.Zheng
 * @description:
 * @title: ResultUtil
 * @projectName tujiu
 * @date 2020/6/1917:35
 * @company 上海织田信息技术有限公司 (Oda-Group)
 */
public class ResultForm {
    /**成功且带数据**/
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }
    /**成功但不带数据**/
    public static Result success(){

        return success(null);
    }
    /**失败**/
    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
