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
 * Contact Address Object. See below for details.
 **/
@ApiModel(description = "Contact Address Object. See below for details.")
public class Address {
  
  @SerializedName("line_1")
  private String line1 = null;
  @SerializedName("line_2")
  private String line2 = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("province")
  private String province = null;
  @SerializedName("postal_code")
  private String postalCode = null;
  @SerializedName("country")
  private String country = null;

  /**
   * Street address line 1. Required.
   **/
  @ApiModelProperty(required = true, value = "Street address line 1. Required.")
  public String getLine1() {
    return line1;
  }
  public void setLine1(String line1) {
    this.line1 = line1;
  }

  /**
   * Street address line 2
   **/
  @ApiModelProperty(value = "Street address line 2")
  public String getLine2() {
    return line2;
  }
  public void setLine2(String line2) {
    this.line2 = line2;
  }

  /**
   * City. Required.
   **/
  @ApiModelProperty(required = true, value = "City. Required.")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * Province. Required if country is US
   **/
  @ApiModelProperty(value = "Province. Required if country is US")
  public String getProvince() {
    return province;
  }
  public void setProvince(String province) {
    this.province = province;
  }

  /**
   * Postal code
   **/
  @ApiModelProperty(value = "Postal code")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * 2-character country code. Required.
   **/
  @ApiModelProperty(required = true, value = "2-character country code. Required.")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return (this.line1 == null ? address.line1 == null : this.line1.equals(address.line1)) &&
        (this.line2 == null ? address.line2 == null : this.line2.equals(address.line2)) &&
        (this.city == null ? address.city == null : this.city.equals(address.city)) &&
        (this.province == null ? address.province == null : this.province.equals(address.province)) &&
        (this.postalCode == null ? address.postalCode == null : this.postalCode.equals(address.postalCode)) &&
        (this.country == null ? address.country == null : this.country.equals(address.country));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.line1 == null ? 0: this.line1.hashCode());
    result = 31 * result + (this.line2 == null ? 0: this.line2.hashCode());
    result = 31 * result + (this.city == null ? 0: this.city.hashCode());
    result = 31 * result + (this.province == null ? 0: this.province.hashCode());
    result = 31 * result + (this.postalCode == null ? 0: this.postalCode.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("  line1: ").append(line1).append("\n");
    sb.append("  line2: ").append(line2).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  province: ").append(province).append("\n");
    sb.append("  postalCode: ").append(postalCode).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
