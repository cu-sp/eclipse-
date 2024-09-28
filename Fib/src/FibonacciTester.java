
public class FibonacciTester{

	public static void main(String[] args) {
		if(args.length < 2)
		{
            throw new IllegalArgumentException("Two arguments required: maxInput and maxTime.");
        }
		
		int maxInput = Integer.parseInt(args[0]);
		int maxTime = Integer.parseInt(args[1]);
		
		for(int i = 0; i <= maxInput; i++) // rec
		{
			long startTime, endTime, timeTaken;
			startTime = System.currentTimeMillis();
			long result = fibRecursive(i);
			endTime = System.currentTimeMillis();
			timeTaken = endTime - startTime;
			System.out.println("RECURSE\t" + i + "\t" + result + "\t" + timeTaken);
			if (timeTaken > maxTime) break;
		}
		
		for (int n = 0; n <= maxInput; n++) //dyn
		{
            long startTime, endTime, timeTaken;
            startTime = System.currentTimeMillis();
            long result = fibDynamic(n);
            endTime = System.currentTimeMillis();
            timeTaken = endTime - startTime;
            System.out.println("DYNAMIC\t" + n + "\t" + result + "\t" + timeTaken);
            if (timeTaken > maxTime) break;
        }
		
		for (int n = 0; n <= maxInput; n++) //closed 
		{
            long startTime, endTime, timeTaken;
            startTime = System.currentTimeMillis();
            long result = fibClosedForm(n);
            endTime = System.currentTimeMillis();
            timeTaken = endTime - startTime;
            System.out.println("FORMULA\t" + n + "\t" + result + "\t" + timeTaken);
            if (timeTaken > maxTime) break;
        }
	}
	
	public static long fibRecursive(int i)
	{
		if(i == 0) return 0;
		if(i == 1) return 1;
		return fibRecursive(i-1) + fibRecursive(i-2);
	}
	
	public static long fibDynamic(int n)
	{
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		long[] fib = new long[n + 1];
		fib[0] = 0;
		fib[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib[n];
	}
	
	public static long fibClosedForm(int n) {
	    final double goldenRatio = (1 + Math.sqrt(5)) / 2;
	    return (long) ((Math.pow(goldenRatio, n) - Math.pow(-goldenRatio, -n)) / Math.sqrt(5)); //Uses the golden ratio to compute fib numbers.
	}
	

}
