package by.sandBox.Controllers;

import by.sandBox.Heap.HTTPSteal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StealController {

    @GetMapping("/bsuirGroup")
    private HTTPSteal httpSteal(@RequestParam(value = "group",defaultValue = "950506")String group){
        return new HTTPSteal(group);
    }
}
