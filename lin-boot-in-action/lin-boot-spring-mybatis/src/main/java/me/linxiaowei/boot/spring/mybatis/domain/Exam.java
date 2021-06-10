package me.linxiaowei.boot.spring.mybatis.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import me.linxiaowei.boot.entity.BaseEntity;

/**
 * Exam
 *
 * @author <a href="mailto://linxiaowei.me@gmail.com">LinXiaoWei</a>
 * @date 2021/6/10 13:48
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Exam extends BaseEntity {

    private Integer studentId;
    private Integer courseId;
    private Integer score;

}
