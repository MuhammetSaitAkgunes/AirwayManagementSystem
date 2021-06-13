package MSA.AirwayManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MSA.AirwayManagementSystem.business.abstracts.AirportFirmService;
import MSA.AirwayManagementSystem.core.utilities.results.DataResult;
import MSA.AirwayManagementSystem.core.utilities.results.Result;
import MSA.AirwayManagementSystem.entities.concretes.AirportFirm;

@RestController
@RequestMapping("/api/airportfirm")
public class AirportFirmController {
	private AirportFirmService airportFirmService;
	
	@Autowired
	public AirportFirmController(AirportFirmService airportFirmService) {
		this.airportFirmService = airportFirmService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<AirportFirm>> getAll(){
		return this.airportFirmService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody AirportFirm airportFirm) {
		return this.airportFirmService.add(airportFirm);
	}
}
