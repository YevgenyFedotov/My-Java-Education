public class Location {
    public int row;
    public int column;
    public double maxValue;

    public static Location locateLargest(double[][] array){
        Location location = new Location();
        location.row = 0;
        location.column = 0;
        location.maxValue = array[0][0];
        for (int row = 0 ; row < array.length ; row++){
            for(int column = 0 ; column < array[row].length ; column++){
                if (array[row][column] > location.maxValue){
                    location.row = row;
                    location.column = column;
                    location.maxValue = array[row][column];
                }
            }
        }
        return location;
    }
}
