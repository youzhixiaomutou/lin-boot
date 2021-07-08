package me.linxiaowei.boot.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * OperateLog
 *
 * @author <a href="mailto://linxiaowei.me@gmail.com">LinXiaoWei</a>
 * @date 2021/7/8 16:56
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OperateLog extends BaseEntity {

    /**
     * 业务
     */
    private String business;
    /**
     * 操作
     */
    private String action;
    /**
     * 详细信息
     */
    private String detail;

}
