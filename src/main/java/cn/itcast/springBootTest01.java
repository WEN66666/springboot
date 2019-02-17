package cn.itcast;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class springBootTest01 {
    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "胡博是废物！";
    }
}
