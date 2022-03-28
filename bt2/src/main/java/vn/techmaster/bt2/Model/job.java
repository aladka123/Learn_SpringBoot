package vn.techmaster.bt2.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class job {
    public job(String string, String string2, String string3, String string4, int i, int j, String string5) {
    }
    private String id;
    private String title;
    private String description;
    private String location;
    private int min_salary;
    private int max_salary;
    private String email_to;
    
    public int getMin_salary() {
        return 0;
    }
    public int getMax_salary() {
        return 0;
    }
}
