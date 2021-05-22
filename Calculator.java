class Calc{
  private String first;
  private String second;
  private String operator;
  
  Calc(String f,String s,String o){
    first=f;
    second=s;
    operator=o;
  }
  public void calculator(){
    
    try {
        int f = Integer.parseInt(first);
        int s = Integer.parseInt(second);
        if ((f<1 | f>10)&(s<1 | s>10)){System.out.println("Калькулятор знает цифры только от 1 до 10");}
        else{
          if (decision(f,operator,s) != -1){System.out.println(decision(f,operator,s));}
        else{System.out.println("Неизвестный оператор");}
        }
        
    
    } catch (NumberFormatException e) { 
      try{
        int f=ParseRome(first);
        int s=ParseRome(second);
        if ((f<1 | f>10)&(s<1 | s>10)){System.out.println("Калькулятор знает цифры только от I до X");}
        else{
        if((f==-1) | (s==-1)){
          System.out.println("Неверный ввод числа");
        }
        else{
          if (decision(f,operator,s) != -1){System.out.println(ReturnRome(decision(f,operator,s))); }
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

  private int decision(int f,String operator,int s){
    int ans=0;
    switch(operator){
             
            case "+": 
                ans= summ(f,s);
                break;
            case "-": 
                ans=subtr(f,s);
                break;
            case "*": 
                ans= multipl(f,s);
                break;
            case "/": 
                ans= divis(f,s);
                break;
            default:
                ans= -1;
                }
    return ans;

  }
  private int ParseRome(String r){
    String[] arr = {"I", "II", "III", "IV", "V","VI","VII","VIII","IX","X"};
    for (int index = 0; index < arr.length; index++) {
        if (arr[index].equals(r) )
            return index+1;
    }
    return -1;
  }
  private String ReturnRome(int r){
    

   try{
     if (r<=0){
       return "Нет ответа римской цифрой";
     }
      else{
        String[] ones = {"","I", "II", "III", "IV", "V","VI","VII","VIII","IX","X"};
        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hunds = {"","C","CC"};
        String h = hunds[r / 100 % 10];
        String te = tens[r / 10 % 10];
        String o =  ones[r % 10];
     return h+te+o;}
    }
   catch(Exception ex){
     System.err.println("Недоступна римская цифра");
     return "error";}
   }
     

}
  
   


