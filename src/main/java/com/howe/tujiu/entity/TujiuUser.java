package com.howe.tujiu.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Hao.Zheng
 * @description:
 * @title: TujiuUser
 * @projectName tujiu
 * @date 2020/6/1916:48
 */
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("TUJIU_USER")
public class TujiuUser implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * user_name
     */
    @TableField("user_name")
    private String userName;

    /**
     * password
     */
    @TableField("password")
    private String password;

    /**
     * 权限：0管理员 1普通用户
     */
    @TableField("power")
    private Integer power;

    /**
     * del_flag
     */
    @TableField("del_flag")
    private Integer delFlag;

    /**
     * create_date
     */
    @TableField("create_date")
    private Date createDate;

    /**
     * head_img_url
     */
    @TableField("head_img_url")
    private String headImgUrl;

}
