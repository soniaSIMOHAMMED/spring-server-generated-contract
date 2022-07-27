package io.swagger.infrastructure;

import io.swagger.model.ContractRequest;

import java.util.List;

public interface ContractRepository {

    List<ContractRequest> getContracts();
    ContractRequest createContract(ContractRequest contractRequest);
}
