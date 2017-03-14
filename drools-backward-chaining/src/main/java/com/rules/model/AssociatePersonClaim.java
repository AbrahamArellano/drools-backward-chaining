package com.rules.model;

public class AssociatePersonClaim {

	private String apcId;
	
	private String privateId;
	
	private int value;

	public String getApcId() {
		return apcId;
	}

	public void setApcId(String apcId) {
		this.apcId = apcId;
	}

	public String getPrivateId() {
		return privateId;
	}

	public void setPrivateId(String privateId) {
		this.privateId = privateId;
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
		result = prime * result + ((privateId == null) ? 0 : privateId.hashCode());
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
		if (privateId == null) {
			if (other.privateId != null)
				return false;
		} else if (!privateId.equals(other.privateId))
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AssociatePersonClaim [apcId=" + apcId + ", privateId=" + privateId + ", value=" + value + "]";
	}

	
}
