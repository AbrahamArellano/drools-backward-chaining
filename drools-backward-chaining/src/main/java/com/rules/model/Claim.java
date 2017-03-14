package com.rules.model;

public class Claim {

	private String claimId;

	public String getClaimId() {
		return claimId;
	}

	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((claimId == null) ? 0 : claimId.hashCode());
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
		Claim other = (Claim) obj;
		if (claimId == null) {
			if (other.claimId != null)
				return false;
		} else if (!claimId.equals(other.claimId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Claim [id=" + claimId + "]";
	}
	
	
}
