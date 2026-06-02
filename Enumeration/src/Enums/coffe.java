package Enums;

public enum coffe {

	 big(300,500),small(150,200),medium(200,210);
			private int size;
			private int cost;
			
			
			coffe(int i, int j) {
				// TODO Auto-generated constructor stub
			}
			private void Coffe(int size, int cost) {
				System.out.println("in coffee constructor"+size+"-----"+cost);
				this.size = size;
				this.cost = cost;
			}
			public int getSize() {
				return size;
			}
			
			public int getCost() {
				return cost;
			}
			
			
			
			
		}



