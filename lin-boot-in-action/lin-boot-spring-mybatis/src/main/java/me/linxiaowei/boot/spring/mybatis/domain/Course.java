package me.linxiaowei.boot.spring.mybatis.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import me.linxiaowei.boot.entity.BaseEntity;

/**
 * Course
 *
 * @author <a href="mailto://linxiaowei.me@gmail.com">LinXiaoWei</a>
 * @date 2021/6/10 13:46
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Course extends BaseEntity {

    private String name;

}
