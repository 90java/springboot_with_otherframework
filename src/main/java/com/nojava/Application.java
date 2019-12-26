package com.nojava;


import com.nojava._01startspringboot.StartCommand;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        new StartCommand(args);
        System.out.println("------------");
        SpringApplication.run(Application.class, args);
    }

    /**
     * 查看Spring Boot内注册的Bean
     * @param ctx
     * @return
     */
//    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            System.out.println("Spring Boot 提供的Bean:");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            System.out.println("---------------------bean start-----------------------------");
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
            System.out.println("---------------------bean end-----------------------------");

            System.out.println("---------------------华丽分割线-----------------------------");
        };
    }

}
