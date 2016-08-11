public boolean catDog(String str) {
     int dogCount = str.length() - str.replace("dog", "").length();
     int catCount = str.length() - str.replace("cat", "").length();
     return dogCount==catCount;
}
