package com.canvass.canvassClone.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Assignments {
    public int id;
    public String Name;
    public String question1;
    public String answer1;
    public String question2;
    public String answer2;

    @Override
    public String toString() {
        return "Assignments{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", question1='" + question1 + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", question2='" + question2 + '\'' +
                ", answer2='" + answer2 + '\'' +
                '}';
    }
}
