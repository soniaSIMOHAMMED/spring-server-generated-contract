package io.swagger.infrastructure;

import io.swagger.model.ContractRequest;
import io.swagger.model.ContractResponse;

import java.util.List;

public interface ContractRepository {

    List<ContractRequest> getContracts();
    ContractRequest createContract(ContractRequest contractRequest);
}
