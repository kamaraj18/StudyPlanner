package com.kamaraj.studyplanner.repository;

import com.kamaraj.studyplanner.entity.ProgressLog;
import com.kamaraj.studyplanner.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProgressLogRepository extends JpaRepository<ProgressLog, Integer> {
    List<ProgressLog> findByUser(User user);
}
