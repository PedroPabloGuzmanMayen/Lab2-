
public class Tiempo_C {
	private int hora;
	private int minuto;
	private int segundo;
	
	public void setHoras(int hora) {
		this.hora=hora;
	}
	public void setMinutos(int minuto) {
		this.minuto=minuto;
	}
	public void setSegundos(int segundo) {
		this.segundo=segundo;
	}
	
	public int getHora() {
		return hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	
	public void Conversion() {
		segundo++;
		if (segundo>59) {
			segundo=0;
			minuto++;
			if (minuto>59) {
				minuto=0;
				hora++;
				if (hora>59) {
					hora=0;	
				}
			}
		}
	}
}
