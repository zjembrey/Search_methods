/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 *
 * @author user
 */
public class MySearch 
{
    
    public static int binarySearch(MyVector vec,Comparable target)
    {
        int lowVal = 0;
        int highVal = vec.size();
        int middle;
        
        while(lowVal <= highVal)
        {
            middle = lowVal + (highVal-lowVal)/2;
            if((int)target < (int)vec.elementAt(middle))
            {
                highVal = middle-1;
            }
            else if((int)target > (int)vec.elementAt(middle))
            {
                lowVal = middle+1;
            }
            else
            {
                return middle;
            }    
        }
        System.out.println("The requested Value is not in this list");
        return -1;
    }
    
    
    public static int linearSearchSorted(MyVector vec,Comparable target)
    {
        for(int x = 0;x<vec.size();x++)
        {
            if((int)vec.elementAt(x) == (int)target)
            {
                return x;
            }
        }
        System.out.println("The requested Value is not in this list");
        return -1;
        
    }
    
    
}
