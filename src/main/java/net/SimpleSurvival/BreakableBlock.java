package net.SimpleSurvival;

import java.util.ArrayList;
import org.bukkit.Material;

public class BreakableBlock {
	ArrayList<Material> breakableList;

	public BreakableBlock(ArrayList<Material> breakableMaterials) {
		breakableList = new ArrayList<Material>(breakableMaterials);
	}

	public boolean isBreakable(Material blockMaterial) {
		boolean allowable = false;

		for(Material material: breakableList) {
			if(blockMaterial == material) {
				allowable = true;
				break;
			}
		}
		return allowable;
	}
}	
