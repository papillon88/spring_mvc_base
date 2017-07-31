package com.pluralsight.repository;

import com.pluralsight.model.Exercise;
import com.pluralsight.model.Goal;

/**
 * Created by papillon on 7/31/2017.
 */
public interface ExerciseRepo {

    Exercise save(Exercise exercise);
}
