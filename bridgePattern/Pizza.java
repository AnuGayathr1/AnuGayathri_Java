package bridgePattern;

public abstract class Pizza {

    protected String sauce;
    protected String toppings;
    protected String crust;

    public abstract void assemble();
    public abstract void qualityCheck();
	public void setCrust(String crust) {
		// TODO Auto-generated method stub
		this.crust=crust;
		
	}
	public void setSauce(String sauce) {
		// TODO Auto-generated method stub
		this.sauce=sauce;
		
	}
	public void setToppings(String toppings) {
		// TODO Auto-generated method stub
		this.toppings=toppings;
	}

}