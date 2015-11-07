/**
 * Created by Shruti on 11/7/15.
 */
public class ChocolateBoiler {

    private static volatile ChocolateBoiler uniqueInstance;

    private ChocolateBoiler()
    {

    }

    public static ChocolateBoiler getInstance()
    {
        if (uniqueInstance == null)
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null)
                    uniqueInstance = new ChocolateBoiler();
            }
         return uniqueInstance;
    }
}
// using volatile means the value of the variable will never be cached locally, all reads and writes go directly to main memory
// using a synchronized statement allows finer access - it uses the class as the lock