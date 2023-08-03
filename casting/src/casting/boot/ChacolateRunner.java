package casting.boot;

import casting.app.CaramelChocolate;
import casting.app.Chacolate;
import casting.app.DarkChacolate;
import casting.app.util.ChacolateUtil;

public class ChacolateRunner {
	public static void main(String[] args) {
		ChacolateUtil chacolateUtil = new ChacolateUtil();

		Chacolate chacolate = new Chacolate();
		System.out.println(chacolate.chacolateName);
		chacolateUtil.chacolateUtilMethod(chacolate);

		DarkChacolate darkChacolate = new DarkChacolate();
		System.out.println(darkChacolate.darkChacolateMinerals);
		chacolateUtil.chacolateUtilMethod(darkChacolate);

		CaramelChocolate caramelChacolate = new CaramelChocolate();
		System.out.println(caramelChacolate.mixedWith);
		chacolateUtil.chacolateUtilMethod(caramelChacolate);

	}


}
