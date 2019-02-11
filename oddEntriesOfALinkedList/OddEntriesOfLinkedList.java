/*
    Problem: Given a head of a LinkedList and an object of the the LinkedList, convert the list to have only the odd entries of the list.
    
    ex: list[5, 8, 3, 6, 0, 2, 7] convertedList[5, 3, 0, 7]
*/

package oddEntriesOfALinkedList;

public class OddEntriesOfLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        convertToOddEntries(list.getHead(), list);
    }

    public static void convertToOddEntries(Node<T> head, LinkedList<T> list) throws Exception
    {
        if(list.size() == 1) throw new Exception("Size 1");
        else
        {
            Node<T> tempHead = head;
            Node<T> counter = tempHead;

            if((list.size()%2) == 0)
            {
                while (counter.getNext().getNext() != null)
                {
                    counter = tempHead.getNext().getNext();
                    tempHead.setNext(counter);
                    tempHead = counter;
                }
                tempHead.setNext(null);
                list.size = (list.size/2);
            }
            else
            {
                while (counter.getNext() != null)
                {
                    counter = tempHead.getNext().getNext();
                    tempHead.setNext(counter);
                    tempHead = counter;
                }
                list.size = (list.size/2) + 1;
            }
        }
    }


}
