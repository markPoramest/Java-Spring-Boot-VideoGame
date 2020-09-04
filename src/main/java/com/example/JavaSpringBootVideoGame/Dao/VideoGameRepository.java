package com.example.JavaSpringBootVideoGame.Dao;

import com.example.JavaSpringBootVideoGame.Model.VideoGame;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public class VideoGameRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<VideoGame> findAll(){
        Query query = entityManager.createQuery("from videogame");
        return query.getResultList();
    }

    public VideoGame findbyId(String id){
        return entityManager.find(VideoGame.class,id);
    }

    @Transactional
    public String insert(VideoGame videoGame){
        entityManager.persist(videoGame);
        return "Insert Complete";
    }
    @Transactional
    public String update(VideoGame videoGame,String id){
        VideoGame vd = entityManager.find(VideoGame.class,id);
        if(vd==null){
            return "Not found id";
        }
        else{
            vd.setName(videoGame.getName());
            vd.setPlatformList(videoGame.getPlatformList());
            return "Update Complete";
        }
    }
    @Transactional
    public String delete(String id){
        VideoGame videoGame = entityManager.find(VideoGame.class,id);
        entityManager.remove(videoGame);
        if(videoGame==null){
            return "Not found id";
        }
        else{
            entityManager.remove(videoGame);
            return "Delete Complete";
        }
    }


}
