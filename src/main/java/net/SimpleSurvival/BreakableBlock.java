package net.SimpleSurvival

public class BreakableBlock {
	ArrayList<String> breakableList;

	public BreakableBlock(ArrayList<String> breakableMaterials) {
		breakableList = new ArrayList<String>(breakableMaterials)
	}

	public boolean isBreakable(Material blockMaterial) {
		boolean allowable = false;

		for(String material: breakableBlocks) {
			if(blockMaterial == mat) {
				allowable = true;
			}
		}
	}
}	
