package MSA.AirwayManagementSystem.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "flight")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","ticket","airport_firms"})
public class Flights {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	@PrimaryKeyJoinColumn
	private int id;
	
	@Column(name = "flight_date")
	private Date flightDate;
	
	@Column(name = "flight_time")
	private Date flightTime;

	//airport_firm_id
	@ManyToOne(targetEntity = AirportFirm.class,fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "airport_firm_id")
	private AirportFirm airportFirm;
	
	//destination_city_id
	@ManyToOne(targetEntity = City.class,fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "destination_city_id")
	private City city;
	
	//exit_city_id
	@ManyToOne(targetEntity = City.class,fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "exit_city_id")
	private City city2;
	
	@JsonIgnore
	@OneToMany(mappedBy = "flight")
	private List<Ticket> tickets;
	
	@JsonIgnore
	@OneToMany(mappedBy = "flight")
	private List<AirportFirm> airportFirms;
}
