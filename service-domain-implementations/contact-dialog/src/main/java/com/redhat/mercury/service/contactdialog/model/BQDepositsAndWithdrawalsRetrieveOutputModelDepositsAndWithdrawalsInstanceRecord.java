package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction;
import com.redhat.mercury.service.contactdialog.model.InlineResponse20017DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord   {
  @JsonProperty("depositType")
  private String depositType;

  @JsonProperty("withdrawalType")
  private String withdrawalType;

  @JsonProperty("accountLimitBreachResponse")
  private String accountLimitBreachResponse;

  @JsonProperty("depositTransaction")
  private InlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction;

  @JsonProperty("withdrawalTransaction")
  private InlineResponse20017DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction;

  public BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord depositType(String depositType) {
    this.depositType = depositType;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5_m2sTGEeChad0JzLk7QA_-2008690148/elements/_E6IwwMTGEeChad0JzLk7QA_1495654231  bian-reference: DepositServicet.DepositType  general-info: The type of deposit transaction that can be applied to the account (e.g. customer deposit, internal credit) 
   * @return depositType
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5_m2sTGEeChad0JzLk7QA_-2008690148/elements/_E6IwwMTGEeChad0JzLk7QA_1495654231  bian-reference: DepositServicet.DepositType  general-info: The type of deposit transaction that can be applied to the account (e.g. customer deposit, internal credit) ")


  public String getDepositType() {
    return depositType;
  }

  public void setDepositType(String depositType) {
    this.depositType = depositType;
  }

  public BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord withdrawalType(String withdrawalType) {
    this.withdrawalType = withdrawalType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of withdrawal transaction that can be applied to the account (e.g. customer withdrawal, internal service charge, disbursement) 
   * @return withdrawalType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of withdrawal transaction that can be applied to the account (e.g. customer withdrawal, internal service charge, disbursement) ")


  public String getWithdrawalType() {
    return withdrawalType;
  }

  public void setWithdrawalType(String withdrawalType) {
    this.withdrawalType = withdrawalType;
  }

  public BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord accountLimitBreachResponse(String accountLimitBreachResponse) {
    this.accountLimitBreachResponse = accountLimitBreachResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The handling options if a withdrawal results in a breach of an account limit 
   * @return accountLimitBreachResponse
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The handling options if a withdrawal results in a breach of an account limit ")


  public String getAccountLimitBreachResponse() {
    return accountLimitBreachResponse;
  }

  public void setAccountLimitBreachResponse(String accountLimitBreachResponse) {
    this.accountLimitBreachResponse = accountLimitBreachResponse;
  }

  public BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord depositTransaction(InlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction) {
    this.depositTransaction = depositTransaction;
    return this;
  }

  /**
   * Get depositTransaction
   * @return depositTransaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction getDepositTransaction() {
    return depositTransaction;
  }

  public void setDepositTransaction(InlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction) {
    this.depositTransaction = depositTransaction;
  }

  public BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord withdrawalTransaction(InlineResponse20017DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
    return this;
  }

  /**
   * Get withdrawalTransaction
   * @return withdrawalTransaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20017DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction getWithdrawalTransaction() {
    return withdrawalTransaction;
  }

  public void setWithdrawalTransaction(InlineResponse20017DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord bqDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord = (BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord) o;
    return Objects.equals(this.depositType, bqDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord.depositType) &&
        Objects.equals(this.withdrawalType, bqDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord.withdrawalType) &&
        Objects.equals(this.accountLimitBreachResponse, bqDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord.accountLimitBreachResponse) &&
        Objects.equals(this.depositTransaction, bqDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord.depositTransaction) &&
        Objects.equals(this.withdrawalTransaction, bqDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord.withdrawalTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositType, withdrawalType, accountLimitBreachResponse, depositTransaction, withdrawalTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord {\n");
    
    sb.append("    depositType: ").append(toIndentedString(depositType)).append("\n");
    sb.append("    withdrawalType: ").append(toIndentedString(withdrawalType)).append("\n");
    sb.append("    accountLimitBreachResponse: ").append(toIndentedString(accountLimitBreachResponse)).append("\n");
    sb.append("    depositTransaction: ").append(toIndentedString(depositTransaction)).append("\n");
    sb.append("    withdrawalTransaction: ").append(toIndentedString(withdrawalTransaction)).append("\n");
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

