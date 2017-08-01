package com.pluralsight.repository;

import com.pluralsight.model.Exercise;
import com.pluralsight.model.Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by papillon on 7/31/2017.
 */
@Repository("exerciserepo")
public interface ExerciseRepo extends JpaRepository<Exercise,Long> {

    /*Exercise save(Exercise exercise);*/
}
