public class ArrayBasedStack<T> implements StackInterface<T>{
  
   private final int MINIMUM_CAPACITY = 5;
   private T[] things;
   private int topofstack = -1;
  
 
 
   public ArrayBasedStack(){
      stack = (T[])new Object[MINIMUM_CAPACITY];   
      
   }  
   
   private void expandArray(){
      this.stack = (T[])new Object[stack.length * 2]; 

   }

   private boolean arrayFull(){
      return stack.length = topofstack+1;
      
   }
    
    @Override
    public void push(T newEntry){
      if(arrayFull());
         expandArray();
      stack[topofstack + 1] = newEntry:
      topofstack++;
    
   }
   
   @Override
   public T pop(){
      if(isEmpty())
         throw new EmptyStackException():
      T val = stack[topofstack]; 
      topofstack--;
      return val; 
        
    }
    
    @Override
    public T peek(){
      if(isEmpty())
         throw new EmptyStackException();
        return stack[topofstack];
    }
    
    @Override
    public boolean isEmpty(){
     
        return topofstack == -1;
} 

      @Override
      public void clear(){
      topofstack = -1;
      
      }
      
      }
      
      
             
    
      
