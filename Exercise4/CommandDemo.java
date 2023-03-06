package Exercise4;
import java.util.*;
public class CommandDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UniversalRemote ur=new UniversalRemote();
		TV tv=new TV();
		SetTopBox stb=new SetTopBox();
		SoundSystem ss=new SoundSystem();
		VGame vg=new VGame();
		
		TVCommand serialCommand=new SerialChannelCommand(tv,stb,ss,vg);
		TVCommand newsCommand=new NewsChannelCommand(tv,stb,ss,vg);
		TVCommand ttgame=new TTGameCommand(tv,stb,ss,vg);
		ur.assignCommand(1,ttgame);
		ur.assignCommand(2,newsCommand);
		ur.assignCommand(3,serialCommand);
		int n=sc.nextInt();
		ur.executeCommand(n);
		
	}
}
class UniversalRemote{
	TVCommand c[]=new TVCommand[5];
	public UniversalRemote() {
		// TODO Auto-generated constructor stub
		for(int i=0;i<5;i++)
			c[i]=new DummyCommand();
		
	}
	public void assignCommand(int slot, TVCommand command) {
		c[slot]=command;
	}
	public void executeCommand(int slot) {
		c[slot].execute();
	}
}
abstract class TVCommand{
	TV tv;
	SetTopBox stb;
	SoundSystem ss;
	VGame vg;
	public TVCommand() {
		// TODO Auto-generated constructor stub
	}
	public TVCommand(TV tv, SetTopBox stb, SoundSystem ss, VGame vg) {
		this.tv=tv;
		this.stb=stb;
		this.ss=ss;
		this.vg=vg;
	}
	public abstract void execute();
}
class DummyCommand extends TVCommand{
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("I am a dummy command...yet to be assigned...");
	}
}
class NewsChannelCommand extends TVCommand{
	public NewsChannelCommand(TV tv, SetTopBox stb, SoundSystem ss, VGame vg) {
		// TODO Auto-generated constructor stub
		super(tv,stb,ss,vg);
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("News Channel command activated...");
		tv.av1();
		stb.newsCommand();
		ss.increaseVolume();
		System.out.println("Enjoy the news channel...");
	}
}
class SerialChannelCommand extends TVCommand{
	public SerialChannelCommand(TV tv, SetTopBox stb, SoundSystem ss, VGame vg) {
		// TODO Auto-generated constructor stub
		super(tv,stb,ss,vg);
		
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Serial Channel command activated...");
		tv.av1();
		stb.serialCommand();
		ss.increaseVolume();
		System.out.println("Enjoy the serial channel...");
	}
}
class TTGameCommand extends TVCommand{
	public TTGameCommand(TV tv, SetTopBox stb, SoundSystem ss, VGame vg) {
		// TODO Auto-generated constructor stub
		super(tv,stb,ss,vg);
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("TTGame command activated...");
		tv.av2();
		ss.decreaseVolume();
		vg.TTGame();
		System.out.println("Enjoy the TTgame...");
	}
}
class TV{
	public void av1() {
		System.out.println("av1 mode activated...");
	}
	public void av2() {
		System.out.println("av2 mode activated...");
	}
}
class SetTopBox{
	public void serialCommand() {
		System.out.println("changed to serial channel...");
	}
	public void newsCommand() {
		System.out.println("changed to news channel...");
	}
}
class SoundSystem{
	public void increaseVolume() {
		System.out.println("Volume is increased...");
	}
	public void decreaseVolume() {
		System.out.println("Volume is decreased...");
	}
}
class VGame{
	public void TTGame() {
		System.out.println("Changed to TTGame...");
	}
	public void Snooker() {
		System.out.println("Changed to Snooker...");
	}
}