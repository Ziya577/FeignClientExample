package az.company.service;

import az.company.client.CarClient;
import az.company.dto.CarDto;
import az.company.entity.Lesson;
import az.company.repository.LessonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {
    private final LessonRepository lessonRepository;
    private final CarClient carClient;

    public LessonService(LessonRepository lessonRepository, CarClient carClient) {
        this.lessonRepository = lessonRepository;
        this.carClient = carClient;
    }


    public List<Lesson> getAllLesson() {
       return lessonRepository.findAll();
    }

    public Lesson createLesson(Lesson lesson) {
        return lessonRepository.save(lesson);
    }

    public void deleteLesson(Long id) {
        lessonRepository.deleteById(id);
    }

    public List<CarDto> getCars() {
        return carClient.cars("Basic eml5YTp6aXlhNTc3");
    }
}
