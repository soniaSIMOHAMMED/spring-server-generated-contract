package io.swagger.service;

import io.swagger.model.ContractRequest;

import java.util.List;

public interface ContractService {

    List<ContractRequest> getContracts();
    ContractRequest createContract(ContractRequest contractRequest);

}
