package casting.app.util;

import casting.app.CaramelChocolate;
import casting.app.Chacolate;
import casting.app.DarkChacolate;

public class ChacolateUtil extends Chacolate {
		public void chacolateUtilMethod(Chacolate chacolate) {
			Chacolate chacolate2 = new Chacolate();
			chacolate2.chacolate();

			if (chacolate instanceof DarkChacolate) {
				Chacolate chacolate3 = new DarkChacolate();
				DarkChacolate darkChacolate = (DarkChacolate) chacolate3;
				darkChacolate.darkChacolteMethod();
			}

			if (chacolate instanceof CaramelChocolate) {
				Chacolate chacolate4 = new CaramelChocolate();
				CaramelChocolate caramelChacolate = (CaramelChocolate) chacolate4;
				caramelChacolate.caramelChacolateMethod();
			}
		}

}
