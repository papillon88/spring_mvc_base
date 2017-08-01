package com.pluralsight.repository;

import com.pluralsight.model.Exercise;
import com.pluralsight.model.Goal;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by papillon on 7/31/2017.
 */
/*@Repository("exerciserepo")
public class ExerciseRepoImpl implements ExerciseRepo {

    @PersistenceContext
    private EntityManager em;

    public Exercise save(Exercise exercise) {
        em.persist(exercise);
        em.flush();
        return exercise;
    }
}*/
