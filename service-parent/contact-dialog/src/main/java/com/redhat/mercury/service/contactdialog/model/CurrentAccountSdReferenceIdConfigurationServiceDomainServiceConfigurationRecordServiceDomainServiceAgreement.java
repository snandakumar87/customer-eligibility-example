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
 * CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement   {
  @JsonProperty("serviceDomainServiceAgreementReference")
  private String serviceDomainServiceAgreementReference;

  @JsonProperty("serviceDomainServiceUserReference")
  private String serviceDomainServiceUserReference;

  @JsonProperty("serviceDomainServiceAgreementTermsandConditions")
  private String serviceDomainServiceAgreementTermsandConditions;

  public CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreementReference(String serviceDomainServiceAgreementReference) {
    this.serviceDomainServiceAgreementReference = serviceDomainServiceAgreementReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return serviceDomainServiceAgreementReference
  */
  @ApiModelProperty(example = "721156", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement ")


  public String getServiceDomainServiceAgreementReference() {
    return serviceDomainServiceAgreementReference;
  }

  public void setServiceDomainServiceAgreementReference(String serviceDomainServiceAgreementReference) {
    this.serviceDomainServiceAgreementReference = serviceDomainServiceAgreementReference;
  }

  public CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceUserReference(String serviceDomainServiceUserReference) {
    this.serviceDomainServiceUserReference = serviceDomainServiceUserReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return serviceDomainServiceUserReference
  */
  @ApiModelProperty(example = "733696", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract ")


  public String getServiceDomainServiceUserReference() {
    return serviceDomainServiceUserReference;
  }

  public void setServiceDomainServiceUserReference(String serviceDomainServiceUserReference) {
    this.serviceDomainServiceUserReference = serviceDomainServiceUserReference;
  }

  public CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreementTermsandConditions(String serviceDomainServiceAgreementTermsandConditions) {
    this.serviceDomainServiceAgreementTermsandConditions = serviceDomainServiceAgreementTermsandConditions;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return serviceDomainServiceAgreementTermsandConditions
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement ")


  public String getServiceDomainServiceAgreementTermsandConditions() {
    return serviceDomainServiceAgreementTermsandConditions;
  }

  public void setServiceDomainServiceAgreementTermsandConditions(String serviceDomainServiceAgreementTermsandConditions) {
    this.serviceDomainServiceAgreementTermsandConditions = serviceDomainServiceAgreementTermsandConditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement currentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement = (CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement) o;
    return Objects.equals(this.serviceDomainServiceAgreementReference, currentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement.serviceDomainServiceAgreementReference) &&
        Objects.equals(this.serviceDomainServiceUserReference, currentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement.serviceDomainServiceUserReference) &&
        Objects.equals(this.serviceDomainServiceAgreementTermsandConditions, currentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement.serviceDomainServiceAgreementTermsandConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceAgreementReference, serviceDomainServiceUserReference, serviceDomainServiceAgreementTermsandConditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement {\n");
    
    sb.append("    serviceDomainServiceAgreementReference: ").append(toIndentedString(serviceDomainServiceAgreementReference)).append("\n");
    sb.append("    serviceDomainServiceUserReference: ").append(toIndentedString(serviceDomainServiceUserReference)).append("\n");
    sb.append("    serviceDomainServiceAgreementTermsandConditions: ").append(toIndentedString(serviceDomainServiceAgreementTermsandConditions)).append("\n");
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

