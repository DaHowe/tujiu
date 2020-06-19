package com.howe.tujiu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.howe.tujiu.entity.TujiuUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Hao.Zheng
 * @description:
 * @title: TuJiuUserMapper
 * @projectName tujiu
 * @date 2020/6/1916:50
 * @company 上海织田信息技术有限公司 (Oda-Group)
 */
@Mapper
public interface TuJiuUserMapper extends BaseMapper<TujiuUser> {
}
