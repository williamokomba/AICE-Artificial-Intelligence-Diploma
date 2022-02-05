public class Synapse
{
    //feature
    private double weight;
    private double deltaWeight;
    
    //methods
    public double getWeight ( )
    {
        return weight;
    }
    public double getDeltaWeight ( )
    {
        return deltaWeight;
    }
    
    
    public void setDeltaWeight ( double value )
    {
        deltaWeight = value;
    }
    
    public void setWeight ( double value )
    {
        weight = value;
    }
}