package MSA.AirwayManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MSA.AirwayManagementSystem.business.abstracts.AirportFirmService;
import MSA.AirwayManagementSystem.core.utilities.results.DataResult;
import MSA.AirwayManagementSystem.core.utilities.results.Result;
import MSA.AirwayManagementSystem.core.utilities.results.SuccessDataResult;
import MSA.AirwayManagementSystem.core.utilities.results.SuccessResult;
import MSA.AirwayManagementSystem.dataAccess.abstracts.AirportFirmDao;
import MSA.AirwayManagementSystem.entities.concretes.AirportFirm;

@Service
public class AirportFirmManager implements AirportFirmService {
	
	private AirportFirmDao airportFirmDao;
	
	@Autowired
	public AirportFirmManager(AirportFirmDao airportFirmDao) {
		this.airportFirmDao =  airportFirmDao;
	}

	@Override
	public DataResult<List<AirportFirm>> getAll() {
		return new SuccessDataResult<List<AirportFirm>>(this.airportFirmDao.findAll(),"Havalimanı firmaları listelendi");
	}

	@Override
	public Result add(AirportFirm airportFirm) {
		this.airportFirmDao.save(airportFirm);
		return new SuccessResult("Havalimanı firması eklendi.");
	}

	@Override
	public Result delete(AirportFirm airportFirm) {
		this.airportFirmDao.delete(airportFirm);
		return new SuccessResult("Havalimanı firması silindi");
	}

}
