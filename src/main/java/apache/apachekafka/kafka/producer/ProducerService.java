package apache.apachekafka.kafka.producer;

import apache.apachekafka.DTOs.Product;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
@Slf4j
@ToString
public class ProducerService {

    private final KafkaTemplate<String, Product> kafkaTemplate;

    @Value("${kafka.topic}")
    private String topic;

    public ProducerService(KafkaTemplate<String, Product> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    public void sendMessage(Product message) {
        this.kafkaTemplate.send(topic, message);
        log.info(String.format("Produced message -> %s", message));
    }


}
