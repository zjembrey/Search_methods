package collection;

import java.util.ArrayList;
import java.util.Vector;
import java.util.Collection;
import java.util.List;


/**
 *
 * @author user
 */
public class MyVector implements Cloneable
{
    Vector list = new Vector();
    Object list1 = new Object[1];
    
    public void append(Object element)
    {
      list.add(element);
      //int x = list1.length;
        //list.insertElementAt(element,list.size());
    }
    public void clear()
    {
        //list.clear();
        for(int x = 0;x<list.size()-1;x++)
        {
            list.remove(x);
        }
    }
    public boolean contains(Object element)
    {
        for(int x=0;x<list.size()-1;x++)
        {
            if(list.get(x) == element)
            {
                return true;
            }
        }
        return false;
            
    }
    public Object elementAt(int index)
    {
        //return list.get(index);
                for(int x=0;x<list.size();x++)
                {
                    if(x == index)
                    {
                        return list.get(x);
                    }
                }
                return null;

    }
    
    public int indexOf(Object element)
    {
        //return list.indexOf(element);
        for(int x=0;x<list.size()-1;x++)
        {
           if(list.get(x) == element)
           {
               return x;
           }
        }
        return -1;
    }
    
    public void insertAt(int index, Object element)
    {
       // list.add(index,element);
        for(int x=0;x<list.size()-1;x++)
        {
            if(x==index)
            {
           list.add(x,element);
            }
        }
    }
    public boolean isEmpty()
    {
         for(int x=0;x<list.size()-1;x++)
        {
           if(list.get(x) != null)
           {
               return false;
           }
        }
         return true;
    }
    public void removeAt(int index)
    {
        //list.remove(index);
        
         for(int x=0;x<list.size()-1;x++)
                {
                    if(x== index)
                    {
                        list.remove(x);
                    }
                }
        
    }
    public void remove(Object element)
    {
        //list.remove(element);
        
        for(int x =0;x<list.size()-1;x++)
        {
            if(list.get(x)==element)
            {
                for(int c =x;x<list.size()-2;c++)
                 {
                     list.set(c,list.get(x+1));
            
                 }
            }
            
            
        }
    }
    public void replace(int index,Object element)
    {
        list.set(index,element);
    }
    public int size()
    {
        return list.size();
    }
    public void ensureCapacity(int minCapacity)
    {
        if(list.size() < minCapacity)
        {
            list.setSize(minCapacity);
        }
        
    }
    public MyVector clone()
    {
        MyVector temp = new MyVector();
        for(int x=0;x<list.size();x++)
        {
            temp.append(list.get(x));
        }
       return temp;
    }
    public void removeRange(int fromIndex, int toIndex)
    {
        for(int x =fromIndex;x < toIndex-1 ; x++)
        {
            list.remove(x);
        }
       
    }
    public String toString()
    {
        return list.toString();
    }
    public void reverse()
    {
        //Vector temp = new Vector(list.size()-1);
        int size = list.size()-1;
        for(int x=0;x<(list.size()-1) /2;x++)
        {
            Object temp = list.get(x);
            list.set(x,list.get(size-x-1));
            list.set(size-1-x,temp);
            
            
        }
        //list = temp;
    }
    public void merge(MyVector vector2)
    {
        for(int x = 0;x<vector2.size();x++)
        {
            list.add(vector2.elementAt(x));
            
        }
       
    }
    
    
    
}
