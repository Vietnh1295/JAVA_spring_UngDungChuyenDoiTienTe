package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {
  @GetMapping("/converter")
    public String converter(@RequestParam double rate,@RequestParam double usd, Model model)
  {
      model.addAttribute("rate",rate);
      model.addAttribute("usd",usd);
      double result=rate*usd;
      model.addAttribute("result",result);
      return "index";
  }

}
