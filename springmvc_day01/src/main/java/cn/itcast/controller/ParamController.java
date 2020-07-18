package cn.itcast.controller;

import cn.itcast.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/8 11:41
 */
@Controller
@RequestMapping(value = "/param")
public class ParamController {
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("执行了。。。");
        System.out.println(account);
        return "success";
    }
}
