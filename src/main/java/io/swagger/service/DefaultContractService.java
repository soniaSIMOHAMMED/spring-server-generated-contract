package io.swagger.service;

import io.swagger.infrastructure.ContractRepository;
import io.swagger.model.ContractRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultContractService implements ContractService{

    ContractRepository contractRepository;

    public DefaultContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @Override
    public List<ContractRequest> getContracts() {
        return contractRepository.getContracts();
    }

    @Override
    public ContractRequest createContract(ContractRequest contractRequest) {
        return contractRepository.createContract(contractRequest);
    }
}
