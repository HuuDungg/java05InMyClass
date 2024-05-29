package com.example.lab01.buoi04.service;

import com.example.lab01.buoi04.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> list = new ArrayList<>();

    public StudentService() {
        list.add(new Student("1v", "Tran Huu Dung", 12, "Thach b", true ));
        list.add(new Student("2v", "Tran Huu 1", 12, "Thach f", false ));
        list.add(new Student("3v", "Tran Huu 2", 12, "Thach d", true ));
        list.add(new Student("4v", "Tran Huu 3", 12, "Thach s", false ));
    }

    public List<Student> getAll()
    {
        return list;
    }

    public Student findById(String id){
        for (Student student: list) {
            if (student.getId().equalsIgnoreCase(id)) {
                return student;
            }

        }
        return null;
    }

    public void Create(Student student){
        list.add(student);
    }

    public void update (Student student){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(student.getId())) {
                list.set(i, student);
            }

        }
    }

    public void delete(String id){
        List<Student> delList = new ArrayList<>();
        for (Student st: list) {
            if (id.equalsIgnoreCase(st.getId())) {
                delList.add(st);
            }
        }
        list.removeAll(delList);
    }


}
