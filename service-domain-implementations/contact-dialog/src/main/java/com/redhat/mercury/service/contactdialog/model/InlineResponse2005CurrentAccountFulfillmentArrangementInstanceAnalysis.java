package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2005CurrentAccountFulfillmentArrangementInstanceAnalysis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class InlineResponse2005CurrentAccountFulfillmentArrangementInstanceAnalysis   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceAnalysisData")
  private String currentAccountFulfillmentArrangementInstanceAnalysisData;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceAnalysisReportType")
  private String currentAccountFulfillmentArrangementInstanceAnalysisReportType;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceAnalysisReport")
  private Object currentAccountFulfillmentArrangementInstanceAnalysisReport;

  public InlineResponse2005CurrentAccountFulfillmentArrangementInstanceAnalysis currentAccountFulfillmentArrangementInstanceAnalysisData(String currentAccountFulfillmentArrangementInstanceAnalysisData) {
    this.currentAccountFulfillmentArrangementInstanceAnalysisData = currentAccountFulfillmentArrangementInstanceAnalysisData;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return currentAccountFulfillmentArrangementInstanceAnalysisData
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected ")


  public String getCurrentAccountFulfillmentArrangementInstanceAnalysisData() {
    return currentAccountFulfillmentArrangementInstanceAnalysisData;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceAnalysisData(String currentAccountFulfillmentArrangementInstanceAnalysisData) {
    this.currentAccountFulfillmentArrangementInstanceAnalysisData = currentAccountFulfillmentArrangementInstanceAnalysisData;
  }

  public InlineResponse2005CurrentAccountFulfillmentArrangementInstanceAnalysis currentAccountFulfillmentArrangementInstanceAnalysisReportType(String currentAccountFulfillmentArrangementInstanceAnalysisReportType) {
    this.currentAccountFulfillmentArrangementInstanceAnalysisReportType = currentAccountFulfillmentArrangementInstanceAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return currentAccountFulfillmentArrangementInstanceAnalysisReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available ")


  public String getCurrentAccountFulfillmentArrangementInstanceAnalysisReportType() {
    return currentAccountFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceAnalysisReportType(String currentAccountFulfillmentArrangementInstanceAnalysisReportType) {
    this.currentAccountFulfillmentArrangementInstanceAnalysisReportType = currentAccountFulfillmentArrangementInstanceAnalysisReportType;
  }

  public InlineResponse2005CurrentAccountFulfillmentArrangementInstanceAnalysis currentAccountFulfillmentArrangementInstanceAnalysisReport(Object currentAccountFulfillmentArrangementInstanceAnalysisReport) {
    this.currentAccountFulfillmentArrangementInstanceAnalysisReport = currentAccountFulfillmentArrangementInstanceAnalysisReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return currentAccountFulfillmentArrangementInstanceAnalysisReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getCurrentAccountFulfillmentArrangementInstanceAnalysisReport() {
    return currentAccountFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceAnalysisReport(Object currentAccountFulfillmentArrangementInstanceAnalysisReport) {
    this.currentAccountFulfillmentArrangementInstanceAnalysisReport = currentAccountFulfillmentArrangementInstanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005CurrentAccountFulfillmentArrangementInstanceAnalysis inlineResponse2005CurrentAccountFulfillmentArrangementInstanceAnalysis = (InlineResponse2005CurrentAccountFulfillmentArrangementInstanceAnalysis) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceAnalysisData, inlineResponse2005CurrentAccountFulfillmentArrangementInstanceAnalysis.currentAccountFulfillmentArrangementInstanceAnalysisData) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceAnalysisReportType, inlineResponse2005CurrentAccountFulfillmentArrangementInstanceAnalysis.currentAccountFulfillmentArrangementInstanceAnalysisReportType) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceAnalysisReport, inlineResponse2005CurrentAccountFulfillmentArrangementInstanceAnalysis.currentAccountFulfillmentArrangementInstanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceAnalysisData, currentAccountFulfillmentArrangementInstanceAnalysisReportType, currentAccountFulfillmentArrangementInstanceAnalysisReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005CurrentAccountFulfillmentArrangementInstanceAnalysis {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceAnalysisData: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceAnalysisData)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceAnalysisReportType: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceAnalysisReportType)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceAnalysisReport: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceAnalysisReport)).append("\n");
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

