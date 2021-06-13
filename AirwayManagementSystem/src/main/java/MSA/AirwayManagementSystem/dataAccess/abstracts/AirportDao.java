package MSA.AirwayManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import MSA.AirwayManagementSystem.entities.concretes.Airport;

public interface AirportDao extends JpaRepository<Airport, Integer>{

}
