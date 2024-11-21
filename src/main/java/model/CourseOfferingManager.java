package model;

import java.util.ArrayList;
import java.util.List;


/**
 * The CourseOfferingManager is the central entry point for you to get the list of course offerings.
 * It is implemented as a Singleton so you can get the single instance of CourseOfferingManager from every point in your application.
 */
public class CourseOfferingManager {

    private final List<CourseOffering> courseList;
    private static CourseOfferingManager comInstance;

    public List<CourseOffering> getCourseList() {
        return this.courseList;
    }

    private CourseOfferingManager() {
        this.courseList = new ArrayList<CourseOffering>();
    }

    public static CourseOfferingManager getInstance() {
        if (comInstance == null) {
            comInstance = new CourseOfferingManager();
        }
        return comInstance;
    }

}
