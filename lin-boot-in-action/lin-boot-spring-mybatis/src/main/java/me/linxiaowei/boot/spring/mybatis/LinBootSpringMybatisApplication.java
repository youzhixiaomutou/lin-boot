package me.linxiaowei.boot.spring.mybatis;

import me.linxiaowei.boot.spring.mybatis.dao.StudentMapper;
import me.linxiaowei.boot.spring.mybatis.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Date;

/**
 * LinBootSpringMybatisApplication
 *
 * @author <a href="mailto://linxiaowei.me@gmail.com">LinXiaoWei</a>
 * @date 2021/6/9 10:37
 */
@SpringBootApplication
public class LinBootSpringMybatisApplication {

    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1);
        s.setGmtCreate(new Date());
        s.setGmtModified(new Date());
        s.setName("Lin");
        s.setAge(18);
        s.setSex(0);
        System.out.println(s);
        ConfigurableApplicationContext ctx = SpringApplication.run(LinBootSpringMybatisApplication.class, args);
        StudentMapper mapper = (StudentMapper) ctx.getBean("studentMapper");
        mapper.save(s);

    }

}
