package week02;

public class Kav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sunDiameter = 865000;
		double earthDiameter = 7600;
		double earthRadius = earthDiameter /2;
		double sunRadius = sunDiameter / 2;
		//1
		double volumeEarth = (4.0/3.0) * Math.PI * Math.pow(earthRadius, 3);
		System.out.println(volumeEarth);
		//2
		double volumeSun = (4.0/3.0) * Math.PI * Math.pow(sunRadius, 3);
		System.out.println(volumeSun);
	}

}
