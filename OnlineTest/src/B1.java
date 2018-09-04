
public class B1 {
	static   int i = 0;
    public int aMethod()
    {
    	
    	i++;
        return i;
    }
    public static void main(String args[])
    {
        Test test = new Test();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
}
