package MSA.AirwayManagementSystem.business.abstracts;

import java.util.List;

import MSA.AirwayManagementSystem.core.utilities.results.DataResult;
import MSA.AirwayManagementSystem.core.utilities.results.Result;
import MSA.AirwayManagementSystem.entities.concretes.AirportFirm;

public interface AirportFirmService {
	DataResult<List<AirportFirm>> getAll();
	Result add(AirportFirm airportFirm);
	Result delete(AirportFirm airportFirm);
}
