public class SalException extends Exception
{
    public SalException(){}
    public SalException(String msg)
    {
        super(msg);
    }
    public SalException(Throwable t)
    {
        super(t);
    }
}
