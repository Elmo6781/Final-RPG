public class ArrayPopTest 
{
    private String[][] array;
    private String[] type;

    public ArrayPopTest(String[] test)
    {
        array = new String[20][20];
        type = test;
    }

    public String[][] PopulateArray()
    {
        int positionX;
        int positionY;
        for (String x: type)
        {
            positionX = (int) (Math.random()*array.length);
            positionY = (int) (Math.random()*array[0].length);
            while(array[positionX+1][positionY] != null || array[positionX-1][positionY] != null || array[positionX][positionY+1] != null || array[positionX+1][positionY-1] != null)
            {positionX = (int) (Math.random()*array.length); positionY = (int) (Math.random()*array[0].length);}
            array[positionX][positionY] = x;
            for (int i=0; i<3;i++)
            {
                positionX = (int) (Math.random()*array.length);
                positionY = (int) (Math.random()*array[0].length);
                while(!(array[positionX+1][positionY].equals(x) || array[positionX+1][positionY] == null))
                {positionX = (int) (Math.random()*array.length); positionY = (int) (Math.random()*array[0].length);}
                array[positionX][positionY] = x;






            }

        }

        return array;
    }
}
