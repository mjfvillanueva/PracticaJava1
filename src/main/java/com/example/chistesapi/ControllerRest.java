package com.example.chistesapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chistes")
public class ControllerRest {
    private List<Chistes> chistes= new ArrayList<>();
    
    @GetMapping("/aleatorio")
    public Chistes getChistesAletorio(){
        int indice= new Random().nextInt(chistes.size());
        return chistes.get(indice);
    }
    @GetMapping("/{categoria}")
    public List<Chistes> getChistesCategoria(@PathVariable String categoria ){
        
        return chistes;
    }
    
    @PostMapping
    public void agregarChiste ( @RequestBody Chistes chiste)
    {
        chistes.add(chiste);
    }
    
}
