package com.nt.entity;

public class CovidEntity {
	
	private Integer sid;
	private String name;
	private Long totalCases;
	private Long activCases;
	private Long deathCases;
	private Long releaseCases;
	
	public CovidEntity() {
	
	}

	public Integer getSid() {
		return sid;
	}

	public String getName() {
		return name;
	}

	public Long getTotalCases() {
		return totalCases;
	}

	public Long getActivCases() {
		return activCases;
	}

	public Long getDeathCases() {
		return deathCases;
	}

	public Long getReleaseCases() {
		return releaseCases;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTotalCases(Long totalCases) {
		this.totalCases = totalCases;
	}

	public void setActivCases(Long activCases) {
		this.activCases = activCases;
	}

	public void setDeathCases(Long deathCases) {
		this.deathCases = deathCases;
	}

	public void setReleaseCases(Long releaseCases) {
		this.releaseCases = releaseCases;
	}

	@Override
	public String toString() {
		return "CovidEntity [sid=" + sid + ", name=" + name + ", totalCases=" + totalCases + ", activCases="
				+ activCases + ", deathCases=" + deathCases + ", releaseCases=" + releaseCases + "]";
	}
	

	
	
	
	
	

	
	

}
