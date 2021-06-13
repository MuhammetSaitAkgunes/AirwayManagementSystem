package MSA.AirwayManagementSystem.business.abstracts;

import java.util.List;

import MSA.AirwayManagementSystem.core.utilities.results.DataResult;
import MSA.AirwayManagementSystem.core.utilities.results.Result;
import MSA.AirwayManagementSystem.entities.concretes.Planes;

public interface PlanesService {
	DataResult<List<Planes>> getAll();
	Result add(Planes plane);
	Result delete(Planes plane);
}
