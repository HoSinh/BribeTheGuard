package serverPackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name = "GameHistory")

public class GameHistory
{
	@Id
	@Column(name = "GameHistoryId")
	private Integer GameHistoryId;
	
	@Column(name = "PlayerId")
	private Integer PlayerId;
	
	@Column(name = "Position")
	private String Position;
	
	@Column(name = "State")
	private String State;
	
	@Column(name = "Steps")
	private Integer Steps;
	
	@Column(name = "PlayDate")
	private Date PlayDate;
	
	@OneToMany(mappedBy = "PlayerID", cascade = CascadeType.ALL)
	private List<Player> occupants = new ArrayList<Player>();
	
	GameHistory(){}
	
	GameHistory(Integer gameHistoryId, Integer playerId, String position, String state, Integer steps, Date playDate)
	{
		init(gameHistoryId, playerId, position, state, steps, playDate);
	}
	
	private void init(Integer gameHistoryId, Integer playerId, String position, String state, Integer steps, Date playDate)
	{
		this.GameHistoryId = gameHistoryId;
		this.PlayerId = playerId;
		this.Position = position;
		this.State = state;
		this.Steps = steps;
		this.PlayDate = playDate;
	}
}

