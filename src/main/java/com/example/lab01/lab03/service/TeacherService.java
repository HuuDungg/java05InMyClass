package com.example.lab01.lab03.service;

import com.example.lab01.lab03.entity.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> list = new ArrayList<>();

    public TeacherService() {
        list.add(new Teacher("1", "T001", "Nguyen Van A", 40, true, "Hanoi"));
        list.add(new Teacher("2", "T002", "Tran Thi B", 35, false, "Hanoi"));
        list.add(new Teacher("3", "T003", "Le Van C", 50, true, "Hanoi"));
        list.add(new Teacher("4", "T004", "Pham Thi D", 45, false, "Hanoi"));
    }

    public List<Teacher> getAll() {
        return list;
    }

    public Teacher findById(String id) {
        for (Teacher teacher : list) {
            if (teacher.getId().equalsIgnoreCase(id)) {
                return teacher;
            }
        }
        return null;
    }

    public List<Teacher> getAllFemaleTeachers(){
        List<Teacher> result = new ArrayList<>();
        for (Teacher teacher : list) {
            if (!teacher.isFemale()) {
                result.add(teacher);
            }
        }
        return result;
    }

    public List<Teacher> getTeacherByName(String name) {
        List<Teacher> result = new ArrayList<>();
        for (Teacher teacher : list) {
            if (teacher.getName().equalsIgnoreCase(name)) {
                result.add(teacher);
            }
        }
        return result;
    }

    public void create(Teacher teacher) {
        list.add(teacher);
    }

    public void update(Teacher teacher) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(teacher.getId())) {
                list.set(i, teacher);
            }
        }
    }

    public void delete(String id) {
        list.removeIf(teacher -> teacher.getId().equalsIgnoreCase(id));
    }

}
