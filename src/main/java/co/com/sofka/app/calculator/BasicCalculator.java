package calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }
    public Long substract(Long number1, Long number2) {
        logger.info( "Substracting {} + {}", number1, number2 );
        return number1 - number2;
    }

    public Long mutiply(Long number1, Long number2) {
        logger.info( "Multiplying {} + {}", number1, number2 );
        return number1 * number2;
    }

    public Long divide(Long number1, Long number2) {
        logger.info( "Dividing {} + {}", number1, number2 );
        return number2!=0 ? number1 / number2 : 0;
    }

}
