/**
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.ContactResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The Payment Method Full Object contains the same properties as the Payment Method Summary Object, along with the following:
 **/
@ApiModel(description = "The Payment Method Full Object contains the same properties as the Payment Method Summary Object, along with the following:")
public class PaymentFull {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("voip_id")
  private Integer voipId = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("nickname")
  private String nickname = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("created_at")
  private Integer createdAt = null;
  @SerializedName("contact")
  private ContactResponse contact = null;
  @SerializedName("decline_count")
  private Integer declineCount = null;
  @SerializedName("next_charge_date")
  private Integer nextChargeDate = null;
  @SerializedName("updated_at")
  private Integer updatedAt = null;
  @SerializedName("cc_token")
  private String ccToken = null;
  @SerializedName("cc_number")
  private String ccNumber = null;
  @SerializedName("cc_exp")
  private String ccExp = null;

  /**
   * Payment Method ID
   **/
  @ApiModelProperty(value = "Payment Method ID")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * API Account ID
   **/
  @ApiModelProperty(value = "API Account ID")
  public Integer getVoipId() {
    return voipId;
  }
  public void setVoipId(Integer voipId) {
    this.voipId = voipId;
  }

  /**
   * 'primary' = primary card used for billing; 'onfile' = card on file; 'hidden' = deleted card;
   **/
  @ApiModelProperty(value = "'primary' = primary card used for billing; 'onfile' = card on file; 'hidden' = deleted card;")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Name of Card
   **/
  @ApiModelProperty(value = "Name of Card")
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  /**
   * 'cc' for credit card
   **/
  @ApiModelProperty(value = "'cc' for credit card")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Time payment record is created
   **/
  @ApiModelProperty(value = "Time payment record is created")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Detail of contact person
   **/
  @ApiModelProperty(value = "Detail of contact person")
  public ContactResponse getContact() {
    return contact;
  }
  public void setContact(ContactResponse contact) {
    this.contact = contact;
  }

  /**
   * Number of times the payment method was declined
   **/
  @ApiModelProperty(value = "Number of times the payment method was declined")
  public Integer getDeclineCount() {
    return declineCount;
  }
  public void setDeclineCount(Integer declineCount) {
    this.declineCount = declineCount;
  }

  /**
   * Next billing date
   **/
  @ApiModelProperty(value = "Next billing date")
  public Integer getNextChargeDate() {
    return nextChargeDate;
  }
  public void setNextChargeDate(Integer nextChargeDate) {
    this.nextChargeDate = nextChargeDate;
  }

  /**
   * Last time the payment method was updated
   **/
  @ApiModelProperty(value = "Last time the payment method was updated")
  public Integer getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Encrypted credit card token to be used for billing
   **/
  @ApiModelProperty(value = "Encrypted credit card token to be used for billing")
  public String getCcToken() {
    return ccToken;
  }
  public void setCcToken(String ccToken) {
    this.ccToken = ccToken;
  }

  /**
   * Credit card number partially masked with xxxxxxxx
   **/
  @ApiModelProperty(value = "Credit card number partially masked with xxxxxxxx")
  public String getCcNumber() {
    return ccNumber;
  }
  public void setCcNumber(String ccNumber) {
    this.ccNumber = ccNumber;
  }

  /**
   * Credit card expiration date
   **/
  @ApiModelProperty(value = "Credit card expiration date")
  public String getCcExp() {
    return ccExp;
  }
  public void setCcExp(String ccExp) {
    this.ccExp = ccExp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentFull paymentFull = (PaymentFull) o;
    return (this.id == null ? paymentFull.id == null : this.id.equals(paymentFull.id)) &&
        (this.voipId == null ? paymentFull.voipId == null : this.voipId.equals(paymentFull.voipId)) &&
        (this.status == null ? paymentFull.status == null : this.status.equals(paymentFull.status)) &&
        (this.nickname == null ? paymentFull.nickname == null : this.nickname.equals(paymentFull.nickname)) &&
        (this.type == null ? paymentFull.type == null : this.type.equals(paymentFull.type)) &&
        (this.createdAt == null ? paymentFull.createdAt == null : this.createdAt.equals(paymentFull.createdAt)) &&
        (this.contact == null ? paymentFull.contact == null : this.contact.equals(paymentFull.contact)) &&
        (this.declineCount == null ? paymentFull.declineCount == null : this.declineCount.equals(paymentFull.declineCount)) &&
        (this.nextChargeDate == null ? paymentFull.nextChargeDate == null : this.nextChargeDate.equals(paymentFull.nextChargeDate)) &&
        (this.updatedAt == null ? paymentFull.updatedAt == null : this.updatedAt.equals(paymentFull.updatedAt)) &&
        (this.ccToken == null ? paymentFull.ccToken == null : this.ccToken.equals(paymentFull.ccToken)) &&
        (this.ccNumber == null ? paymentFull.ccNumber == null : this.ccNumber.equals(paymentFull.ccNumber)) &&
        (this.ccExp == null ? paymentFull.ccExp == null : this.ccExp.equals(paymentFull.ccExp));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.voipId == null ? 0: this.voipId.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.nickname == null ? 0: this.nickname.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.contact == null ? 0: this.contact.hashCode());
    result = 31 * result + (this.declineCount == null ? 0: this.declineCount.hashCode());
    result = 31 * result + (this.nextChargeDate == null ? 0: this.nextChargeDate.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    result = 31 * result + (this.ccToken == null ? 0: this.ccToken.hashCode());
    result = 31 * result + (this.ccNumber == null ? 0: this.ccNumber.hashCode());
    result = 31 * result + (this.ccExp == null ? 0: this.ccExp.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentFull {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  voipId: ").append(voipId).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  nickname: ").append(nickname).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  contact: ").append(contact).append("\n");
    sb.append("  declineCount: ").append(declineCount).append("\n");
    sb.append("  nextChargeDate: ").append(nextChargeDate).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  ccToken: ").append(ccToken).append("\n");
    sb.append("  ccNumber: ").append(ccNumber).append("\n");
    sb.append("  ccExp: ").append(ccExp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
