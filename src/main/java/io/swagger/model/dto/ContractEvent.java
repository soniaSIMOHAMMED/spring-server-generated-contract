package io.swagger.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.threeten.bp.LocalDate;

@Data
public class ContractEvent {
    @JsonProperty("contractType")
    private String contractType = null;

    @JsonProperty("createdAt")
    private LocalDate createdAt = null;

    @JsonProperty("signedAt")
    private LocalDate signedAt = null;

    @JsonProperty("activatedAt")
    private LocalDate activatedAt = null;

    @JsonProperty("expireAt")
    private LocalDate expireAt = null;

    @JsonProperty("status")
    private String status = null;
}
