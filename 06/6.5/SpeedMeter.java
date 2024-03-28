public abstract class SpeedMeter
{
	private double turnRate;
	public SpeedMeter() {}
	public abstract double calGirth();
	public void setTurnRate(double turnRate)
	{
		this.turnRate = turnRate;	
	}
	public double getSpeed()
	{
		return calGirth() * turnRate;
	}
}
