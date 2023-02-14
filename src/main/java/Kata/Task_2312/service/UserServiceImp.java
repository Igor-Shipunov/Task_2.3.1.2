package Kata.Task_2312.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import Kata.Task_2312.dao.UserDao;
import Kata.Task_2312.model.User;

import java.util.List;


@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {


    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    @Transactional
    public void createNewUser(User user) {
        userDao.saveAndFlush(user);
    }

    @Override
    public List<User> getAllUsers() {return userDao.findAll();}

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.saveAndFlush(user);
    }

    @Override
    @Transactional
    public void deleteUser(User user) {
        userDao.delete(user);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getReferenceById(id);
    }
}
