package com.pts.procureline.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vms_payment_mail_master database table.
 * 
 */
@Entity
@Table(name="vms_payment_mail_master")
@NamedQuery(name="VmsPaymentMailMaster.findAll", query="SELECT v FROM VmsPaymentMailMaster v")
public class VmsPaymentMailMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="entry_date")
	private Date entryDate;

	@Column(name="invoice_id")
	private int invoiceId;

	@Column(name="is_deleted")
	private String isDeleted;

	@Column(name="is_vendor_view")
	private String isVendorView;

	@Column(name="is_view")
	private String isView;

	@Lob
	private String message;

	@Column(name="recipient_id")
	private int recipientId;

	@Column(name="recipient_type")
	private String recipientType;

	@Column(name="reply_id")
	private int replyId;

	@Column(name="sender_id")
	private int senderId;

	@Column(name="sender_type")
	private String senderType;

	private String status;

	@Lob
	private String subject;

	public VmsPaymentMailMaster() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public int getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getIsVendorView() {
		return this.isVendorView;
	}

	public void setIsVendorView(String isVendorView) {
		this.isVendorView = isVendorView;
	}

	public String getIsView() {
		return this.isView;
	}

	public void setIsView(String isView) {
		this.isView = isView;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getRecipientId() {
		return this.recipientId;
	}

	public void setRecipientId(int recipientId) {
		this.recipientId = recipientId;
	}

	public String getRecipientType() {
		return this.recipientType;
	}

	public void setRecipientType(String recipientType) {
		this.recipientType = recipientType;
	}

	public int getReplyId() {
		return this.replyId;
	}

	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}

	public int getSenderId() {
		return this.senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public String getSenderType() {
		return this.senderType;
	}

	public void setSenderType(String senderType) {
		this.senderType = senderType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}