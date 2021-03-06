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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The Payment Method Summary Object is used to briefly represent a Credit Card. It consists of parameters in the table below:
 **/
@ApiModel(description = "The Payment Method Summary Object is used to briefly represent a Credit Card. It consists of parameters in the table below:")
public class PaymentSummary {
  
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSummary paymentSummary = (PaymentSummary) o;
    return (this.id == null ? paymentSummary.id == null : this.id.equals(paymentSummary.id)) &&
        (this.voipId == null ? paymentSummary.voipId == null : this.voipId.equals(paymentSummary.voipId)) &&
        (this.status == null ? paymentSummary.status == null : this.status.equals(paymentSummary.status)) &&
        (this.nickname == null ? paymentSummary.nickname == null : this.nickname.equals(paymentSummary.nickname)) &&
        (this.type == null ? paymentSummary.type == null : this.type.equals(paymentSummary.type)) &&
        (this.createdAt == null ? paymentSummary.createdAt == null : this.createdAt.equals(paymentSummary.createdAt));
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
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSummary {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  voipId: ").append(voipId).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  nickname: ").append(nickname).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
