package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.BusinessDistributor;
import io.swagger.model.BusinessSubscriber;
import io.swagger.model.ContractRequest;
import io.swagger.model.DeferredBilling;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContractResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-17T18:22:11.279Z[GMT]")


public class ContractResponse   {
  /**
   * External reference of the product
   */
  public enum ProductRefEnum {
    DEFERRED_BILLING("DEFERRED_BILLING");

    private String value;

    ProductRefEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProductRefEnum fromValue(String text) {
      for (ProductRefEnum b : ProductRefEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("productRef")
  private ProductRefEnum productRef = null;

  /**
   * Type of contract
   */
  public enum ContractTypeEnum {
    DEFERRED_BILLING("DEFERRED_BILLING");

    private String value;

    ContractTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContractTypeEnum fromValue(String text) {
      for (ContractTypeEnum b : ContractTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("contractType")
  private ContractTypeEnum contractType = null;

  @JsonProperty("createdAt")
  private LocalDate createdAt = null;

  @JsonProperty("signedAt")
  private LocalDate signedAt = null;

  @JsonProperty("activatedAt")
  private LocalDate activatedAt = null;

  @JsonProperty("expireAt")
  private LocalDate expireAt = null;

  /**
   * Status of contact
   */
  public enum StatusEnum {
    CREATED("CREATED"),
    
    ACTIVE("ACTIVE"),
    
    SUSPENDED("SUSPENDED"),
    
    EXPIRED("EXPIRED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("distributor")
  private BusinessDistributor distributor = null;

  @JsonProperty("subscriber")
  private BusinessSubscriber subscriber = null;

  @JsonProperty("custom")
  private DeferredBilling custom = null;

  public ContractResponse productRef(ProductRefEnum productRef) {
    this.productRef = productRef;
    return this;
  }

  /**
   * External reference of the product
   * @return productRef
   **/
  @Schema(example = "DEFERRED_BILLING", description = "External reference of the product")
  
    public ProductRefEnum getProductRef() {
    return productRef;
  }

  public void setProductRef(ProductRefEnum productRef) {
    this.productRef = productRef;
  }

  public ContractResponse contractType(ContractTypeEnum contractType) {
    this.contractType = contractType;
    return this;
  }

  /**
   * Type of contract
   * @return contractType
   **/
  @Schema(example = "DEFERRED_BILLING", required = true, description = "Type of contract")
      

    public ContractTypeEnum getContractType() {
    return contractType;
  }

  public void setContractType(ContractTypeEnum contractType) {
    this.contractType = contractType;
  }

  public ContractResponse createdAt(LocalDate createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return createdAt
   **/
  @Schema(example = "Fri Apr 22 00:00:00 GMT 2022", required = true, description = "Creation date of contract (use ISO 8601 format YYYY-MM-DD)")
      

    @Valid
    public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public ContractResponse signedAt(LocalDate signedAt) {
    this.signedAt = signedAt;
    return this;
  }

  /**
   * Signed date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return signedAt
   **/
  @Schema(example = "Fri Apr 22 00:00:00 GMT 2022", description = "Signed date of contract (use ISO 8601 format YYYY-MM-DD)")
  
    @Valid
    public LocalDate getSignedAt() {
    return signedAt;
  }

  public void setSignedAt(LocalDate signedAt) {
    this.signedAt = signedAt;
  }

  public ContractResponse activatedAt(LocalDate activatedAt) {
    this.activatedAt = activatedAt;
    return this;
  }

  /**
   * Activation date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return activatedAt
   **/
  @Schema(example = "Sun Apr 24 00:00:00 GMT 2022", required = true, description = "Activation date of contract (use ISO 8601 format YYYY-MM-DD)")
      

    @Valid
    public LocalDate getActivatedAt() {
    return activatedAt;
  }

  public void setActivatedAt(LocalDate activatedAt) {
    this.activatedAt = activatedAt;
  }

  public ContractResponse expireAt(LocalDate expireAt) {
    this.expireAt = expireAt;
    return this;
  }

  /**
   * Expiration date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return expireAt
   **/
  @Schema(example = "Sat Apr 01 00:00:00 GMT 2023", required = true, description = "Expiration date of contract (use ISO 8601 format YYYY-MM-DD)")
      

    @Valid
    public LocalDate getExpireAt() {
    return expireAt;
  }

  public void setExpireAt(LocalDate expireAt) {
    this.expireAt = expireAt;
  }

  public ContractResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of contact
   * @return status
   **/
  @Schema(example = "ACTIVE", required = true, description = "Status of contact")
      

    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ContractResponse distributor(BusinessDistributor distributor) {
    this.distributor = distributor;
    return this;
  }

  /**
   * Get distributor
   * @return distributor
   **/
  @Schema(required = true, description = "")
      

    @Valid
    public BusinessDistributor getDistributor() {
    return distributor;
  }

  public void setDistributor(BusinessDistributor distributor) {
    this.distributor = distributor;
  }

  public ContractResponse subscriber(BusinessSubscriber subscriber) {
    this.subscriber = subscriber;
    return this;
  }

  /**
   * Get subscriber
   * @return subscriber
   **/
  @Schema(required = true, description = "")
      

    @Valid
    public BusinessSubscriber getSubscriber() {
    return subscriber;
  }

  public void setSubscriber(BusinessSubscriber subscriber) {
    this.subscriber = subscriber;
  }

  public ContractResponse custom(DeferredBilling custom) {
    this.custom = custom;
    return this;
  }

  /**
   * Get custom
   * @return custom
   **/
  @Schema(description = "")
  
    @Valid
    public DeferredBilling getCustom() {
    return custom;
  }

  public void setCustom(DeferredBilling custom) {
    this.custom = custom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractResponse contractResponse = (ContractResponse) o;
    return Objects.equals(this.productRef, contractResponse.productRef) &&
        Objects.equals(this.contractType, contractResponse.contractType) &&
        Objects.equals(this.createdAt, contractResponse.createdAt) &&
        Objects.equals(this.signedAt, contractResponse.signedAt) &&
        Objects.equals(this.activatedAt, contractResponse.activatedAt) &&
        Objects.equals(this.expireAt, contractResponse.expireAt) &&
        Objects.equals(this.status, contractResponse.status) &&
        Objects.equals(this.distributor, contractResponse.distributor) &&
        Objects.equals(this.subscriber, contractResponse.subscriber) &&
        Objects.equals(this.custom, contractResponse.custom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productRef, contractType, createdAt, signedAt, activatedAt, expireAt, status, distributor, subscriber, custom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractResponse {\n");
    
    sb.append("    productRef: ").append(toIndentedString(productRef)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    signedAt: ").append(toIndentedString(signedAt)).append("\n");
    sb.append("    activatedAt: ").append(toIndentedString(activatedAt)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    distributor: ").append(toIndentedString(distributor)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
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
