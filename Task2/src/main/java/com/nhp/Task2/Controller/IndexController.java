package com.nhp.Task2.Controller;

import com.nhp.Task2.Utils.MyBigNumber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String showForm() {
        return "index";
    }

    @PostMapping("/submit")
    public String index(@RequestParam("num1") String num1, @RequestParam("num2") String num2, Model model) {
        String kq = MyBigNumber.sum(num1, num2);
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("kq", kq);
        return "index";
    }
}
