package apache.apachekafka.kafka.consumer;


import apache.apachekafka.DTOs.Product;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ConsumerService {


        @KafkaListener(topics = "topic1")
        public void listen(ConsumerRecord< String, Product> record) {
            try {
                // Mesaj işleme kodu
                Product product = record.value();

                log.info("Consumer->"+product.toString());

                // Mesajı işlemek için gerekli kod buraya gelebilir.
            } catch (Exception e) {

                log.info("HATA");
                e.printStackTrace();
            }
        }
}


