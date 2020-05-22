package top.zz6628.mybatis.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zhenz
 * @description
 * @date 2020/5/22 20:11
 */
@Slf4j
@SpringBootTest
class TestMapperTest {

    @Autowired
    TestMapper testMapper;

    @Test
    void test1() {
        try {
            log.info("{}", new ObjectMapper().writeValueAsString(testMapper.test()));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}