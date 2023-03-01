package Exercise4;

public class FactoryDemo {
	public static void main(String[] args) throws Exception {
		shoeShop shop=SpringFrameWork.getShop();
		System.out.println(shop.sellShoe(new Customer()));
	}
}
class SpringFrameWork{
	public static shoeShop getShop() throws Exception{
		String factoryclassname="Pattern.BataShoeFactory";
		String shopclassname="Pattern.AnuShoeShop";
		shoeFactory factory=(shoeFactory) Class.forName(factoryclassname).getConstructor().newInstance();
		shoeShop shop=(shoeShop) Class.forName(shopclassname).getConstructor().newInstance();
		shop.setFactory(factory);
		return shop;
	}
}
interface shoeManufacturer{
	public Shoe makeShoe();
}
abstract class Shoe{
	
}
class LeatherShoe extends Shoe{
	
}
class SportsShoe extends Shoe{
	
}
interface shoeSeller{
	public Shoe sellShoe(Customer customer);
}
class Customer{
	
}
abstract class shoeFactory implements shoeManufacturer{
	public abstract Shoe makeShoe();
}
class BataShoeFactory extends shoeFactory{
	public BataShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe makeShoe() {
		// TODO Auto-generated method stub
		return new LeatherShoe();
	}
}
class LakhaniShoeFactory extends shoeFactory{
	public LakhaniShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe makeShoe() {
		// TODO Auto-generated method stub
		return new SportsShoe();
	}
}
abstract class shoeShop implements shoeSeller{
	private shoeFactory factory;
	public void setFactory(shoeFactory factory) {
		this.factory=factory;
	}
	public shoeFactory getFactory() {
		return this.factory;
	}
	public abstract Shoe sellShoe(Customer customer);
}
class AnuShoeShop extends shoeShop{
	public AnuShoeShop() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe sellShoe(Customer customer) {
		// TODO Auto-generated method stub
		return getFactory().makeShoe();
	}
}
class GayathriShoeShop extends shoeShop{
	public GayathriShoeShop() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Shoe sellShoe(Customer customer) {
		// TODO Auto-generated method stub
		return getFactory().makeShoe();
	}
}