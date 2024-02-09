package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@AllArgsConstructor
@Builder
public class Student {

    private String ID;
    private String name;
    @With String address;
    @With String grade;

}
