package az.company.repository;

import az.company.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson,Long> {
}
