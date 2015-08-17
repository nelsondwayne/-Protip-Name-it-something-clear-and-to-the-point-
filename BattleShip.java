import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

public class BattleShip
{
    public static void main (String args[]){
        String map [][][]=new String [10][10][2];
        int row =0,col=0;

        //initPlayerMap(map);
        //printMap(map,true);// true to printout the map
        placeShips(map); // place the ship at computer map
        initMap(map,"~", true);
        initMap(map,"#",false);
        placeShips(map); // place the ship at computer map
        printMap(map,true);
        System.out.println("Now enter your coordinate of the boom");
        row = getInput("Please enter row: ");
        col = getInput("Please enter col: ");
        printMap(map,false); // computer map
        hitShip(row,col);

    }

    private static void hitShip (int row, int col){
        int startFrom = 0;
		Object[][][] map = null;
		if (map[startFrom++][col==row][1]== map[row][col][1]){
            System.out.println("abc");
        }
        else
        {
            System.out.println("darn!");
        }
    }
    private static void initMap(String map[][][] , String initChar, boolean player){
        //the 0 in 3rd dimension is representing player map and 1 for computer
        int mapNo= (player?0:1);
        for (int i = 0 ; i < 10; i ++)
            for (int j=0; j<10; j++)
                map [i][j][mapNo]= initChar;
    }

    private static void printMap(String map[][][], boolean player){
        int whichMap=0;
        if (!player)
            whichMap=1;

        System.out.println(" 0\t1\t2\t3\t4\t5\t6\t7\t8\t9 ");
        for (int i = 0 ; i < 10; i ++){
            System.out.print(i+" ");
            for (int j=0; j<10; j++){
                System.out.print(map [i][j][whichMap]+ "\t");
            }
            System.out.print("\n");
        }
    }// end of printMap method

    public static int getInput(String message){
        Scanner sc = new Scanner (System.in);
        System.out.print(message);
        return sc.nextInt(); }
        

    private static void placeShips(String[][][] grid)
    {
        char[] shipType = { 'B' , 'C' , 'F' , 'M' };
        int[] shipSize = { 5 , 4 , 3 , 2 };
        int[] shipNums = { 1 , 2 , 4 , 4 };

        for (int x = 0 ; x < shipType.length ; x++)
            for (int y = 1 ; y <= shipNums[x] ; y++)
            {

                String shipName = shipType[x]+""+y;
                placeShip(grid,shipName,shipSize[x] );
                }
    }
                

    private static void placeShip(String[][][] map, String shipName, int size){
        int direction = (int)(Math.random()*2);// 0 or 1
        int colOrRow = (int)(Math.random()*map.length); // pick
        int startFrom =(int)(Math.random()*(map.length-size)); // which cell?


        // placing the ship
        for(int i=0; i < size; i++){
            // weather is vertical or horizontal
            // vertical
            if (direction == 0 ){
            map[startFrom++][colOrRow][1] = shipName;

            }
            else {
                map[colOrRow][startFrom++][1] = shipName; 
                
            }
            
            
        }
    }
}
            
        
   
