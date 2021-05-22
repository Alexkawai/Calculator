import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main {
  public static void main(String[] args) {
     try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
      String str = reader.readLine();
      PrepareParser pp=new PrepareParser(str);
      if(pp.getFirst()!=null){
        Calculator c=new Calculator(pp.getFirst(),pp.getSecond(),pp.getOperator());
      c.calculate();
      }
      
    }
    catch(IOException ex){
              
            System.out.println(ex.getMessage());
        }  
  }
}