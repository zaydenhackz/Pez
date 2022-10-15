class pez{
  public String name;
  public int count;
  public int MAX_COUNT = 12;
  
  public  pez(String name){
    this.name = name;
    this.count = MAX_COUNT;
    
  }

    public  pez(String name, int count){
    this.name = name;
    this.count = count;
    
  }
  public int currentCount(){
    return count;
  }

  public String currentName(){
    return this.name;
    
  }

}
