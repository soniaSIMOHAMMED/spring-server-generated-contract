package io.swagger.infrastructure;

import io.swagger.model.ContractRequest;
import io.swagger.model.dto.ContractEvent;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.function.Function;

/*@Component("contractProducer")
@AllArgsConstructor
public class ContractProducer implements Function<ContractRequest, ContractEvent> {

        @Override
        public ContractEvent apply(ContractRequest contractRequest) {
            var contract = new ContractEvent();
            contract.setContractType(contractRequest.getContractType().name());
            contract.setActivatedAt(contractRequest.getActivatedAt());
            contract.setExpireAt(contract.getExpireAt());
            contract.setStatus(contractRequest.getStatus().name());
            return contract;

        }
}*/
@Service
public class ContractProducer implements Function<ContractRequest, ContractEvent>{
    private static final String TOPIC = "contract";

    @Autowired
    private KafkaTemplate<String, ContractEvent> kafkaTemplate;
    @Override
    public ContractEvent apply(ContractRequest contractRequest) {
        var contract = new ContractEvent();
        contract.setContractType(contractRequest.getContractType().name());
        contract.setCreatedAt(contractRequest.getCreatedAt().toString());
        contract.setSignedAt(contractRequest.getSignedAt().toString());
        contract.setActivatedAt(contractRequest.getActivatedAt().toString());
        contract.setExpireAt(contractRequest.getExpireAt().toString());
        contract.setStatus(contractRequest.getStatus().name());
        return contract;

    }
    public void sendMessage(ContractEvent message){
        this.kafkaTemplate.send(TOPIC, message);
    }

    @Bean
    public NewTopic createTopic(){return new NewTopic(TOPIC, 1,(short) 1);}
}
