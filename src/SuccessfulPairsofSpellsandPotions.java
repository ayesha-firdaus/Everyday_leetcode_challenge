import java.util.Arrays;
//2300You are given two positive integer arrays spells and potions, of length n and m respectively, where spells[i] represents the strength of the ith spell and potions[j] represents the strength of the jth potion.
//
//        You are also given an integer success. A spell and potion pair is considered successful if the product of their strengths is at least success.
//
//        Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful pair with the ith spell.
public class SuccessfulPairsofSpellsandPotions {
 static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);

        int m = potions.length;
        int b=m-1;
        int ans[] = new int[spells.length];
        int newpotion[] = new int[m];
        for (int i = 0; i < m; i++) {
            int c = (int) (success / potions[i]);
            if (success % potions[i]==0) {
                newpotion[b] = c;
            } else {
                newpotion[b] = c + 1;
            }
            b--;

        }
        for (int i = 0; i < spells.length; i++) {
            int target = spells[i];
            if (target < newpotion[0]) {
                ans[i] = 0;
            } else if (target >= newpotion[m-1]) {
                ans[i] = m;
            } else {
                int index = binary(target, newpotion);
                ans[i] =index+1;
            }
        }
        return ans;
    }
    static   int binary(int target,int []newpotion)
    {
        int start=0,end=newpotion.length-1,ans=-1;
        while(start<=end)
        {
            int m=start+(end-start)/2;
            if(newpotion[m]==target)
            {
                ans=m;
                start=m+1;
            }
            else if(newpotion[m]>target)
            {
                end=m-1;
            }
            else{
                start=m+1;
            }
        }
        if(ans==-1)
        {
            return end;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(successfulPairs(new int[]{5,1,3},new int[]{1,2,3,4,5},7));
    }
}

