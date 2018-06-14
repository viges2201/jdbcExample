package dao;

import entity.EmplProj;

import java.util.List;

public interface EmplProjDao {
    //create
    void add(EmplProj emplProj);

    //read
    List<EmplProj> getAll();

    EmplProj getByEmplIDAndProjID(long employeeId, long projectId);

    //update
    void update(EmplProj emplProj);

    //delete
    void remove(EmplProj emplProj);
}
