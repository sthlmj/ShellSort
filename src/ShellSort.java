import java.util.Arrays;

public class ShellSort 
{
	//main program
    public static void main(String []args) 
    {
        int[] a = {1,3,5,7,8,0,2,4,6}; //use random for next version.
        System.out.println( Arrays.toString(a) );
        System.out.println( Arrays.toString(shellSort(a)) );
    }

    //Shell sort method algorithm associated with the whole class 
    public static int[] shellSort(int[] array)
    {
        int h = 1;
        while (h < array.length) h = 3*h + 1;
        while (h > 0)
        {
            h = h/3;
            for (int k = 0; k < h; k++)
            {
                for (int i = h+k; i < array.length; i+=h)
                {
                    int key = array[i];
                    int j = i-h;
                    while (j>=0 && array[j] > key)
                    {
                        array[j+h] = array[j];
                        j-=h;
                    }
                    array[j+h] = key;
                    //-> invariant: array[0,h,2*h..j] is sorted
                }
            }
            //->invariant: each h-sub-array is sorted
        }
        return array;
    };
}