
/*
    Given a List<T> that contains all the Heap element, check if the Heap is in the correct order.
    Heap Order: element at index i is greater than i + 1 and i + 2;
 */

package hasHeapOrder;

import java.util.List;
//import ds.array.heap.Heap;

public class HasHeapOrder
{
    public static void main(String[] args)
    {
        Heap<Integer> heap = new Heap <>(8);
        heap.add(5);
        heap.add(3);
        heap.add(2);
        heap.add(8);
        heap.add(6);
        heap.add(4);
        heap.add(7);
        heap.add(1);
        System.out.println(heap);
        System.out.println(hasHeapOrder(heap.copy()));
    }
    
    private static <T extends Comparable<T>> boolean hasHeapOrder(List <T> list)
    {
        if(list.size() < 2) return true;
        
        int parent = 0;
        int leftChild = 2 * parent + 1;
        int rightChild = 2 * parent + 2;
        
        while(leftChild < list.size())
        {
            if(list.get(parent).compareTo(list.get(leftChild)) > 0)
            {
                return false;
            }
            if(rightChild < list.size())
            {
                if(list.get(parent).compareTo(list.get(rightChild)) > 0)
                {
                    return false;
                }
            }
            
            parent++;
            leftChild = 2 * parent + 1;
            rightChild = 2 * parent + 2;
        }
        
        return true;
    }
}
