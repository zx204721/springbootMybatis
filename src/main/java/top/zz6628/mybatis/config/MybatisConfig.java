package top.zz6628.mybatis.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zhenz
 * @description
 * @date 2020/5/22 20:39
 */
@Configuration
@MapperScan("top.zz6628.mybatis.mapper")
public class MybatisConfig {

}
