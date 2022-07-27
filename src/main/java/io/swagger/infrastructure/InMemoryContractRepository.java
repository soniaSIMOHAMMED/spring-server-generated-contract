package io.swagger.infrastructure;

import io.swagger.model.ContractRequest;
import io.swagger.model.ContractResponse;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryContractRepository implements ContractRepository{

    List<ContractRequest> contracts = new ArrayList<>();

    @Override
    public List<ContractRequest> getContracts() {
        return new ArrayList<ContractRequest>(contracts);
    }



    @Override
    public ContractRequest createContract(ContractRequest contractRequest) {
        contracts.add(contractRequest);
        return contractRequest;
    }





}
