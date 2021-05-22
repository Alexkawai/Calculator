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
    
    try {
        int firstNumber = Integer.parseInt(first);
        int secondNumber = Integer.parseInt(second);
        if ((firstNumber<1 | firstNumber>10)&(secondNumber<1 | secondNumber>10)){System.out.println("Калькулятор знает цифры только от 1 до 10");}
        else{
          if (decision(firstNumber,operator,secondNumber) != -1){System.out.println(decision(firstNumber,operator,secondNumber));}
        else{System.out.println("Неизвестный оператор");}
        }
        
    
    } catch (NumberFormatException e) { 
      try{
        int firstNumber=ParseRome(first);
        int secondNumber=ParseRome(second);
        if ((firstNumber<1 | firstNumber>10)&(secondNumber<1 | secondNumber>10)){System.out.println("Калькулятор знает цифры только от I до X");}
        else{
        if((firstNumber==-1) | (secondNumber==-1)){
          System.out.println("Неверный ввод числа");
        }
        else{
          if (decision(firstNumber,operator,secondNumber) != -1){System.out.println(ReturnRome(decision(firstNumber,operator,secondNumber))); }
        else{System.out.println("Неизвестный оператор");}
          
        }}
      } 
      catch(NumberFormatException i){
        System.err.println("Неверный формат строки!");}
          
    }   

  }

  private int summ(int frst,int secnd){
    return frst+secnd;
  };
  private int subtr(int frst,int secnd){
    return frst-secnd;
  };
  private int multipl(int frst,int secnd){
    return frst*secnd;
  };
  private int divis(int frst,int secnd){
    return frst/secnd;
  };

  private int decision(int firstNumber,String operator,int secondNumber){
    int ans=0;
    switch(operator){
             
            case "+": 
                ans= summ(firstNumber,secondNumber);
                break;
            case "-": 
                ans=subtr(firstNumber,secondNumber);
                break;
            case "*": 
                ans= multipl(firstNumber,secondNumber);
                break;
            case "/": 
                ans= divis(firstNumber,secondNumber);
                break;
            default:
                ans= -1;
                }
    return ans;

  }
  private int ParseRome(String romen){
    String[] arr = {"I", "II", "III", "IV", "V","VI","VII","VIII","IX","X"};
    for (int index = 0; index < arr.length; index++) {
        if (arr[index].equals(romen) )
            return index+1;
    }
    return -1;
  }
  private String ReturnRome(int romen){
    

   try{
     if (romen<=0){
       return "Нет ответа римской цифрой";
     }
      else{
        String[] ones = {"","I", "II", "III", "IV", "V","VI","VII","VIII","IX","X"};
        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hunds = {"","C","CC"};
        String h = hunds[romen / 100 % 10];
        String te = tens[romen / 10 % 10];
        String o =  ones[romen % 10];
     return h+te+o;}
    }
   catch(Exception ex){
     System.err.println("Недоступна римская цифра");
     return "error";}
   }
     

}
  
   


