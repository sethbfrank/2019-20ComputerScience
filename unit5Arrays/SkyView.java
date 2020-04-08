public class SkyView

{
    private double[][] view;

    /** Constructs a SkyView object from a 1-dimensional array of scan data.
      * @param numRows the number of rows represented in the view
      * Precondition: numRows > 0
      * @param numCols the number of columns represented in the view
      * Precondition: numCols > 0
      * @param scanned the scan data received from the telescope, stored in telescope order
      * Precondition: scanned.length == numRows * numCols
      * Postcondition: view has been created as a rectangular 2-dimensional array
      * with numRows rows and numCols columns and the values in
      * scanned have been copied to view and are ordered as
      * in the original rectangular area of sky.
      */
    public SkyView(int numRows, int numCols, double[] scanned)
    {
        int count = 0;
        view = new double[numRows][numCols];
        for(int i = 0; i < numRows; i++)
        {
            if(i%2 == 0)
            {
                for(int x = 0; x < numCols; x++)
                {
                    view[i][x] = scanned[count];
                    count++;
                }
            } else {
                for(int x = numCols - 1; x >= 0; x--)
                {
                    view[i][x] = scanned[count];
                    count++;
                }
            }
        }     
    }

    /** Returns the average of the values in a rectangular section of view.
      *
      * @param startRow the first row index of the section
      * @param endRow the last row index of the section
      * @param startCol the first column index of the section
      * @param endCol the last column index of the section
      * Precondition: 0 <= startRow <= endRow < view.length
      * Precondition: 0 <= startCol <= endCol < view[0].length
      * @return the average of the values in the specified section of view */
    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        int count = 0;
        double total = 0;
        double average;
        for(int r = startRow; r <= endRow; r++){
            for(int c = startCol; c <= endCol; c++){
                total += view[r][c];
                count++;
            }
        }
        average = total/count;
        return average;            

    }

    /** This is a main method for testing getAverage */
    public static void main(String[] args)
    {
        double[] startArray = { 0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};
        SkyView sView = new SkyView(4,3,startArray);
        System.out.println("getAverage(1,2,0,1) should return 0.8 and returns " + sView.getAverage(1,2,0,1));
     } // end of main

} // end of class
