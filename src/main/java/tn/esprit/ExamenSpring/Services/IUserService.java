package tn.esprit.ExamenSpring.Services;

import tn.esprit.ExamenSpring.Entities.User;

import java.util.List;

public interface IUserService {
    public List<User> addUser(User user);

    public List<User> getAllUser();

    public User getUserById(int idUser);

    public void deleteUserById(int idUser);

    public void deleteAllUsers();

    public User updateUser(int iduser,User user);
}
