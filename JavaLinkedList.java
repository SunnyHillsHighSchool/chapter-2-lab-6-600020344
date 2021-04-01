//Name -

import java.util.LinkedList;
import static java.lang.System.*;

public class JavaLinkedList
{
 private LinkedList<Integer> list;

 public JavaLinkedList()
 {
  list = new LinkedList<Integer>();
 }

 public JavaLinkedList(int[] nums)
 {
  list = new LinkedList<Integer>();
  for(int num : nums)
  {
   list.add(num);
  }
 }

 public double getSum(  )
 {
  double total=0;
  for (int i: list)
  {
    total+=i;
  }
  return total;
 }

 public double getAvg(  )
 {
  double total=0;
  for (int i: list)
  {
    total+=i;
  }
  return total/list.size();
 }

 public int getLargest()
 {
  int largest=Integer.MIN_VALUE;
  for (int i: list)
  {
    if (i>largest)
      largest = i;
  }
  return largest;
 }

 public int getSmallest()
 {
  int smallest = smallest=Integer.MAX_VALUE;
  for (int i: list)
  {
    if (i<smallest)
      smallest = i;
  }
  return smallest;
 }

 public String toString()
 {
  String output= "SUM:: " + getSum() + "\n" + "AVERAGE:: " + getAvg() + "\n" + "SMALLEST:: " + getSmallest() + "\n" + "LARGEST:: " + getLargest();
  return output;
 }
}
