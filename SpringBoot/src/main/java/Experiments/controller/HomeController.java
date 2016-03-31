package Experiments.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by menonv on 3/31/2016.
 */
@RestController
public class HomeController {

   @RequestMapping("/home2")
   public String home2()
   {
      return "Hello from home2";
   }

   @RequestMapping()
   public String home()
   {
      return "Hello from home";
   }


}
