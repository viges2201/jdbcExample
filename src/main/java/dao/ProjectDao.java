package dao;

import entity.Project;

import java.util.List;

public interface ProjectDao {
    //create
    void add(Project project);

    //read
    List<Project> getAll();

    Project getById(long id);

    //update
    void update(Project project);

    //delete
    void remove(Project project);
}
