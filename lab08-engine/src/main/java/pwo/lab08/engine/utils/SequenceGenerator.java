package pwo.utils;

import java.math.BigDecimal;

/**
 *
 * @author Darya Benedziktovich
 */
public interface SequenceGenerator {

    void reset();

    BigDecimal nextTerm();

    BigDecimal getTerm(int i);
}
