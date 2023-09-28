package samples;

import org.pvp.cse.poc.pizza.exception.OutOfStockException;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
  public static void main(String[] args) throws Exception {
    ExceptionTest exceptionTest = new ExceptionTest();
    try {
      exceptionTest.checkStock(true);
      /*System.out.println("continue for order placement");
      File file = new File("");
        //file.createTempFile()
      // IO operaton file open // datanse connection
      // query aafd
      int  arr [] = null;
      int i = arr[0];*/
    }catch (OutOfStockException e) {
      System.out.println("In catch");
      throw new OutOfStockException(" Chosen Pizza is not available due to " + e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("In catch");
     // throw new RuntimeException(" Chosen Pizza is not available due to " + e.getMessage());
      // afadd
    } catch (Exception e) {
        System.out.println("In catch");
        throw new OutOfStockException(" Chosen Pizza is not available due to " + e.getMessage());
    }

    finally {
      System.out.println("In finally");
      // db connection close
      /// file.close()
    }

    System.out.println("After Exception");
    System.out.println("Continue");

  }

  public void checkStock(boolean check) throws Exception {
    ////
    ////
    /// if some thing is not expected
    if (check) {
      throw new Exception("Stock not available");
    }
  }
}
