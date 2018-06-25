package TwoPointers;

public class GuessNumber {
	public static int guessNumber(int n) {
        int low =1;
        int high=n;
        while(low<=high) {
        	int middle=low+(high-low)/2;
        	// low+(high-low)/2 yields same value with(high-low)/2. However, the first expression is less expensive.
        	// in addition low+((high-low)>>1) and (low+high)>>>1 can be used
        	int result=guess(middle);
        	if(result==0) return middle;
            if(result==-1) return middle+1;
            if(result==1) return middle-1;
        }
        return -1;
	}

	private static int guess(int middle) {
		int number = 15;
		if(middle>number) return 1;
		if(middle<number) return -1;
		return 0;
		
	}

}
