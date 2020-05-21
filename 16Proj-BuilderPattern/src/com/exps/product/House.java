package com.exps.product;

import com.exps.foundation.Foundation;
import com.exps.interior.Interior;
import com.exps.roofing.Roofing;
import com.exps.structure.Structure;

//product class
public class House {
	private Foundation foundation;
	private Structure structure;
	private Roofing roofing;
	private Interior interior;

	public Interior getInterior() {
		return interior;
	}

	public void setInterior(Interior interior) {
		this.interior = interior;
	}

	public Foundation getFoundation() {
		return foundation;
	}

	public void setFoundation(Foundation foundation) {
		this.foundation = foundation;
	}

	public Structure getStructure() {
		return structure;
	}

	public void setStructure(Structure structure) {
		this.structure = structure;
	}

	public Roofing getRoofing() {
		return roofing;
	}

	public void setRoofing(Roofing roofing) {
		this.roofing = roofing;
	}

	@Override
	public String toString() {
		return "House [foundation=" + foundation + ", structure=" + structure + ", roofing=" + roofing + ", interior="
				+ interior + "]";
	}

}
