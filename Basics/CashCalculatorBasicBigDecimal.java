import java.math.BigDecimal;
import java.math.MathContext;

public class CashCalculatorBasicBigDecimal {

	public BigDecimal getCalculatedAvailableBalance(BigDecimal currentBalance, BigDecimal totalDebits, BigDecimal totalCredits) {

		// note that BigDecimal is used mainly when precision and money matters. They are slower than double,
		// but it dosen't round off the decimals. Thus when dealing with money, BigDecimal	

		BigDecimal result = currentBalance.subtract(totalDebits).add(totalCredits);

		// when BigDecimal numbers are not included in the "", they give decimals upto 15 digits,
    	// thus MathContext rounds it for them
    	MathContext mc = new MathContext(7);

		result = result.round(mc);

		System.out.println("The calculated result is " + result);

		return result;

  	}

	public static void main(String[] args) {

    	new CashCalculatorBasic().getCalculatedAvailableBalance(new BigDecimal("1250.56"), new BigDecimal("250.13"), new BigDecimal("500.78"));
    }

} 