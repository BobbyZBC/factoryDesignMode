package com.gper.edu.pattern.task.factorymethod;

import com.gper.edu.pattern.task.ChineseCourse;
import com.gper.edu.pattern.task.ICourse;

public class ChineseCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new ChineseCourse();
    }
}
