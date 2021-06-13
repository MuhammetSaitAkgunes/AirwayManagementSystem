package MSA.AirwayManagementSystem.business.abstracts;

import java.util.List;

import MSA.AirwayManagementSystem.core.utilities.results.DataResult;
import MSA.AirwayManagementSystem.core.utilities.results.Result;
import MSA.AirwayManagementSystem.entities.concretes.Airport;

public interface AirportService {
	DataResult<List<Airport>> getAll();
	Result add(Airport airport);
	Result delete(Airport airport);
}
