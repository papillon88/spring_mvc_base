package com.pluralsight.service;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

import java.util.List;

/**
 * Created by papillon on 7/30/2017.
 */
public interface GoalService {

    Goal save(Goal goal);

    List<Goal> findAllGoals();

    List<GoalReport> findGoalReports();
}
