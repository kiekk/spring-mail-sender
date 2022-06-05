package com.example.mailsender;

import com.example.mailsender.entity.Todo;
import com.example.mailsender.util.MailUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySources;
import org.springframework.test.context.TestPropertySource;

import java.util.*;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.yml")
class MailSenderApplicationTests {

    private final static List<Todo> todoList = new ArrayList<>();

    static {
        for (int i = 1; i <= 10; i++) {
            todoList.add(new Todo(i, "할 일 _" + i, i % 2 == 0, new Date()));
        }
    }

    @Autowired
    private MailUtil mailUtil;

    @Test
    void contextLoads() throws Exception {
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("todoList", todoList);
        mailUtil.sendTemplateMail("dbstnsgh2@naver.com", "메일 테스트", "윤순호", dataMap);
    }

}
