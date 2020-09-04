package com.example.JavaSpringBootVideoGame.Service;

import com.example.JavaSpringBootVideoGame.Dao.VideoGameRepository;
import com.example.JavaSpringBootVideoGame.Model.VideoGame;
import org.springframework.stereotype.Service;

import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class VideoGameService {
    private VideoGameRepository videoGameRepository;

    public VideoGameService(VideoGameRepository videoGameRepository) {
        this.videoGameRepository = videoGameRepository;
    }
    public List<VideoGame> findAll(){
        return videoGameRepository.findAll();
    }

    public VideoGame findbyId(Integer id){
        return videoGameRepository.findbyId(id);
    }

    public String insert(VideoGame videoGame){
        return videoGameRepository.insert(videoGame);
    }

    public String update(VideoGame videoGame,Integer id){
       return  videoGameRepository.update(videoGame,id);
    }

    public String delete(Integer  id){
        return videoGameRepository.delete(id);
    }
}
