package drones;

import examples.*;

/*
 * @author - U�ur Erdem Seyfi
 * @version - 11.05.2019
 */
public class UpdatableBoard extends Board{
    public UpdatableBoard(){
        super(new RandomDrone(586,88), new SquareDrone(1194,23) );
    }
}
