class Parse{
  public int ParseRome(String romen){
    String[] arr = {"I", "II", "III", "IV", "V","VI","VII","VIII","IX","X"};
    for (int index = 0; index < arr.length; index++) {
        if (arr[index].equals(romen) )
            return index+1;
    }
    return -1;
  }
  public String ReturnRome(int romen){
    

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