package io.swagger.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BillingEvent {
    @JsonProperty("subscriptionType")
    String subscriptionType;

    @JsonProperty("contractId")
    private Integer contractId = null;
    
   @JsonProperty("contractRef")
    private String contractRef = null;

    @JsonProperty("createdAt")
    private String createdAt = null;

    @JsonProperty("activatedAt")
    private String activatedAt = null;

    @JsonProperty("expireAt")
    private String expireAt = null;

    @JsonProperty("seller")
    private String sellerRef = null;


}
