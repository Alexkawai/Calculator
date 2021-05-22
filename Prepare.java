class Prepare{
  private String first;
  private String second;
  private String operator;
  Prepare(String s){
    try{String[] words = s.split(" ");
    if (words.length==3){
      first=words[0];
    operator=words[1];
    second=words[2];}
    else{System.out.println("Неверный ввод строки");}
    }
    catch(Exception e){
      System.out.println("Неверный ввод строки");
    }
  }
  /**
   * @return the first
   */
  public String getFirst() {
    return first;
  }
  /**
   * @return the operator
   */
  public String getOperator() {
    return operator;
  }
  /**
   * @return the second
   */
  public String getSecond() {
    return second;
  }
}