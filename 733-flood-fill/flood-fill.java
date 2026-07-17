class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldc = image[sr][sc];
        if(oldc == color){
            return image;
        }
        flood(image , sr , sc , oldc , color);
        return image;
    }
    private void flood(int[][] image , int r , int c , int oldc , int nc){
        if(r < 0 || c < 0 || r >= image.length || c >= image[0].length){
            return;
        }
        if(image[r][c] != oldc){
            return;
        }
        image[r][c] = nc;

        flood(image, r - 1 , c , oldc , nc);
        flood(image, r + 1 , c ,  oldc , nc);
        flood(image, r  , c + 1 , oldc , nc);
        flood(image, r  , c - 1 , oldc , nc);
    }
}