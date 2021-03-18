package com.projectcourse.courseprofessional.student;

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
/*@Data this could replace all annotations mentioned up, but in this case the
id must be final. Connecting with the database the id cannot be final*/

/*Class that describe a Student through Lombok, used to replace all getters, setters, costructors and method
* related at this class */
public class Student {
    //better use the object Long for things linked to database creation
    private Long id;
    private String name;
    private String email;
    private Gender gender;
}
