import java.util.Random;

public class Listy<T> implements RandomizedList<T> {

   private int size;
   private T[] array;
   
   
   public boolean isEmpty() {
      if (size == 0) {
         return true;
      }
      return false;
   }
   
   public void add(T element) {
      if (isFull()) {
         resize(array.length * 2);
      }
      array[size] = element;
      size++;
   }
   
   public boolean isFull() {
      if (size == array.length) {
         return true;
      }
      else {
         return false;
      }
   }
   
   public void resize(int n) {
      T[] temp = (T[]) new Object[n];
      for (int i = 0; i < n; i++) {
         temp[i] = array[i];
      }
      array = temp;
   }
   
   /**
   * Removes an element at random.
   */
   public T remove() {
      if (isEmpty()) {
         return null;
      }
      Random randomGenerator = new Random();
      int randomIndex = Random.nextInt(size);
   }
   
}