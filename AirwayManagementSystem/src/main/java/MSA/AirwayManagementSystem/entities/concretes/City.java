package MSA.AirwayManagementSystem.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "cities")
@NoArgsConstructor
@AllArgsConstructor@JsonIgnoreProperties({"hibernateLazyInitializer","handler","flight,airport"})
public class City {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "id")
	@PrimaryKeyJoinColumn
	private int id;
	
	@Column(name = "city_name")
	private String city_name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "city")
	private List<Flights> flight;
	
	@JsonIgnore
	@OneToMany(mappedBy = "city2")
	private List<Flights> flight2;
	
	@JsonIgnore
	@OneToMany(mappedBy = "city")
	private List<Airport> airports;
	
	
	
}
