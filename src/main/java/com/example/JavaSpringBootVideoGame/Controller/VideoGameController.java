package com.example.JavaSpringBootVideoGame.Controller;

import com.example.JavaSpringBootVideoGame.Dao.VideoGameRepository;
import com.example.JavaSpringBootVideoGame.Model.VideoGame;
import com.example.JavaSpringBootVideoGame.Service.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/videogame/api")
public class VideoGameController {
    @Autowired
    private VideoGameService videoGameService;

    @GetMapping("/findAll")
    public List<VideoGame> findAll(){
        return videoGameService.findAll();
    }

    @GetMapping("/findbyId/")
    public VideoGame findbyId(@PathVariable("{id}") Integer id){
        return videoGameService.findbyId(id);
    }

    @PostMapping("/insert")
    public String insert(@RequestBody VideoGame videoGame){
        return videoGameService.insert(videoGame);
    }

    @PostMapping("/update/{id}")
    public String update(@RequestBody VideoGame videoGame,@PathVariable("{id}") Integer id){
        return  videoGameService.update(videoGame,id);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("{id}") Integer  id){
        return videoGameService.delete(id);
    }

}
