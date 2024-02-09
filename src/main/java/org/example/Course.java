package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Course {

    String ID;
    String name;
    Teacher teacher;
    List<String> students;
}
