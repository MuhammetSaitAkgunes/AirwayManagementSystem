package MSA.AirwayManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MSA.AirwayManagementSystem.business.abstracts.FlightsService;
import MSA.AirwayManagementSystem.core.utilities.results.DataResult;
import MSA.AirwayManagementSystem.entities.concretes.Flights;

@RestController
@RequestMapping("/api/flights")
public class FlightsController {
	
	private FlightsService flightsService;
	
	@Autowired
	public FlightsController(FlightsService flightsService) {
		this.flightsService = flightsService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Flights>> getAll(){
		return this.flightsService.getAll();
	}

}
