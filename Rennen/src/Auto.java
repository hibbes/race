import java.util.Random;

public class Auto {
     
	int nummer;
	double vmax;
	double speed;
	double capacity;
	double consumption;
	double energy_remaining;
	double failure;

public Auto(int nummer, double vmax, double capacity, double consumption){
	this.nummer = nummer;
	this.vmax = vmax;
	this.capacity = capacity;
	this.consumption = consumption;
	this.energy_remaining = this.capacity;
	this.speed = this.vmax;
	
}
	

public double fahren(double racelength, int round){
	Random random = new Random();
	
	double range=(capacity/consumption)*100;
	System.out.println("Range: "+range);
	
	double stops= Math.ceil(racelength/range);
	
	System.out.println("stops: "+stops);
	
	double stoptime = 21 + capacity + random.nextInt((int)stops*3);
	
	System.out.println("stoptime: "+stoptime);
	
	double failure = failure(); 
	
	System.out.println("failure: "+failure);
	
	speed= failure;
	
	System.out.println("speed: "+speed);
	
	double time=((racelength/speed)*3600)+(stoptime*stops);
	
	return time;
			
				
	
	
	
}


public double failure(){
	
	Random random = new Random();
	int failure = random.nextInt(10);
	return vmax-failure;
}

public void aufladen(){
	energy_remaining = capacity;
	speed = speed-80;
	}

public String toString(){
	return "Startnummer: "+nummer+
			"\n Vmax: "+vmax+
			"\n Derzeitige Durchschnittsgeschwindigkeit: "+speed+
			"\n Akkukapazität: "+capacity+
			"\n Restenergie: "+energy_remaining+
			"\n Verbrauch auf 100km: "+consumption; 
	}

}