class Operate{
  
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

  public int decision(int firstNumber,String operator,int secondNumber){
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
}