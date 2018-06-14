package dao;

import entity.Address;

import java.util.List;

public interface AddressDao {
    //create
    void add(Address address);

    //read
    List<Address> getAll();

    Address getById(long id);

    //update
    void update(Address address);

    //delete
    void remove(Address address);
}
