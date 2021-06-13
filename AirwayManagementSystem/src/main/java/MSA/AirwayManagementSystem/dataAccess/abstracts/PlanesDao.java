package MSA.AirwayManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import MSA.AirwayManagementSystem.entities.concretes.Planes;

public interface PlanesDao extends JpaRepository<Planes, Integer>{

}
