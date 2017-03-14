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
 * The Full Available Phone Number Object includes the properties in the Summary Object, along with the following:
 **/
@ApiModel(description = "The Full Available Phone Number Object includes the properties in the Summary Object, along with the following:")
public class AvailableNumbersFull {
  
  @SerializedName("phone_number")
  private String phoneNumber = null;
  @SerializedName("formatted")
  private String formatted = null;
  @SerializedName("price")
  private Integer price = null;
  @SerializedName("is_toll_free")
  private Boolean isTollFree = null;
  @SerializedName("country_code")
  private String countryCode = null;
  @SerializedName("npa")
  private String npa = null;
  @SerializedName("nxx")
  private String nxx = null;
  @SerializedName("xxxx")
  private String xxxx = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("province")
  private String province = null;
  @SerializedName("country")
  private String country = null;

  /**
   * Phone number, in E.164 format
   **/
  @ApiModelProperty(value = "Phone number, in E.164 format")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * Human-readable formatted version of the phone number
   **/
  @ApiModelProperty(value = "Human-readable formatted version of the phone number")
  public String getFormatted() {
    return formatted;
  }
  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }

  /**
   * The one-time initial price for this number, in USD. Some numbers show REQUEST_QUOTE here. Please contact our sales department if you are interested in these numbers.
   **/
  @ApiModelProperty(value = "The one-time initial price for this number, in USD. Some numbers show REQUEST_QUOTE here. Please contact our sales department if you are interested in these numbers.")
  public Integer getPrice() {
    return price;
  }
  public void setPrice(Integer price) {
    this.price = price;
  }

  /**
   * Whether the number is toll-free
   **/
  @ApiModelProperty(value = "Whether the number is toll-free")
  public Boolean getIsTollFree() {
    return isTollFree;
  }
  public void setIsTollFree(Boolean isTollFree) {
    this.isTollFree = isTollFree;
  }

  /**
   * The international dialing prefix for this number. For US and Canadian numbers, for example, this will be \"1\".
   **/
  @ApiModelProperty(value = "The international dialing prefix for this number. For US and Canadian numbers, for example, this will be \"1\".")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * Area code (a.k.a. NPA). Included for North American numbers only.
   **/
  @ApiModelProperty(value = "Area code (a.k.a. NPA). Included for North American numbers only.")
  public String getNpa() {
    return npa;
  }
  public void setNpa(String npa) {
    this.npa = npa;
  }

  /**
   * Second 3 digits (a.k.a. NXX). Included for North American numbers only.
   **/
  @ApiModelProperty(value = "Second 3 digits (a.k.a. NXX). Included for North American numbers only.")
  public String getNxx() {
    return nxx;
  }
  public void setNxx(String nxx) {
    this.nxx = nxx;
  }

  /**
   * Last 4 digits (a.k.a. XXXX). Included for North American numbers only.
   **/
  @ApiModelProperty(value = "Last 4 digits (a.k.a. XXXX). Included for North American numbers only.")
  public String getXxxx() {
    return xxxx;
  }
  public void setXxxx(String xxxx) {
    this.xxxx = xxxx;
  }

  /**
   * City with which this number is associated, if known. Otherwise NULL.
   **/
  @ApiModelProperty(value = "City with which this number is associated, if known. Otherwise NULL.")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * State or Province with which this number is associated, if known. Postal Code. Otherwise NULL.
   **/
  @ApiModelProperty(value = "State or Province with which this number is associated, if known. Postal Code. Otherwise NULL.")
  public String getProvince() {
    return province;
  }
  public void setProvince(String province) {
    this.province = province;
  }

  /**
   * Country with which this number is associated, if known. Otherwise NULL.
   **/
  @ApiModelProperty(value = "Country with which this number is associated, if known. Otherwise NULL.")
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
    AvailableNumbersFull availableNumbersFull = (AvailableNumbersFull) o;
    return (this.phoneNumber == null ? availableNumbersFull.phoneNumber == null : this.phoneNumber.equals(availableNumbersFull.phoneNumber)) &&
        (this.formatted == null ? availableNumbersFull.formatted == null : this.formatted.equals(availableNumbersFull.formatted)) &&
        (this.price == null ? availableNumbersFull.price == null : this.price.equals(availableNumbersFull.price)) &&
        (this.isTollFree == null ? availableNumbersFull.isTollFree == null : this.isTollFree.equals(availableNumbersFull.isTollFree)) &&
        (this.countryCode == null ? availableNumbersFull.countryCode == null : this.countryCode.equals(availableNumbersFull.countryCode)) &&
        (this.npa == null ? availableNumbersFull.npa == null : this.npa.equals(availableNumbersFull.npa)) &&
        (this.nxx == null ? availableNumbersFull.nxx == null : this.nxx.equals(availableNumbersFull.nxx)) &&
        (this.xxxx == null ? availableNumbersFull.xxxx == null : this.xxxx.equals(availableNumbersFull.xxxx)) &&
        (this.city == null ? availableNumbersFull.city == null : this.city.equals(availableNumbersFull.city)) &&
        (this.province == null ? availableNumbersFull.province == null : this.province.equals(availableNumbersFull.province)) &&
        (this.country == null ? availableNumbersFull.country == null : this.country.equals(availableNumbersFull.country));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.phoneNumber == null ? 0: this.phoneNumber.hashCode());
    result = 31 * result + (this.formatted == null ? 0: this.formatted.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.isTollFree == null ? 0: this.isTollFree.hashCode());
    result = 31 * result + (this.countryCode == null ? 0: this.countryCode.hashCode());
    result = 31 * result + (this.npa == null ? 0: this.npa.hashCode());
    result = 31 * result + (this.nxx == null ? 0: this.nxx.hashCode());
    result = 31 * result + (this.xxxx == null ? 0: this.xxxx.hashCode());
    result = 31 * result + (this.city == null ? 0: this.city.hashCode());
    result = 31 * result + (this.province == null ? 0: this.province.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableNumbersFull {\n");
    
    sb.append("  phoneNumber: ").append(phoneNumber).append("\n");
    sb.append("  formatted: ").append(formatted).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  isTollFree: ").append(isTollFree).append("\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  npa: ").append(npa).append("\n");
    sb.append("  nxx: ").append(nxx).append("\n");
    sb.append("  xxxx: ").append(xxxx).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  province: ").append(province).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}