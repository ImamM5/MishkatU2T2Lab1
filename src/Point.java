public class Point
{
    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y= y;
    }

    public Point (int val)
    {
        x = val;
        y = val;
    }

    public Point()
    {
        x = 0;
        y = 0;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int newX)
    {
        x = newX;
    }
    public void setY(int newY)
    {
        y = newY;
    }

    public String coordinate()
    {
        return "("+x +", "+ y +")";
    }

    public String quadrant()
    {
        String quadrant;
        if (x > 0 && y > 0)
        {
            quadrant = "I";
        } else if (x < 0 && y > 0)
        {
            quadrant = "II";
        } else if (x < 0 && y < 0)
        {
            quadrant = "III";
        } else if (x > 0 && y < 0)
        {
            quadrant = "IV";
        } else if (x == 0 && y == 0)
        {
            quadrant = "origin";
        } else //if ((x == 0 && ((y > 0) || (y < 0)) || ((x > 0) || (x < 0)) && y ==0))
        {
            quadrant = "on an axis";
        }
        return quadrant;
    }

}
