package me.linxiaowei.boot.spring.mybatis;

import me.linxiaowei.boot.spring.mybatis.dao.StudentMapper;
import me.linxiaowei.boot.spring.mybatis.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * LinBootSpringMybatisApplicationTests
 *
 * @author <a href="mailto://linxiaowei.me@gmail.com">LinXiaoWei</a>
 * @date 2021/6/9 10:38
 */
@SpringBootTest
public class LinBootSpringMybatisApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void test1() {
        Student s = new Student();
        s.setId(1);
        s.setGmtCreate(new Date());
        s.setGmtModified(new Date());
        s.setName("Lin");
        s.setAge(18);
        s.setSex(0);
        System.out.println(studentMapper.save(s));
        System.out.println(s.getId());
    }

    @Test
    public void test2() {
        System.out.println(studentMapper.delete(3));
    }

}
