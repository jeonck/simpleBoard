package org.mvp.simpleboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sb")
    @ResponseBody
    public String index() {
        return "안녕하세요. Simple Board 에 오신 것을 환영합니다.";
    }
}
