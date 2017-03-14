package com.rules.model;

import org.kie.api.definition.type.Position;

public class AssociatePersonClaim {

	@Position(0)
	private String mainCid;
	
	@Position(1)
	private String apcId;
	
	@Position(2)
	private int value;
	
	public AssociatePersonClaim(String mainCid, String apcId, int value) {
		super();
		this.apcId = apcId;
		this.mainCid = mainCid;
		this.value = value;
	}

	public String getApcId() {
		return apcId;
	}

	public void setApcId(String apcId) {
		this.apcId = apcId;
	}

	public String getMainCid() {
		return mainCid;
	}

	public void setMainCid(String mainCid) {
		this.mainCid = mainCid;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apcId == null) ? 0 : apcId.hashCode());
		result = prime * result + ((mainCid == null) ? 0 : mainCid.hashCode());
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AssociatePersonClaim other = (AssociatePersonClaim) obj;
		if (apcId == null) {
			if (other.apcId != null)
				return false;
		} else if (!apcId.equals(other.apcId))
			return false;
		if (mainCid == null) {
			if (other.mainCid != null)
				return false;
		} else if (!mainCid.equals(other.mainCid))
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AssociatePersonClaim [apcId=" + apcId + ", mainCid=" + mainCid + ", value=" + value + "]";
	}

	
}
