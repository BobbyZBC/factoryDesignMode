package com.gper.edu.pattern.task.factorymethod;

import com.gper.edu.pattern.task.EnglishCourse;
import com.gper.edu.pattern.task.ICourse;

public class EnglishCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new EnglishCourse();
    }
}
