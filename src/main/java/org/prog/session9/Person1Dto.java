package org.prog.session9;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Person1Dto {
    private String gender;
    private String nat;
    private Name1Dto name;
    private Location1DTO location;


}
