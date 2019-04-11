public class Solution {
    public boolean Find(int target,int[][] array){
        int rows = array.length;
        int cols=array[0].length;
        int i=rows-1,j=0;//选取坐下角的数进行比较
        while(i>=0&&j<cols){
            if(target<array[i][j])
                i--;
            else if(target>array[i][j])
                j++;
            else
                return true;
        }
        return false;
    }
}
