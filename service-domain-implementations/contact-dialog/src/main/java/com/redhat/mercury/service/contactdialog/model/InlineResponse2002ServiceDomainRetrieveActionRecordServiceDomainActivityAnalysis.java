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
 * InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis   {
  @JsonProperty("activityAnalysisReference")
  private String activityAnalysisReference;

  @JsonProperty("activityAnalysisResult")
  private String activityAnalysisResult;

  @JsonProperty("activityAnalysisReportType")
  private String activityAnalysisReportType;

  @JsonProperty("activityAnalysisReport")
  private Object activityAnalysisReport;

  public InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis activityAnalysisReference(String activityAnalysisReference) {
    this.activityAnalysisReference = activityAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the internal activity analysis view maintained by the service center 
   * @return activityAnalysisReference
  */
  @ApiModelProperty(example = "730230", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the internal activity analysis view maintained by the service center ")


  public String getActivityAnalysisReference() {
    return activityAnalysisReference;
  }

  public void setActivityAnalysisReference(String activityAnalysisReference) {
    this.activityAnalysisReference = activityAnalysisReference;
  }

  public InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis activityAnalysisResult(String activityAnalysisResult) {
    this.activityAnalysisResult = activityAnalysisResult;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The results of the activity analysis that can be on-going, periodic and actual and projected 
   * @return activityAnalysisResult
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The results of the activity analysis that can be on-going, periodic and actual and projected ")


  public String getActivityAnalysisResult() {
    return activityAnalysisResult;
  }

  public void setActivityAnalysisResult(String activityAnalysisResult) {
    this.activityAnalysisResult = activityAnalysisResult;
  }

  public InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis activityAnalysisReportType(String activityAnalysisReportType) {
    this.activityAnalysisReportType = activityAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of activity analysis report available 
   * @return activityAnalysisReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of activity analysis report available ")


  public String getActivityAnalysisReportType() {
    return activityAnalysisReportType;
  }

  public void setActivityAnalysisReportType(String activityAnalysisReportType) {
    this.activityAnalysisReportType = activityAnalysisReportType;
  }

  public InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis activityAnalysisReport(Object activityAnalysisReport) {
    this.activityAnalysisReport = activityAnalysisReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activity analysis report in any suitable form including selection filters where appropriate 
   * @return activityAnalysisReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activity analysis report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getActivityAnalysisReport() {
    return activityAnalysisReport;
  }

  public void setActivityAnalysisReport(Object activityAnalysisReport) {
    this.activityAnalysisReport = activityAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis inlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis = (InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis) o;
    return Objects.equals(this.activityAnalysisReference, inlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis.activityAnalysisReference) &&
        Objects.equals(this.activityAnalysisResult, inlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis.activityAnalysisResult) &&
        Objects.equals(this.activityAnalysisReportType, inlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis.activityAnalysisReportType) &&
        Objects.equals(this.activityAnalysisReport, inlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis.activityAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityAnalysisReference, activityAnalysisResult, activityAnalysisReportType, activityAnalysisReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis {\n");
    
    sb.append("    activityAnalysisReference: ").append(toIndentedString(activityAnalysisReference)).append("\n");
    sb.append("    activityAnalysisResult: ").append(toIndentedString(activityAnalysisResult)).append("\n");
    sb.append("    activityAnalysisReportType: ").append(toIndentedString(activityAnalysisReportType)).append("\n");
    sb.append("    activityAnalysisReport: ").append(toIndentedString(activityAnalysisReport)).append("\n");
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

