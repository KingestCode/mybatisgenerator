package com.mybatis.entity;


import java.util.List;

public class GradeWithStudents {
    private Integer id;

    private String gradename;

    private List<Student1> students;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGradename() {
        return gradename;
    }

    public void setGradename(String gradename) {
        this.gradename = gradename;
    }

    public List<Student1> getStudents() {
        return students;
    }

    public void setStudents(List<Student1> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "GradeWithStudents{" +
                "id=" + id +
                ", gradename='" + gradename + '\'' +
                ", students=" + students +
                '}';
    }
}
