package com.pluralsight.repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

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

    public List<Goal> findAllGoals() {
        /*Query query = em.createQuery("Select g from Goal g");*/
        TypedQuery<Goal> query = em.createNamedQuery(Goal.FIND_ALL_GOALS,Goal.class);
        List goals = query.getResultList();
        return goals;
    }

    public List<GoalReport> findGoalReports() {
        /*Query query = em.createQuery("Select new com.pluralsight.model.GoalReport" +
                "(g.minutes,e.minutes,e.activity) from Goal g,Exercise e where g.id = e.goal.id");*/
        TypedQuery<GoalReport> query = em.createNamedQuery(Goal.FIND_GOAL_REPORTS,GoalReport.class);
        return query.getResultList();
    }
}
