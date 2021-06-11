package me.linxiaowei.boot.entity;

import lombok.Data;

import java.util.Date;

/**
 * BaseEntity
 *
 * @author <a href="mailto://linxiaowei.me@gmail.com">LinXiaoWei</a>
 * @date 2021/5/6 16:40
 */
@Data
public abstract class BaseEntity {

    /**
     * 自增 id
     */
    private Integer id;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;

}
