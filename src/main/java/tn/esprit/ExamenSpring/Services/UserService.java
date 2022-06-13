package tn.esprit.ExamenSpring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ExamenSpring.Entities.User;
import tn.esprit.ExamenSpring.Repositories.UserRepository;

import java.util.List;
@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;



    @Override
    public List<User> addUser(User user) {
        userRepository.save(user);
        return this.getAllUser();
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int idUser) {
        return userRepository.findById(idUser).orElse(null);
    }

    @Override
    public void deleteUserById(int idUser) {
        userRepository.deleteById(idUser);
    }

    @Override
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    @Override
    public User updateUser(int iduser, User user) {
        User us=userRepository.findById(iduser).orElse(null);
        us.setEmail(user.getEmail());
        us.setPassword(user.getPassword());
        return userRepository.save(us);
    }
}
