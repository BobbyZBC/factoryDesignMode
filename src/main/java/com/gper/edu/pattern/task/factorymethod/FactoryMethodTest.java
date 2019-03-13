package com.gper.edu.pattern.task.factorymethod;

import com.gper.edu.pattern.task.ICourse;

public class FactoryMethodTest {
    public static void main(String[] args) {
       ICourseFactory chineseFactory = new ChineseCourseFactory();
        ICourse iCourse = chineseFactory.create();
        iCourse.task();

       ICourseFactory englishFactory = new EnglishCourseFactory();
        ICourse iCourse1 = englishFactory.create();
        iCourse1.task();
    }
}
