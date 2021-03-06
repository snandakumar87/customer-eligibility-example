package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2002ServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCurrentAccountRetrieveOutputModelServiceDomainRetrieveActionRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class SDCurrentAccountRetrieveOutputModelServiceDomainRetrieveActionRecord   {
  @JsonProperty("serviceDomainActivityAnalysis")
  private InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis serviceDomainActivityAnalysis;

  @JsonProperty("serviceDomainPerformanceAnalysis")
  private InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis;

  @JsonProperty("controlRecordPortfolioAnalysis")
  private InlineResponse2002ServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis;

  public SDCurrentAccountRetrieveOutputModelServiceDomainRetrieveActionRecord serviceDomainActivityAnalysis(InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis serviceDomainActivityAnalysis) {
    this.serviceDomainActivityAnalysis = serviceDomainActivityAnalysis;
    return this;
  }

  /**
   * Get serviceDomainActivityAnalysis
   * @return serviceDomainActivityAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis getServiceDomainActivityAnalysis() {
    return serviceDomainActivityAnalysis;
  }

  public void setServiceDomainActivityAnalysis(InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis serviceDomainActivityAnalysis) {
    this.serviceDomainActivityAnalysis = serviceDomainActivityAnalysis;
  }

  public SDCurrentAccountRetrieveOutputModelServiceDomainRetrieveActionRecord serviceDomainPerformanceAnalysis(InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis) {
    this.serviceDomainPerformanceAnalysis = serviceDomainPerformanceAnalysis;
    return this;
  }

  /**
   * Get serviceDomainPerformanceAnalysis
   * @return serviceDomainPerformanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis getServiceDomainPerformanceAnalysis() {
    return serviceDomainPerformanceAnalysis;
  }

  public void setServiceDomainPerformanceAnalysis(InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis) {
    this.serviceDomainPerformanceAnalysis = serviceDomainPerformanceAnalysis;
  }

  public SDCurrentAccountRetrieveOutputModelServiceDomainRetrieveActionRecord controlRecordPortfolioAnalysis(InlineResponse2002ServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
    return this;
  }

  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2002ServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(InlineResponse2002ServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCurrentAccountRetrieveOutputModelServiceDomainRetrieveActionRecord sdCurrentAccountRetrieveOutputModelServiceDomainRetrieveActionRecord = (SDCurrentAccountRetrieveOutputModelServiceDomainRetrieveActionRecord) o;
    return Objects.equals(this.serviceDomainActivityAnalysis, sdCurrentAccountRetrieveOutputModelServiceDomainRetrieveActionRecord.serviceDomainActivityAnalysis) &&
        Objects.equals(this.serviceDomainPerformanceAnalysis, sdCurrentAccountRetrieveOutputModelServiceDomainRetrieveActionRecord.serviceDomainPerformanceAnalysis) &&
        Objects.equals(this.controlRecordPortfolioAnalysis, sdCurrentAccountRetrieveOutputModelServiceDomainRetrieveActionRecord.controlRecordPortfolioAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainActivityAnalysis, serviceDomainPerformanceAnalysis, controlRecordPortfolioAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCurrentAccountRetrieveOutputModelServiceDomainRetrieveActionRecord {\n");
    
    sb.append("    serviceDomainActivityAnalysis: ").append(toIndentedString(serviceDomainActivityAnalysis)).append("\n");
    sb.append("    serviceDomainPerformanceAnalysis: ").append(toIndentedString(serviceDomainPerformanceAnalysis)).append("\n");
    sb.append("    controlRecordPortfolioAnalysis: ").append(toIndentedString(controlRecordPortfolioAnalysis)).append("\n");
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

