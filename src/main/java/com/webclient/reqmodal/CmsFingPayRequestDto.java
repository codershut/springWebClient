package com.webclient.reqmodal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CmsFingPayRequestDto {
	
	  @JsonProperty(value = "zoneName")
	    private String zoneName;

	    @JsonProperty(value = "state")
	    private String state;

	    @JsonProperty(value = "agentId")
	    private String agentId;

	    @JsonProperty(value = "empId")
	    private String empId;

	    @JsonProperty(value = "agentCategory")
	    private String agentCategory;

	    @JsonProperty(value = "agentMob")
	    private String agentMob;

	    @JsonProperty(value = "serviceId")
	    private String serviceId;

	    @JsonProperty(value = "activeStatus")
	    private String activeStatus;

	    @JsonProperty(value = "billerName")
	    private String billerName;

	    @JsonProperty(value = "depositorType")
	    private String depositorType;

	    @JsonProperty(value = "depositerMobile")
	    private String depositerMobile;

	    @JsonProperty(value = "partnerId")
	    private String partnerId;

	    @JsonProperty(value = "partnerTxnId")
	    private String partnerTxnId;

	    @JsonProperty(value = "date")
	    private String date;


	    @JsonProperty(value = "transactionAmount")
	    private String transactionAmount;

	    @JsonProperty(value = "localIp")
	    private String localIp;

	    @JsonProperty(value = "longitude")
	    private String longitude;

	    @JsonProperty(value = "latitude")
	    private String latitude;
	    
	    private String billerId;
	    
	    @JsonIgnore
	    private String urn;
	    @JsonIgnore
	    private String mid;
	    @JsonIgnore
	    private String smid;

	    private String actorId;
	    
	    private String fpTransactionId;
	    

	    public String getZoneName() {
			return zoneName;
		}



		public void setZoneName(String zoneName) {
			this.zoneName = zoneName;
		}



		public String getState() {
			return state;
		}



		public void setState(String state) {
			this.state = state;
		}



		public String getAgentId() {
			return agentId;
		}



		public void setAgentId(String agentId) {
			this.agentId = agentId;
		}



		public String getEmpId() {
			return empId;
		}



		public void setEmpId(String empId) {
			this.empId = empId;
		}



		public String getAgentCategory() {
			return agentCategory;
		}



		public void setAgentCategory(String agentCategory) {
			this.agentCategory = agentCategory;
		}



		public String getAgentMob() {
			return agentMob;
		}



		public void setAgentMob(String agentMob) {
			this.agentMob = agentMob;
		}



		public String getServiceId() {
			return serviceId;
		}



		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}



		public String getActiveStatus() {
			return activeStatus;
		}



		public void setActiveStatus(String activeStatus) {
			this.activeStatus = activeStatus;
		}



		public String getBillerName() {
			return billerName;
		}



		public void setBillerName(String billerName) {
			this.billerName = billerName;
		}



		public String getDepositorType() {
			return depositorType;
		}



		public void setDepositorType(String depositorType) {
			this.depositorType = depositorType;
		}



		public String getDepositerMobile() {
			return depositerMobile;
		}



		public void setDepositerMobile(String depositerMobile) {
			this.depositerMobile = depositerMobile;
		}



		public String getPartnerId() {
			return partnerId;
		}



		public void setPartnerId(String partnerId) {
			this.partnerId = partnerId;
		}



		public String getPartnerTxnId() {
			return partnerTxnId;
		}



		public void setPartnerTxnId(String partnerTxnId) {
			this.partnerTxnId = partnerTxnId;
		}



		public String getDate() {
			return date;
		}



		public void setDate(String date) {
			this.date = date;
		}



		public String getTransactionAmount() {
			return transactionAmount;
		}



		public void setTransactionAmount(String transactionAmount) {
			this.transactionAmount = transactionAmount;
		}



		public String getLocalIp() {
			return localIp;
		}



		public void setLocalIp(String localIp) {
			this.localIp = localIp;
		}



		public String getLongitude() {
			return longitude;
		}



		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}



		public String getLatitude() {
			return latitude;
		}



		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}



		public String getUrn() {
			return urn;
		}



		public void setUrn(String urn) {
			this.urn = urn;
		}



		public String getMid() {
			return mid;
		}



		public void setMid(String mid) {
			this.mid = mid;
		}



		public String getSmid() {
			return smid;
		}



		public void setSmid(String smid) {
			this.smid = smid;
		}



		
		public String getBillerId() {
			return billerId;
		}



		public void setBillerId(String billerId) {
			this.billerId = billerId;
		}






		public String getActorId() {
			return actorId;
		}



		public void setActorId(String actorId) {
			this.actorId = actorId;
		}



		public void setHeaderparameters(String urn, String mid, String smid) {
	    	this.setUrn(urn);
	    	this.setMid(mid);
	    	this.setSmid(smid);
	    }



		public String getFpTransactionId() {
			return fpTransactionId;
		}



		public void setFpTransactionId(String fpTransactionId) {
			this.fpTransactionId = fpTransactionId;
		}



		@Override
		public String toString() {
			return "CmsFingPayRequestDto [zoneName=" + zoneName + ", state=" + state + ", agentId=" + agentId + ", empId="
					+ empId + ", agentCategory=" + agentCategory + ", agentMob=" + agentMob + ", serviceId=" + serviceId
					+ ", activeStatus=" + activeStatus + ", billerName=" + billerName + ", depositorType=" + depositorType
					+ ", depositerMobile=" + depositerMobile + ", partnerId=" + partnerId + ", partnerTxnId=" + partnerTxnId
					+ ", date=" + date + ", transactionAmount=" + transactionAmount + ", localIp=" + localIp
					+ ", longitude=" + longitude + ", latitude=" + latitude + ", billerId=" + billerId + ", urn=" + urn
					+ ", mid=" + mid + ", smid=" + smid + ", actorId=" + actorId + ", fpTransactionId=" + fpTransactionId
					+ "]";
		}

}
