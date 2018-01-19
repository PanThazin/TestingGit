class Alpha
{ 
	Alpha()
    {
        System.out.print("Alpha");
    }
} 
public class Base extends Alpha
{ 
    public static void main(String[] args)
    { 
        new Base(); /* Line 12 */
        new Alpha(); /* Line 13 */
    } 
}
