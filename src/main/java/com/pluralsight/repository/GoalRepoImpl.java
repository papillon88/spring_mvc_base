package com.pluralsight.repository;

import com.pluralsight.model.Goal;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by papillon on 7/30/2017.
 */
@Repository("goalrepo")
public class GoalRepoImpl implements GoalRepo {

    @PersistenceContext
    private EntityManager em;

    public Goal save(Goal goal) {
        System.out.println("before persist");
        em.persist(goal);
        em.flush();
        System.out.println("After persist");
        return goal;
    }
}
