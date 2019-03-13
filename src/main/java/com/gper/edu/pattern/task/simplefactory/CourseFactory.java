package com.gper.edu.pattern.task.simplefactory;

import com.gper.edu.pattern.task.ICourse;

public class CourseFactory {

    ICourse create(Class<? extends ICourse> clazz){

        try {
            if(null != clazz) {
                return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
