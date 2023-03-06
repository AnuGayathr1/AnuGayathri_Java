package Exercise4;

public class BuilderPatternDemo {
public static void main(String[] args) {
	Computer mycomputer=new Computer.BuildComputer().setRam("800gb ram").setHardDisk("1000 tb").
			setSSD("20million tb ssd hd").setVGACard("full graphics...").build();
;
	System.out.println(mycomputer);
}
}
class Computer{
	class Cabinet{
		String motherboard, ram, harddisk, ssd, vgacard;
		public Cabinet(String motherboard, String ram, String harddisk, String ssd, String vgacard) {
			// TODO Auto-generated constructor stub
			this.motherboard=motherboard;
			this.ram=ram;
			this.harddisk=harddisk;
			this.ssd=ssd;
			this.vgacard=vgacard;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Cabinet[motherboard: "+motherboard+", ram: "+ram+" harddisk: "+
					harddisk+" ssd: "+ssd+" ,vgacard: "+vgacard+"]";
		}
	}
	Cabinet c;
	String brand;
	public Computer(BuildComputer bc) {
		// TODO Auto-generated constructor stub
		c=new Cabinet(bc.motherboard, bc.ram, bc.harddisk, bc.ssd, bc.vgacard);
		brand="java";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Computer[c="+c+"brand="+brand+"]";
	}
static class BuildComputer{
	String motherboard, ram,harddisk, ssd, vgacard;
	public BuildComputer setMotherBoard(String motherboard){
		this.motherboard=motherboard;
		return this;
	}
	public BuildComputer setRam(String ram){
		this.ram=ram;
		return this;
	}
	public BuildComputer setHardDisk(String harddisk){
		this.harddisk=harddisk;
		return this;
	}
	public BuildComputer setSSD(String ssd){
		this.ssd=ssd;
		return this;
	}
	public BuildComputer setVGACard(String vgacard){
		this.vgacard=vgacard;
		return this;
	}
	public Computer build() {
		return new Computer(this);
	}
}
}