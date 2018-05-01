/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobbertestquestions;

/**
 *
 * @author agyep
 */
public class SpiralArrayQuestion {
    
    void returnSpiral(int num){
        
        // Setting dimensions of array
        int[][] spiralArray = new int[num][num];
        
        // Count = Value we insert in array cells
        int count = 1;
        
        int minEdge = 0; // One side of array border
        int maxEdge = num -1; // Other side of array border
        
        int numOfLoops = (int) Math.round(num/2.0); // Number of layers array has
        
        // Each loop puts you one layer deeper. LoopNum adjusts the dimensions accordingly
        for(int loopNum = 0; loopNum < numOfLoops; loopNum++){
            
            // Loop for upper wall
            for(int i = minEdge + loopNum; i <= maxEdge - loopNum; i++){
                spiralArray[loopNum][i] = count;
                count++;
                
                /*  If the array has an odd number for the length of its walls,
                    it's innermost layer will consist of a single cell. 
                    Hence, we only need the initial wall loop to populate that cell
                */
                if(loopNum == numOfLoops && num%2 == 1){
                    break;
                }
                
                // When we get to the end of the top wall, start moving downwards
                if(i == maxEdge-loopNum){
                    for(int j = minEdge + loopNum + 1; j <= maxEdge - loopNum; j++){
                        spiralArray[j][i] = count;
                        count++;
                        
                        // When we get to the bottom, start moving left
                        if(j==maxEdge-loopNum){
                            for(int k = maxEdge - loopNum - 1; k >= minEdge + loopNum; k--){
                                spiralArray[j][k] = count;
                                count++;
                                
                                /*  For array blocks with even numbered walls,
                                    the innermost layer will be fully traversed
                                    after doing the third loop
                                    because the layer will always be 2x2
                                */
                                if(loopNum == numOfLoops && num%2 == 0){
                                    break;
                                }
                                
                                // When you hit the end of the bottom wall, move up
                                if(k == minEdge+loopNum){
                                    for(int m = maxEdge - loopNum - 1; m >= minEdge + loopNum + 1; m--){
                                        spiralArray[m][k] = count;
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        printArray(spiralArray);
    }
    
    void printArray(int[][] array){
        for(int[] row: array){
            for(int cell: row){
                System.out.print("| " + cell + " |");
            }
            System.out.println(""); 
        }
        System.out.println("");
    }
}
