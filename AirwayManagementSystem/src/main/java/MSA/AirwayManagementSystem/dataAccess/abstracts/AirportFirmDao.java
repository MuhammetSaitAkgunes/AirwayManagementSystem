package MSA.AirwayManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import MSA.AirwayManagementSystem.entities.concretes.AirportFirm;

public interface AirportFirmDao extends JpaRepository<AirportFirm, Integer>{

}
