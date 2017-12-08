package serverPackage;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Table;
 

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name="Map")

public class Map
{
	@Id
	@Column(name = "MapID")
	private Integer MapId;
	
	@Column(name = "PlayerID")
	private Integer PlayerId;
	
	@Column(name = "StepsOnWater")
	private Integer StepsOnWater;
	
	@Column(name = "StepsOnGrass")
	private Integer StepsOnGrass;
	
	@Column(name = "StepsOnMountain")
	private Integer StepsOnMountain;
	
	@Column(name = "OutOfMap")
	private Integer OutOfMap;
	
	@OneToMany(mappedBy = "PlayerID", cascade = CascadeType.ALL)
	private List<Player> occupants = new ArrayList<Player>();
	
	Map(){}
	
	Map(Integer mapId, Integer playerId, Integer stepsOnWater, Integer stepsOnGrass, Integer stepsOnMountain, Integer outOfMap )
	{
		init(mapId, playerId, stepsOnWater, stepsOnGrass, stepsOnMountain, outOfMap);
	}
	
	private void init(Integer mapId, Integer playerId, Integer stepsOnWater, Integer stepsOnGrass, Integer stepsOnMountain, Integer outOfMap)
	{
		this.MapId = mapId;
		this.PlayerId = playerId;
		this.StepsOnWater = stepsOnWater;
		this.StepsOnGrass = stepsOnGrass;
		this.StepsOnMountain = stepsOnMountain;
		this.OutOfMap = outOfMap;
	}
}
