package com.gper.edu.pattern.task.simplefactory;

import com.gper.edu.pattern.task.ChineseCourse;
import com.gper.edu.pattern.task.EnglishCourse;
import com.gper.edu.pattern.task.ICourse;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(ChineseCourse.class);
        course.task();
        ICourse course1 = factory.create(EnglishCourse.class);
        course1.task();
    }
}
