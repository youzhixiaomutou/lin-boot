package me.linxiaowei.boot.spring.mybatis.dao;

import me.linxiaowei.boot.spring.mybatis.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * StudentDao
 *
 * @author <a href="mailto://linxiaowei.me@gmail.com">LinXiaoWei</a>
 * @date 2021/6/10 13:54
 */
@Mapper
public interface StudentMapper {

    // 默认返回值都是 AffectCount 行数

    int save(@Param("s") Student s);

    int delete(@Param("id") int id);

}
