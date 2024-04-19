package apache.apachekafka.API;


import apache.apachekafka.DTOs.Product;
import apache.apachekafka.kafka.producer.ProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
public class MessageController {

    private final ProducerService producerService;

    public MessageController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping
    public String sendMessage(@RequestBody Product message) {
        producerService.sendMessage(message);
        return "Message sent!";
    }
}
