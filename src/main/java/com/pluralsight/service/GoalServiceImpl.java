package com.pluralsight.service;

import com.pluralsight.model.Goal;
import com.pluralsight.repository.GoalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by papillon on 7/30/2017.
 */
@Service("goalservice")
public class GoalServiceImpl implements GoalService {

    @Autowired
    private GoalRepo goalRepo;

    @Transactional
        public Goal save(Goal goal) {
            return goalRepo.save(goal);
    }
}
