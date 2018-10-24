package TVEX;

//인터페이스 개념
// 규격을 정하거나 틀을 만든다고 생각하면 쉽다
public interface TV { 

	public int MIN_VOLUME=0;
	public int MAX_VOLUME=100;
	
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
