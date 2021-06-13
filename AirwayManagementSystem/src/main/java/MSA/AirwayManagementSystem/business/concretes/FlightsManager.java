package MSA.AirwayManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MSA.AirwayManagementSystem.business.abstracts.FlightsService;
import MSA.AirwayManagementSystem.core.utilities.results.DataResult;
import MSA.AirwayManagementSystem.core.utilities.results.Result;
import MSA.AirwayManagementSystem.core.utilities.results.SuccessDataResult;
import MSA.AirwayManagementSystem.dataAccess.abstracts.FlightsDao;
import MSA.AirwayManagementSystem.entities.concretes.Flights;

@Service
public class FlightsManager implements FlightsService{
	
	private FlightsDao flightsDao;
	
	@Autowired
	public FlightsManager(FlightsDao flightsDao) {
		this.flightsDao = flightsDao;
	}

	@Override
	public DataResult<List<Flights>> getAll() {
		return new SuccessDataResult<List<Flights>>(this.flightsDao.findAll(),"Uçuşlar listelendi.");
	}

	@Override
	public Result add(Flights flight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(Flights flight) {
		// TODO Auto-generated method stub
		return null;
	}

}
