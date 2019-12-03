package com.nojava;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.assertj.core.api.Assertions.assertThat;

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
//@AutoConfigureMockMvc
//@AutoConfigureWebTestClient
class ApplicationTests {

    /**
     * 测试1---MockMvc
     */
//    @Autowired
//    private MockMvc mvc;
//    @Test
//    public void exampleTest01() throws Exception {
//        this.mvc.perform(get("/hello"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().string("Hello World"))
//                .andReturn();
//    }

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
