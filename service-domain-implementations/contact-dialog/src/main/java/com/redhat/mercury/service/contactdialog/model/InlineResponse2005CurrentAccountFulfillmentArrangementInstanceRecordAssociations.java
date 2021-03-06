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
 * InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecordAssociations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecordAssociations   {
  @JsonProperty("associationType")
  private String associationType;

  @JsonProperty("associationObligationEntitlement")
  private String associationObligationEntitlement;

  @JsonProperty("associationReference")
  private String associationReference;

  public InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecordAssociations associationType(String associationType) {
    this.associationType = associationType;
    return this;
  }

  /**
   * general-info: The type of association (e.g. guarantor, co-signer) 
   * @return associationType
  */
  @ApiModelProperty(value = "general-info: The type of association (e.g. guarantor, co-signer) ")


  public String getAssociationType() {
    return associationType;
  }

  public void setAssociationType(String associationType) {
    this.associationType = associationType;
  }

  public InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecordAssociations associationObligationEntitlement(String associationObligationEntitlement) {
    this.associationObligationEntitlement = associationObligationEntitlement;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the role, obligations or entitlements of the associated party 
   * @return associationObligationEntitlement
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the role, obligations or entitlements of the associated party ")


  public String getAssociationObligationEntitlement() {
    return associationObligationEntitlement;
  }

  public void setAssociationObligationEntitlement(String associationObligationEntitlement) {
    this.associationObligationEntitlement = associationObligationEntitlement;
  }

  public InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecordAssociations associationReference(String associationReference) {
    this.associationReference = associationReference;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E10RccTGEeChad0JzLk7QA_1392095805  bian-reference: CurrentAccountAgreement (as Agreement).AgreementInvolvement  general-info: Reference to the associated party 
   * @return associationReference
  */
  @ApiModelProperty(example = "716465", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E10RccTGEeChad0JzLk7QA_1392095805  bian-reference: CurrentAccountAgreement (as Agreement).AgreementInvolvement  general-info: Reference to the associated party ")


  public String getAssociationReference() {
    return associationReference;
  }

  public void setAssociationReference(String associationReference) {
    this.associationReference = associationReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecordAssociations inlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecordAssociations = (InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecordAssociations) o;
    return Objects.equals(this.associationType, inlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecordAssociations.associationType) &&
        Objects.equals(this.associationObligationEntitlement, inlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecordAssociations.associationObligationEntitlement) &&
        Objects.equals(this.associationReference, inlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecordAssociations.associationReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associationType, associationObligationEntitlement, associationReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecordAssociations {\n");
    
    sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
    sb.append("    associationObligationEntitlement: ").append(toIndentedString(associationObligationEntitlement)).append("\n");
    sb.append("    associationReference: ").append(toIndentedString(associationReference)).append("\n");
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

