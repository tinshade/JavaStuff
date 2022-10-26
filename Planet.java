class Planet {
	void revolve(int n){
		System.out.println("Revolved "+n+" times");
	}
	public static void main(String[] args){
		Planet earth = new Planet();
		earth.revolve(10);
	}
}
