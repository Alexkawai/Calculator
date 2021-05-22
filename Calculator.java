class Calculator{
  private String first;
  private String second;
  private String operator;
  
  Calculator(String firstNumber,String secondNumber,String operatorTaken){
    first=firstNumber;
    second=secondNumber;
    operator=operatorTaken;
  }
  public void calculate(){
    Operate operation = new Operate();
    
    try {
        int firstNumber = Integer.parseInt(first);
        int secondNumber = Integer.parseInt(second);
        if ((firstNumber<1 | firstNumber>10)&(secondNumber<1 | secondNumber>10)){System.out.println("Калькулятор знает цифры только от 1 до 10");}
        else{
          if (operation.decision(firstNumber,operator,secondNumber) != -1){System.out.println(operation.decision(firstNumber,operator,secondNumber));}
        else{System.out.println("Неизвестный оператор");}
        }
        
    
    } catch (NumberFormatException e) { 
      
      try{
        Parse parser = new Parse();
        int firstNumber=parser.ParseRome(first);
        int secondNumber=parser.ParseRome(second);
        if ((firstNumber<1 | firstNumber>10)&(secondNumber<1 | secondNumber>10)){System.out.println("Калькулятор знает цифры только от I до X");}
        else{
        if((firstNumber==-1) | (secondNumber==-1)){
          System.out.println("Неверный ввод числа");
        }
        else{
          if (operation.decision(firstNumber,operator,secondNumber) != -1){System.out.println(parser.ReturnRome(operation.decision(firstNumber,operator,secondNumber))); }
        else{System.out.println("Неизвестный оператор");}
          
        }}
      } 
      catch(NumberFormatException i){
        System.err.println("Неверный формат строки!");}
          
    }   

  }

  
     

}
  
   


