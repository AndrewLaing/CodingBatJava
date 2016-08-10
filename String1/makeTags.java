public String makeTags(String tag, String word) {
    String result = "<" + tag + ">";
    result += word;
    result += "</" + tag + ">";

    return result;
}
