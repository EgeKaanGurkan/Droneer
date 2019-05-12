package drones;

import examples.*;

/*
 * @author - U�ur Erdem Seyfi
 * @version - 11.05.2019
 */
public class UpdatableBoard extends Board{
    public UpdatableBoard(){
        super(new SquareDrone(176,303), new RandomDrone(154,616) );
    }
}
