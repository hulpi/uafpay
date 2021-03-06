package com.uaf.pay.model;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {
    private Long upTransactionOid;

    private Long upSysRegisterOid;

    private String ufAppLedgSeqId;

    private String ufSendBatchId;

    private String ufAppCode;

	private String ufCityCode;

    private Long upAgentPayOid;

    private String payType;

    private Long upMerchantOid;

    private String referenceNo;

    private String accountNo;

    private String accountName;
    
    private String accountCertType;

    private String bankCode;

    private String bankName;

    private String bankProvince;

    private String bankCity;

    private String settleType;

    private BigDecimal amount;

    private String currency;

    private Date expectSettleDate;

    private Date actualSettleDate;

    private String status;

    private int versionNo;

    private String remark;

    private Date createDate;

    public Long getUpTransactionOid() {
        return upTransactionOid;
    }

    public String getUfAppLedgSeqId() {
		return ufAppLedgSeqId;
	}

	public void setUfAppLedgSeqId(String ufAppLedgSeqId) {
		this.ufAppLedgSeqId = ufAppLedgSeqId;
	}

	public String getUfSendBatchId() {
		return ufSendBatchId;
	}

	public void setUfSendBatchId(String ufSendBatchId) {
		this.ufSendBatchId = ufSendBatchId;
	}

	public void setUpTransactionOid(Long upTransactionOid) {
        this.upTransactionOid = upTransactionOid;
    }

    public Long getUpMerchantOid() {
        return upMerchantOid;
    }

    public void setUpMerchantOid(Long upMerchantOid) {
        this.upMerchantOid = upMerchantOid;
    }

    public String getUfAppCode() {
        return ufAppCode;
    }

    public void setUfAppCode(String ufAppCode) {
        this.ufAppCode = ufAppCode == null ? null : ufAppCode.trim();
    }

    public String getUfCityCode() {
        return ufCityCode;
    }

    public void setUfCityCode(String ufCityCode) {
        this.ufCityCode = ufCityCode == null ? null : ufCityCode.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo == null ? null : referenceNo.trim();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAccountCertType() {
		return accountCertType;
	}

	public void setAccountCertType(String accountCertType) {
		this.accountCertType = accountCertType;
	}

	public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankProvince() {
        return bankProvince;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince == null ? null : bankProvince.trim();
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity == null ? null : bankCity.trim();
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType == null ? null : settleType.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Date getExpectSettleDate() {
		return expectSettleDate;
	}

	public void setExpectSettleDate(Date expectSettleDate) {
		this.expectSettleDate = expectSettleDate;
	}

	public Date getActualSettleDate() {
		return actualSettleDate;
	}

	public void setActualSettleDate(Date actualSettleDate) {
		this.actualSettleDate = actualSettleDate;
	}

	public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public int getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(int versionNo) {
        this.versionNo = versionNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    public Long getUpSysRegisterOid() {
		return upSysRegisterOid;
	}

	public void setUpSysRegisterOid(Long upSysRegisterOid) {
		this.upSysRegisterOid = upSysRegisterOid;
	}

	public Long getUpAgentPayOid() {
		return upAgentPayOid;
	}

	public void setUpAgentPayOid(Long upAgentPayOid) {
		this.upAgentPayOid = upAgentPayOid;
	}
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}