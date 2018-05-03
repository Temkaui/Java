public class StringManipulator {
    public String trimAndConcat(String stringone, String stringtwo){
        return stringone.trim()+stringtwo.trim();
    }
    public int getIndexOrNull(String fullstring, char findchar){
        return fullstring.indexOf(findchar);
    }
    public int getIndexOrNull(String fullstring, String findstring){
        return fullstring.indexOf(findstring);
    }
    String concatSubstring(String stringone, int start, int end, String stringtwo) {
        return stringone.substring(start,end)+stringtwo;
    }
}