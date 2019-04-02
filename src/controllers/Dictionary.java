package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class Dictionary {
    static HashMap<String , String> dic = new HashMap<>();
    static {
        dic.put("Dog" , "Con chó");
        dic.put("Fanta" , "Nước ngọt");
        dic.put("Computer" , "Máy tính");
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }


    @PostMapping("/search")
    public String convert(@RequestParam String word, Model model){
        String rels = dic.get(word);
        model.addAttribute("mean",rels);
        return "index";
    }
}
