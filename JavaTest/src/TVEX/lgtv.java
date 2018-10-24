package TVEX;

public class lgtv implements TV {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("볼륨켜짐");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("볼륨꺼짐");
		
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("볼륨"+volume+"조정됨");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("채널"+channel+"로"+' '+"변경됨");
	}

	
}
