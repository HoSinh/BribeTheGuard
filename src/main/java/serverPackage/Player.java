package serverPackage;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

																																																																																																																																																																																																																																																																																																																																																																																																					
@Entity
@Table(name="Player")
																																																								
public class Player 
{	
	@Id		
	@Column(name = "PlayerID")
	private Integer playerId;
																																																																																																																																																																																																																																																																																																																																																																																																						
	@Column(name = "Wins")																																																																																																																																																																																																																																																																																																																																																																																																						
	private Integer wins;																																																																																																																																																																																																																																																																																																																																																																																																					
																																																																																																																																																																																																																																																																																																																																																																																																						
	@Column(name = "Lost")																																																																																																																																																																																																																																																																																																																																																																																																						
	private Integer lost;																																																																																																																																																																																																																																																																																																																																																																																																						
																																																																																																																																																																																																																																																																																																																																																																																																						
	@Column(name = "Steps")																																																																																																																																																																																																																																																																																																																																																																																																						
	private Integer steps;																																																																																																																																																																																																																																																																																																																																																																																																						
																																																																																																																																																																																																																																																																																																																																																																																																						
	Player(){}																																																																																																																																																																																																																																																																																																																																																																																																						
																																																																																																																																																																																																																																																																																																																																																																																																						
	Player(Integer playerId, Integer wins, Integer lost, Integer Steps )																																																																																																																																																																																																																																																																																																																																																																																																						
	{
		init(playerId, wins, lost, steps);
	}
																																																																																																																																																																																																																																																																																																																																																																																																					
	private void init(Integer playerId, Integer wins, Integer lost, Integer steps)																																																																																																																																																																																																																																																																																																																																																																																																					
	{
		this.playerId = playerId;
		this.wins = wins;
		this.lost = lost;
		this.steps = steps;
	}
}																																																																																																																																																																																																																																																																																																																																																																																																					
