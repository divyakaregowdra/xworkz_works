package casting.boot;

import casting.app.Brand;
import casting.app.DuplicateBrand;
import casting.app.InternationalBrand;
import casting.app.LocalBrand;
import casting.app.NationalBrand;
import casting.app.util.BrandUtil;

public class BrandRunner {
	public static void main(String[] args) {
		Brand brand = new Brand();
		System.out.println(brand.brandOriginYear);

		LocalBrand localBrand = new LocalBrand();
		System.out.println(localBrand.localBrandPrice);

		DuplicateBrand duplicateBrand = new DuplicateBrand();
		System.out.println(duplicateBrand.gstNumber);

		NationalBrand nationalBrand = new NationalBrand();
		System.out.println(nationalBrand.nationalBrandName);

		InternationalBrand internationalBrand = new InternationalBrand();
		System.out.println(internationalBrand.Price);

		BrandUtil brandUtil = new BrandUtil();
		brandUtil.brandUtilMethod(brand);
		brandUtil.brandUtilMethod(localBrand);
		brandUtil.brandUtilMethod(duplicateBrand);
		brandUtil.brandUtilMethod(nationalBrand);
		brandUtil.brandUtilMethod(internationalBrand);
	}

}
