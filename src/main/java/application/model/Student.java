package application.model;

import org.neo4j.ogm.annotation.*;

import java.util.HashSet;
import java.util.Set;

@NodeEntity(label = "Student")
public class Student extends UserTemp{

    @Relationship(type = "STUDY_IN")
    private Set<Course> courses;

    public Set<Course> getCourses() {
        return courses;
    }

    public void studyIn(Course course) {
        if (courses == null) {
            courses = new HashSet<>();
        }
        courses.add(course);
    }

    @Relationship(type = "WRITE")
    private Set<Note> notes;


    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }
    public void write(Note note) {
        if (notes == null) {
            notes = new HashSet<>();
        }
        notes.add(note);
    }
}
