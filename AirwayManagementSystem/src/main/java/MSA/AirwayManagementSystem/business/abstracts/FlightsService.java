package MSA.AirwayManagementSystem.business.abstracts;

import java.util.List;

import MSA.AirwayManagementSystem.core.utilities.results.DataResult;
import MSA.AirwayManagementSystem.core.utilities.results.Result;
import MSA.AirwayManagementSystem.entities.concretes.Flights;

public interface FlightsService {
	DataResult<List<Flights>> getAll();
	Result add(Flights flight);
	Result delete(Flights flight);
}
