
public class Foerderantrag {
		// TODO Auto-generated constructor stub
		
		private boolean status;
		private String name;
		private float sum;
		private String date;
		private String area;
		private String paymentRhythem;
		
		public Foerderantrag(boolean status, String name, float sum, String date, 
				String area, String paymentRhythem) {
			
			// TODO Auto-generated constructor stub
			this.status = status;
			this.name = name;
			this.sum = sum;
			this.date = date;
			this.area = area;
			this.paymentRhythem = paymentRhythem;
		}

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getSum() {
			return sum;
		}

		public void setSum(float sum) {
			this.sum = sum;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getArea() {
			return area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getPaymentRhythem() {
			return paymentRhythem;
		}

		public void setPaymentRhythem(String paymentRhythem) {
			this.paymentRhythem = paymentRhythem;
		}
		

		
	}



