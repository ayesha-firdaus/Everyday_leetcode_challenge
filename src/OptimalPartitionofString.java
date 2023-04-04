public class OptimalPartitionofString {
//    2405. Optimal Partition of String
//    Medium
//1.6K
//67
//    Companies
//    Given a string s, partition the string into one or more substrings such that the characters in each substring are unique. That is, no letter appears in a single substring more than once.
//
//    Return the minimum number of substrings in such a partition.
//
//    Note that each character should belong to exactly one substring in a partition.
    static int partitionString(String s) {
        String ans="";
        int m=0,i=0;
        while(i<s.length()){
            if(ans.indexOf(s.charAt(i))<0)
            {
                ans=ans+s.charAt(i);
                i++;
            }
            else{
                ans="";
                m++;
            }

        }
        return m+1;
    }

    public static void main(String[] args) {
        System.out.println(partitionString("abacaba"));
    }
}
