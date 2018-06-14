package service;

import bl.Util;
import dao.AddressDao;
import entity.Address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class AddressService extends Util implements AddressDao {

    //create connection
    Connection connection = getConnection();

    @Override
    public void add(Address address) {
        PreparedStatement preparedStatement = null;

        String sql = "ISERT INTO ADDRESS (ID, COUNTRY, CITY, STREET, POST_CODE) VALUES (?, ?, ?, ?, ?)";
    }

    @Override
    public List<Address> getAll() {
        return null;
    }

    @Override
    public Address getById(long id) {
        return null;
    }

    @Override
    public void update(Address address) {

    }

    @Override
    public void remove(Address address) {

    }
}
