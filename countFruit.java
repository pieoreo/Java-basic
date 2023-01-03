public claa Pratice {
    public static void countFruit(String fruit) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("grape");
        fruits.add("strawberry");
        fruits.add("pineapple");
        fruits.add("watermelon");
        fruits.add("mango");
        fruits.add("kiwis");
        fruits.add("cherry");
        fruits.add("banana");
         fruits.add("strawberry");
        fruits.add("pineapple");
        fruits.add("watermelon");
        fruits.add("watermelon");
        fruits.add("mango");
        fruits.add("kiwis");
        fruits.add("cherry");
        fruits.add("banana");
        fruits.add("strawberry");
        int cnt = 0;
        for (int i=0; i<fruits.size(); i++) {
            String f = fruits.get(i);
            if (f == fruit) {
                cnt++;
            }
        }
        return cnt;
    }
    
    public static void main(String[] args) {
      int subak = countFruit("watermelon");
      int sagwa = countFruit("apple");
      System.out.println(subak);
      System.out.println(sagwa);
  }
}  
  
