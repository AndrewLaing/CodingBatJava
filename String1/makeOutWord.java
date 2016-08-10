public String makeOutWord(String out, String word) {
    String result = out.substring(0,2);
    
    result += word;
    result += out.substring(2);
    return result;
}
