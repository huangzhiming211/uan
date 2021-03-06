/**  
 * Title: TradePojo.java
 * Description: TradePojo
 * Copyright Agriculture Bank of China
 * @author Bo Liu
 * @date 2018-09-20
 * @version 1.0
 */ 
package com.abc.uan.blockchain;

/**
 * Title: TradePojo
 * @Description: TradePojo
 * @author Bo Liu
 * @date 2018-09-20
 */
public class TradePojo extends AbstractBlockChainPojo {

	private static final long serialVersionUID = 465073818860060640L;

	private String customer = "None";
	private String cardNum = "None";
	private String party = "None";
	private Double amt = -99D;

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public Double getAmt() {
		return amt;
	}

	public void setAmt(Double amt) {
		this.amt = amt;
	}

	public String getAccount() {
		return "resource:org.acme.mynetwork.CardAccount#" + cardNum;
	}

	public void setAccount(String account) {

	}

}
