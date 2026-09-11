public class Main
 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println("The given strings are anagram: "+anagrammethod(s,t));  
    }
    static boolean anagrammethod(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
    int[] c = new int[256];
    for(int i=0;i<s.length();i++){
        c[s.charAt(i)]++;
        c[t.charAt(i)]--;
    }
    for(int count:c){
        if(count!= 0){
            return false;
        }
    }
    return true;
    }
    
}
