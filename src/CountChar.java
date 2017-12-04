class CountChar
{
    public static void main(String[] args)
    {
        String s = "Jv avi";
 
        char c = 'a';
        System.out.println(s.length());
        int count = s.length() - s.replace("a", "").length();
        System.out.println("Number of occurances of 'a' in "+s+"\n = "+count);
    }
}