package me.linxiaowei.boot.spring.mybatis.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import me.linxiaowei.boot.entity.BaseEntity;

/**
 * Student
 *
 * @author <a href="mailto://linxiaowei.me@gmail.com">LinXiaoWei</a>
 * @date 2021/6/9 11:35
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Student extends BaseEntity {

    private String name;
    private int age;
    private int sex;

}
