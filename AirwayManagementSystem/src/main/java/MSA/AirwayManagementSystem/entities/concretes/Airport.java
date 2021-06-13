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
@Table(name = "airport")
@AllArgsConstructor
@NoArgsConstructor
public class Airport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "id")
	@PrimaryKeyJoinColumn
	private int id;
	
	@Column(name = "name")
	private String airportName;
	
	//city_id
	@ManyToOne(targetEntity = City.class,fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "city_id")
	private City city;
	
	//airportfirms_id
	@ManyToOne(targetEntity = AirportFirm.class,fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "airportfirms_id")
	private AirportFirm airportFirm;
}
