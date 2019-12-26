package com.nojava._01startspringboot.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 控制器解析
 * @GetMapping注解 确保http get请求到/greeting 对应到greeting()方法
 * @RequestParam 绑定值到参数为name, required=false 表示该值不是必须的。 defaultValue 会提供一个默认值。
 * 将值绑定到Model 对象中，并通过试图去渲染，最后访问页面就可以看到
 */
@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
