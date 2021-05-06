package com.mega.mvc40;

//데이터 전달용 가방역할 클래스
public class ComputerVO {
	private String cname;
	private int ccash;
	private String mname;
	private int mcash;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCcash() {
		return ccash;
	}
	public void setCcash(int ccash) {
		this.ccash = ccash;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMcash() {
		return mcash;
	}
	public void setMcash(int mcash) {
		this.mcash = mcash;
	}
	
	public int getScash() {
		return ccash + mcash;
	}	
}
