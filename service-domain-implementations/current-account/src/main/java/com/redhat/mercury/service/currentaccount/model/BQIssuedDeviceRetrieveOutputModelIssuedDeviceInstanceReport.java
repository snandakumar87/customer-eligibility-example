package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport   {
  @JsonProperty("issuedDeviceInstanceReportRecord")
  private Object issuedDeviceInstanceReportRecord;

  @JsonProperty("issuedDeviceInstanceReportType")
  private String issuedDeviceInstanceReportType;

  @JsonProperty("issuedDeviceInstanceReportParameters")
  private String issuedDeviceInstanceReportParameters;

  @JsonProperty("issuedDeviceInstanceReport")
  private Object issuedDeviceInstanceReport;

  public BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport issuedDeviceInstanceReportRecord(Object issuedDeviceInstanceReportRecord) {
    this.issuedDeviceInstanceReportRecord = issuedDeviceInstanceReportRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return issuedDeviceInstanceReportRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected ")

  @Valid

  public Object getIssuedDeviceInstanceReportRecord() {
    return issuedDeviceInstanceReportRecord;
  }

  public void setIssuedDeviceInstanceReportRecord(Object issuedDeviceInstanceReportRecord) {
    this.issuedDeviceInstanceReportRecord = issuedDeviceInstanceReportRecord;
  }

  public BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport issuedDeviceInstanceReportType(String issuedDeviceInstanceReportType) {
    this.issuedDeviceInstanceReportType = issuedDeviceInstanceReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return issuedDeviceInstanceReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available ")


  public String getIssuedDeviceInstanceReportType() {
    return issuedDeviceInstanceReportType;
  }

  public void setIssuedDeviceInstanceReportType(String issuedDeviceInstanceReportType) {
    this.issuedDeviceInstanceReportType = issuedDeviceInstanceReportType;
  }

  public BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport issuedDeviceInstanceReportParameters(String issuedDeviceInstanceReportParameters) {
    this.issuedDeviceInstanceReportParameters = issuedDeviceInstanceReportParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return issuedDeviceInstanceReportParameters
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) ")


  public String getIssuedDeviceInstanceReportParameters() {
    return issuedDeviceInstanceReportParameters;
  }

  public void setIssuedDeviceInstanceReportParameters(String issuedDeviceInstanceReportParameters) {
    this.issuedDeviceInstanceReportParameters = issuedDeviceInstanceReportParameters;
  }

  public BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport issuedDeviceInstanceReport(Object issuedDeviceInstanceReport) {
    this.issuedDeviceInstanceReport = issuedDeviceInstanceReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return issuedDeviceInstanceReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getIssuedDeviceInstanceReport() {
    return issuedDeviceInstanceReport;
  }

  public void setIssuedDeviceInstanceReport(Object issuedDeviceInstanceReport) {
    this.issuedDeviceInstanceReport = issuedDeviceInstanceReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport bqIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport = (BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport) o;
    return Objects.equals(this.issuedDeviceInstanceReportRecord, bqIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport.issuedDeviceInstanceReportRecord) &&
        Objects.equals(this.issuedDeviceInstanceReportType, bqIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport.issuedDeviceInstanceReportType) &&
        Objects.equals(this.issuedDeviceInstanceReportParameters, bqIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport.issuedDeviceInstanceReportParameters) &&
        Objects.equals(this.issuedDeviceInstanceReport, bqIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport.issuedDeviceInstanceReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceInstanceReportRecord, issuedDeviceInstanceReportType, issuedDeviceInstanceReportParameters, issuedDeviceInstanceReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQIssuedDeviceRetrieveOutputModelIssuedDeviceInstanceReport {\n");
    
    sb.append("    issuedDeviceInstanceReportRecord: ").append(toIndentedString(issuedDeviceInstanceReportRecord)).append("\n");
    sb.append("    issuedDeviceInstanceReportType: ").append(toIndentedString(issuedDeviceInstanceReportType)).append("\n");
    sb.append("    issuedDeviceInstanceReportParameters: ").append(toIndentedString(issuedDeviceInstanceReportParameters)).append("\n");
    sb.append("    issuedDeviceInstanceReport: ").append(toIndentedString(issuedDeviceInstanceReport)).append("\n");
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

