package MSA.AirwayManagementSystem.business.abstracts;

import java.util.List;

import MSA.AirwayManagementSystem.core.utilities.results.DataResult;
import MSA.AirwayManagementSystem.core.utilities.results.Result;
import MSA.AirwayManagementSystem.entities.concretes.Ticket;

public interface TicketService {
	DataResult<List<Ticket>> getAll();
	Result add(Ticket ticket);
	Result delete(Ticket ticket);
}
