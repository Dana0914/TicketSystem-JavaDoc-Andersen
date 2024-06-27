package validator;

import java.math.BigDecimal;

public class Validator {

    public BigDecimal validateByPrice(BigDecimal price) {
        if (price.compareTo(new BigDecimal(0)) < 0) {
            System.out.println("The price is less than or equal to 0");
        }
        return price;
    }
    public String validateById(String id) {
        String regex = "[0-9]{4}";
        if (id.matches(regex)) {
            return id;
        }
        return "The id is not valid";
    }
}
