package com.nojava;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



/**
 * 该类是进行springboot测试的类
 * @SpringBootTest 为执行测试程序的引导类
 *
 *
 *
 *
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
//@AutoConfigureWebTestClient
class ApplicationTests {

    /**
     * 测试1---MockMvc
     */
    @Autowired
    private MockMvc mvc;

    /**
     *
     * @throws Exception
     */
    @Test
    public void getHello() throws Exception {
        mvc.perform(
                MockMvcRequestBuilders.get("/")   //请求路径
                .accept(MediaType.APPLICATION_JSON))           //添加请求首部字段Accept
                .andExpect(status().isOk())                     // andExpect() 对返回信息进行验证
                .andExpect(content().string(equalTo("Greetings from Spring Boot!1")));
    }







    /**
     * 测试2---WebTestClient
     */
//    @Autowired
//    private WebTestClient webTestClient;
//    @Test
//    public void exampleTest02() {
//        this.webTestClient.get().uri("/hello").exchange().expectStatus().isOk().expectBody(String.class)
//                .isEqualTo("Hello World");
//    }

//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Test
//    public void exampleTest03() {
//        String body = this.restTemplate.getForObject("/hello", String.class);
//        assertThat(body).isEqualTo("Hello World");
//
//    }


}
