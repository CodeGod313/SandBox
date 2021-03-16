package by.sandBox.Controllers;

import by.sandBox.Heap.Watafcuker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Watafuck {
    @GetMapping("/watafuck")
    public Watafcuker watafuckLoad(@RequestParam() String ZhopaType){
        return new Watafcuker(ZhopaType);
    }
}
