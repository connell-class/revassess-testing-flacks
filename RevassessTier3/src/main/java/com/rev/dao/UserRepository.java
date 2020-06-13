package com.rev.dao;

import com.rev.model.User;

import java.util.Set;

public class UserRepository implements CrudRepository {
    @Override
    public User save(Object user) {
        return null;
    }

    @Override
    public Set<User> findAll() {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    public User findUserByUsername(String username) {
        return null;
    }

    public User findUserByCredentials(String username, String pw) {
        return null;
    }

    @Override
    public boolean update(Object user) {
        return false;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }
}