package hero;

import java.util.ArrayList;

import ability.SuperPower;
import lombok.Data;
@Data
public class Hero {
	
	private String name;
	private int ability;
	private String feature;
	private String hitterDisplay = " 타석에 들어섭니다";
	private String pitcherDisplay = " 마운드에 들어섭니다";
	private ArrayList<SuperPower> superPowers;
	
	public Hero(String name, int ability, String feature, ArrayList<SuperPower> superPowers) {
		this.name = name;
		this.ability = ability;
		this.feature = feature;
		this.superPowers = superPowers;
	}
	
	public void mySuperPowers() {
		for(SuperPower i: superPowers) {
			i.ability();
		}
	}
}
