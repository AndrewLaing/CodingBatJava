public String withoutString(String base, String remove) {
     remove = "(?i)" + remove;
     return base.replaceAll(remove, "");
}
