package apache.apachekafka.DTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {

    private String name;
    private String description;
    private int price;
    private int quantity;
}
