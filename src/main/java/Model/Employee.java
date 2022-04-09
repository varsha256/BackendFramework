package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;

@Getter
@Setter
@Builder
public class Employee {
    private String name;
    private String age;
    private String salary;
}
