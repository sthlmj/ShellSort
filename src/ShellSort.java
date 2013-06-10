/* 
 * ShellSort
 * Labb 1 Uppgift 9
 * 
 * Beskriv med ord och illustrera med exempel heltal sortering shellsort.
 *  
 */


import java.util.Arrays;

public class ShellSort 
{
    public static void main(String []args) 
    {
    	/**
    	 * Make an array and prints array representaion
    	 */
        int[] array = {111,3,5,7,8,0,2,4,6};	//array here
        System.out.println( Arrays.toString(array) ); 
        System.out.println( Arrays.toString(shellSort(array)) );
    }
    /**
     * Static shared method
     */
    public static int[] shellSort(int[] array)
    {
        int gap = 1;
        int i;
    	/**
    	 * Do an insertion sort for each gap size.  
    	 */
        for (i = gap; i < array.length; i += 1)
        {
        	int tmp = array[i];
        	int j = i;
        	for (j = i; j >= gap && array[j - gap] > tmp; j -= gap)
        	{
        		array[j] = array[j - gap];
        	}
        	array[j] = tmp;        	
        }
        
        /**
        * all sets gap-sorted, now decrease set size
        */
        gap = gap / 3;
        return array;
    }
}



/********************************OUTPUT****************************************
 *  

	[111, 3, 5, 7, 8, 0, 2, 4, 6]
	[0, 2, 3, 4, 5, 6, 7, 8, 111]


 */