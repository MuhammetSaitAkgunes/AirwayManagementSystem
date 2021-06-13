package MSA.AirwayManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import MSA.AirwayManagementSystem.entities.concretes.Ticket;

public interface TicketDao extends JpaRepository<Ticket, Integer>{

}
