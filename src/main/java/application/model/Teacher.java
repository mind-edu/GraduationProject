package application.model;

import org.neo4j.ogm.annotation.*;

import java.util.HashSet;
import java.util.Set;

@NodeEntity(label = "Teacher")
public class Teacher extends UserTemp{

    @Relationship(type = "TEACH_IN", direction = Relationship.UNDIRECTED)
    private Set<Course> courses;

    public Set<Course> getCourses() {
        return courses;
    }

    public void teachIn(Course course) {
        if (courses == null) {
            courses = new HashSet<>();
        }
        courses.add(course);
    }

}
