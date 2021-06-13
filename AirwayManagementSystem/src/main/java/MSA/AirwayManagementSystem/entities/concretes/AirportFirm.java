package MSA.AirwayManagementSystem.entities.concretes;

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
@Table(name = "airport_firm")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","flight","ticket","airport"})
public class AirportFirm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	@PrimaryKeyJoinColumn
	private int id;
	
	@Column(name = "firm_name")
	private String firmName;
	
	
	@ManyToOne(targetEntity = Planes.class,fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "planes_id")
	private Planes plane;
	
	@ManyToOne(targetEntity = Flights.class,fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "flights_id")
	private Flights flight;
	
	@JsonIgnore
	@OneToMany(mappedBy = "airportFirm")
	private List<Flights> flights;
	
	@JsonIgnore
	@OneToMany(mappedBy = "airportFirm")
	private List<Ticket> tickets;
	
	@JsonIgnore
	@OneToMany(mappedBy = "airportFirm")
	private List<Airport> airports;
}
