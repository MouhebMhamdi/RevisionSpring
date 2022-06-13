package tn.esprit.ExamenSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ExamenSpring.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
