package com.example.JavaSpringBootVideoGame.Dao;

import com.example.JavaSpringBootVideoGame.Model.VideoGame;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class VideoGameRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<VideoGame> findAll(){
        Query query = entityManager.createQuery("from VideoGame");
        return query.getResultList();
    }

    public VideoGame findbyId(Integer id){
        return entityManager.find(VideoGame.class,id);
    }

    @Transactional
    public String insert(VideoGame videoGame){
        entityManager.persist(videoGame);
        return "Insert Complete";
    }
    @Transactional
    public String update(VideoGame videoGame,Integer  id){
        VideoGame vd = entityManager.find(VideoGame.class,id);
        if(vd==null){
            return "Not found id";
        }
        else{
            vd.setName(videoGame.getName());
            vd.setPlatform(videoGame.getPlatform());
            return "Update Complete";
        }
    }
    @Transactional
    public String delete(Integer id){
        VideoGame videoGame = entityManager.find(VideoGame.class,id);
        if(videoGame==null){
            return "Not found id";
        }
        else{
            entityManager.remove(videoGame);
            return "Delete Complete";
        }
    }


}
