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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "planes")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","planes"})
public class Planes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "id")
	@PrimaryKeyJoinColumn
	private int id;
	
	@Column(name = "plane_name")
	private String planeName;
	
	@Column(name = "plane_type")
	private String planeType;
	
	@JsonIgnore
	@OneToMany(mappedBy = "plane")
	private List<AirportFirm> airportfirms;
}
