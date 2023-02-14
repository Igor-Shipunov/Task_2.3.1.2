package Kata.Task_2312.dao;

import Kata.Task_2312.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Integer> {

}
