/*
 * Ukraine Alert API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0
 * Contact: support@stfalcon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TimeSpan
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-01-15T00:21:04.781159+02:00[Europe/Kiev]")

public class TimeSpan {
  @SerializedName("ticks")
  private Long ticks = null;

  @SerializedName("days")
  private Integer days = null;

  @SerializedName("hours")
  private Integer hours = null;

  @SerializedName("milliseconds")
  private Integer milliseconds = null;

  @SerializedName("minutes")
  private Integer minutes = null;

  @SerializedName("seconds")
  private Integer seconds = null;

  @SerializedName("totalDays")
  private Double totalDays = null;

  @SerializedName("totalHours")
  private Double totalHours = null;

  @SerializedName("totalMilliseconds")
  private Double totalMilliseconds = null;

  @SerializedName("totalMinutes")
  private Double totalMinutes = null;

  @SerializedName("totalSeconds")
  private Double totalSeconds = null;

  public TimeSpan ticks(Long ticks) {
    this.ticks = ticks;
    return this;
  }

   /**
   * Get ticks
   * @return ticks
  **/
  @Schema(description = "")
  public Long getTicks() {
    return ticks;
  }

  public void setTicks(Long ticks) {
    this.ticks = ticks;
  }

  public TimeSpan days(Integer days) {
    this.days = days;
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @Schema(description = "")
  public Integer getDays() {
    return days;
  }

  public void setDays(Integer days) {
    this.days = days;
  }

  public TimeSpan hours(Integer hours) {
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/
  @Schema(description = "")
  public Integer getHours() {
    return hours;
  }

  public void setHours(Integer hours) {
    this.hours = hours;
  }

  public TimeSpan milliseconds(Integer milliseconds) {
    this.milliseconds = milliseconds;
    return this;
  }

   /**
   * Get milliseconds
   * @return milliseconds
  **/
  @Schema(description = "")
  public Integer getMilliseconds() {
    return milliseconds;
  }

  public void setMilliseconds(Integer milliseconds) {
    this.milliseconds = milliseconds;
  }

  public TimeSpan minutes(Integer minutes) {
    this.minutes = minutes;
    return this;
  }

   /**
   * Get minutes
   * @return minutes
  **/
  @Schema(description = "")
  public Integer getMinutes() {
    return minutes;
  }

  public void setMinutes(Integer minutes) {
    this.minutes = minutes;
  }

  public TimeSpan seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

   /**
   * Get seconds
   * @return seconds
  **/
  @Schema(description = "")
  public Integer getSeconds() {
    return seconds;
  }

  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

   /**
   * Get totalDays
   * @return totalDays
  **/
  @Schema(description = "")
  public Double getTotalDays() {
    return totalDays;
  }

   /**
   * Get totalHours
   * @return totalHours
  **/
  @Schema(description = "")
  public Double getTotalHours() {
    return totalHours;
  }

   /**
   * Get totalMilliseconds
   * @return totalMilliseconds
  **/
  @Schema(description = "")
  public Double getTotalMilliseconds() {
    return totalMilliseconds;
  }

   /**
   * Get totalMinutes
   * @return totalMinutes
  **/
  @Schema(description = "")
  public Double getTotalMinutes() {
    return totalMinutes;
  }

   /**
   * Get totalSeconds
   * @return totalSeconds
  **/
  @Schema(description = "")
  public Double getTotalSeconds() {
    return totalSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSpan timeSpan = (TimeSpan) o;
    return Objects.equals(this.ticks, timeSpan.ticks) &&
        Objects.equals(this.days, timeSpan.days) &&
        Objects.equals(this.hours, timeSpan.hours) &&
        Objects.equals(this.milliseconds, timeSpan.milliseconds) &&
        Objects.equals(this.minutes, timeSpan.minutes) &&
        Objects.equals(this.seconds, timeSpan.seconds) &&
        Objects.equals(this.totalDays, timeSpan.totalDays) &&
        Objects.equals(this.totalHours, timeSpan.totalHours) &&
        Objects.equals(this.totalMilliseconds, timeSpan.totalMilliseconds) &&
        Objects.equals(this.totalMinutes, timeSpan.totalMinutes) &&
        Objects.equals(this.totalSeconds, timeSpan.totalSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticks, days, hours, milliseconds, minutes, seconds, totalDays, totalHours, totalMilliseconds, totalMinutes, totalSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSpan {\n");
    
    sb.append("    ticks: ").append(toIndentedString(ticks)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    milliseconds: ").append(toIndentedString(milliseconds)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    totalDays: ").append(toIndentedString(totalDays)).append("\n");
    sb.append("    totalHours: ").append(toIndentedString(totalHours)).append("\n");
    sb.append("    totalMilliseconds: ").append(toIndentedString(totalMilliseconds)).append("\n");
    sb.append("    totalMinutes: ").append(toIndentedString(totalMinutes)).append("\n");
    sb.append("    totalSeconds: ").append(toIndentedString(totalSeconds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
