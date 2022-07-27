package io.swagger.infrastructure;

import io.swagger.model.dto.BillingEvent;
import io.swagger.model.dto.ContractEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BillingConsumer {

        @KafkaListener(topics = "billing", groupId = "billing_id")
        public void consumeMessage(BillingEvent message){
            System.out.println(message);
        }

}

