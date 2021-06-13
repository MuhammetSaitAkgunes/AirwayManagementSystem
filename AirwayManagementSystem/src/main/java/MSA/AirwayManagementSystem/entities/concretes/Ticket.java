package MSA.AirwayManagementSystem.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	@PrimaryKeyJoinColumn
	private int id;
	
	@Column(name = "ticket_price")
	private int ticketPrice;
	
	//passenger_id
	@ManyToOne()
	@JoinColumn(name = "passenger_id")
	private Users user;
	
	//airport_firm_id
	@ManyToOne()
	@JoinColumn(name = "airport_firm_id")
	private AirportFirm airportFirm;
	
	//flight_id
	@ManyToOne()
	@JoinColumn(name = "flight_id")
	private Flights flight;
}
