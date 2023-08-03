package casting.app.util;

import casting.app.Brand;
import casting.app.DuplicateBrand;
import casting.app.InternationalBrand;
import casting.app.LocalBrand;
import casting.app.NationalBrand;

public class BrandUtil extends Brand {
		public void brandUtilMethod(Brand brand) {
			Brand brand2 = new Brand();
			brand2.brand();

			if (brand instanceof LocalBrand) {
				Brand brand3 = new LocalBrand();
				brand3.brand();

				LocalBrand localBrand = (LocalBrand) brand3;
				localBrand.localBrand();
			}

			if (brand instanceof NationalBrand) {
				Brand brand4 = new NationalBrand();
				brand4.brand();

				NationalBrand nationalBrand = (NationalBrand) brand4;
				nationalBrand.nationalBrand();
			}

			if (brand instanceof DuplicateBrand) {
				Brand brand5 = new DuplicateBrand();
				brand5.brand();

				DuplicateBrand duplicateBrand = (DuplicateBrand) brand5;
				duplicateBrand.duplicateBrand();
			}

			if (brand instanceof InternationalBrand) {
				Brand brand6 = new InternationalBrand();
				brand6.brand();

				InternationalBrand internationalBrand = (InternationalBrand) brand6;
				internationalBrand.interNationalBrand();
			}

		}
	}


