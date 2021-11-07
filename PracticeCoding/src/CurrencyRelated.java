import java.text.NumberFormat;

public class CurrencyRelated {
	
	public String getCurrencyFormatWithSysmbol(double payment, Locale countryCurrencyName) {
		String currencyFormatted = "";

		if (countryCurrencyName.equals(Locale.US)) {
			currencyFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		}

		if (countryCurrencyName.equals(new Locale("en", "IN"))) {
			currencyFormatted = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
		}

		if (countryCurrencyName.equals(Locale.CHINA)) {
			currencyFormatted = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		}

		if (countryCurrencyName.equals(Locale.FRANCE)) {
			currencyFormatted = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		}

		return currencyFormatted;
	}
}
