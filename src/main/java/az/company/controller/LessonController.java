package az.company.controller;

import az.company.dto.CarDto;
import az.company.entity.Lesson;
import az.company.service.LessonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lesson")
public class LessonController {
    private final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }


    @GetMapping("/get")
    public List<Lesson> getAllLessson(){
        return lessonService.getAllLesson();
    }

    @GetMapping("/get-cars")
    public List<CarDto> getCars(){
        return lessonService.getCars();
    }

    @PostMapping("/create")
    public Lesson createLesson(@RequestBody Lesson lesson){
        return lessonService.createLesson(lesson);
    }

    @DeleteMapping("/delete")
    public void deleteLesson(@PathVariable Long id){
      lessonService.deleteLesson(id);
    }


}
