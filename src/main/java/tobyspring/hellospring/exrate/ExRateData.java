package tobyspring.hellospring.exrate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @JsonIgnoreProperties(ignoreUnknown=true)
 * json 안에 없는게 있어도 무시함
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public record ExRateData(String result, Map<String, BigDecimal> rates) {
}
