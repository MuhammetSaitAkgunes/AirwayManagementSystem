package MSA.AirwayManagementSystem.business.abstracts;

import java.util.List;

import MSA.AirwayManagementSystem.core.utilities.results.DataResult;
import MSA.AirwayManagementSystem.core.utilities.results.Result;
import MSA.AirwayManagementSystem.entities.concretes.Users;

public interface UserService {
	DataResult<List<Users>> getAll();
	Result add(Users user);
	Result delete(Users user);
}
