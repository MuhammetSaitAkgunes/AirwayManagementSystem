package MSA.AirwayManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import MSA.AirwayManagementSystem.entities.concretes.Users;

public interface UserDao extends JpaRepository<Users, Integer>{

}
