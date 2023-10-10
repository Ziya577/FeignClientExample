package az.company.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Lesson")
@Data

public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;

}
