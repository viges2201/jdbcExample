package dao;

import entity.Project;

import java.sql.SQLException;
import java.util.List;


public interface ProjectDAO {

    //create
    void add(Project project) throws SQLException;

    //read
    List<Project> getAll() throws SQLException;

    Project getById(Long id) throws SQLException;

    //update
    void update(Project project) throws SQLException;

    //delete
    void remove(Project project) throws SQLException;

}
